/**
 * Copyright 2000-present Liferay, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package it.vmt.gh.web.portlet;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.http.HttpServletRequest;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.workflow.WorkflowConstants;

import it.vmt.gh.web.portlet.constants.GreenHouseManagerPortletKeys;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.green-house",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.name=" + GreenHouseManagerPortletKeys.ACTIVATION,
		"javax.portlet.display-name=Activation",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.init-param.view-template=/useractivationportlet/view.jsp"
	},
	service = Portlet.class
)
public class UserActivationPortlet extends MVCPortlet {

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		boolean resultCode = Boolean.FALSE;
		ThemeDisplay themeDisplay = (ThemeDisplay)renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		HttpServletRequest httpReq = PortalUtil.getOriginalServletRequest(PortalUtil.getHttpServletRequest(renderRequest));
		try {
			long id = Long.parseLong(httpReq.getParameter("id"));
			if(id > 0) {
				User user = _userLocalService.fetchUser(id);
				if(Validator.isNotNull(user)) {
					if(WorkflowConstants.STATUS_APPROVED != user.getStatus()) {
						try {
							_userLocalService.updateStatus(id, WorkflowConstants.STATUS_APPROVED, ServiceContextFactory.getInstance(httpReq));
						} catch (PortalException e) {
							_log.fatal(e.getMessage());
							SessionErrors.add(renderRequest, "activate-user-failure");
						}
						renderRequest.setAttribute("emailAddress", user.getEmailAddress());
						renderRequest.setAttribute("firstPassword", "pass4" + user.getFirstName().toLowerCase());
						renderRequest.setAttribute("user", user);
						resultCode = Boolean.TRUE;
						SessionMessages.add(renderRequest, "activate-user-success");
					}else {
						resultCode = Boolean.FALSE;
						renderRequest.setAttribute("user", user);
						SessionMessages.add(renderRequest, "user-already-active");
					}
				}else {
					SessionErrors.add(renderRequest, "user-not-found-failure");
				}
			}else {
				SessionErrors.add(renderRequest, "activate-user-failure");
			}
		}catch(NumberFormatException e) {
			SessionErrors.add(renderRequest, "activate-user-failure");
		}
		renderRequest.setAttribute("resultCode", resultCode);
		super.doView(renderRequest, renderResponse);
	}
	
	@Reference
	private UserLocalService _userLocalService;
	@Reference
	private RoleLocalService _roleLocalService;
	
	private static final Log _log = LogFactoryUtil.getLog(UserActivationPortlet.class.getName());
}
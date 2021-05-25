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
package it.vmt.gh.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.UserGroup;
import com.liferay.portal.kernel.service.UserGroupLocalServiceUtil;
import com.liferay.portal.kernel.struts.LastPath;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;

@Component(immediate = true, property = { "key=login.events.post" }, service = LifecycleAction.class)
public class GreenHouseWebLoginPostAction implements LifecycleAction {

	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {

		HttpServletRequest request = lifecycleEvent.getRequest();
		HttpServletResponse response = lifecycleEvent.getResponse();
		HttpSession session = request.getSession();
		String redirect = ParamUtil.get(request, "redirect", "/");
		try {
			User currentUser = PortalUtil.getUser(request);
			UserGroup customer = UserGroupLocalServiceUtil.fetchUserGroup(PortalUtil.getDefaultCompanyId(), "GH-CUSTOMER");
			LastPath lastPath = null;
			_log.info("USER|" + currentUser.getFirstName() + "|" + currentUser.getGroup().toString());
			_log.info("LASTPATH|" + session.getAttribute("LAST_PATH"));
			if(Validator.isNotNull(customer) && UserGroupLocalServiceUtil.hasUserUserGroup(currentUser.getUserId(), customer.getUserGroupId())) {
				lastPath = new LastPath("/user", currentUser.getScreenName() + "/~/" + customer.getUserGroupId() + "/carts");
			}else {
				lastPath = new LastPath("", redirect);
			}
			session.setAttribute(WebKeys.LAST_PATH, lastPath);
			response.sendRedirect(lastPath.getContextPath() + "/" + lastPath.getPath());
		} catch (PortalException | IOException exception) {
			_log.error(exception);
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(GreenHouseWebLoginPostAction.class.getName());
}
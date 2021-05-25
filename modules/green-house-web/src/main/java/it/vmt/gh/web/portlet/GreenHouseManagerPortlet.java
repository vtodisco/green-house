package it.vmt.gh.web.portlet;

import it.vmt.gh.web.portlet.constants.GreenHouseManagerPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author todisco
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.green-house",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=GreenHouseManager",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + GreenHouseManagerPortletKeys.GREENHOUSEMANAGER,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class GreenHouseManagerPortlet extends MVCPortlet {
}
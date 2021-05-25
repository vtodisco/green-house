<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://liferay.com/tld/captcha" prefix="liferay-captcha"%>

<portlet:resourceURL var="captchaURL" />

<div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<liferay-ui:success key="activate-user-success"
				message="common.message.activation.success" />
			<liferay-ui:success key="user-already-active"
				message="common.message.activation.active" />
			<liferay-ui:error key="activate-user-failure"
				message="common.message.activation.failure" />
			<liferay-ui:error key="user-not-found-failure"
				message="common.message.activation.user-not-found.failure" />
		</div>
	</div>
	<c:choose>
		<c:when test="${resultCode == true}">
			<h2>
				<liferay-ui:message key="registration.account" />
				<c:out value="${emailAddress}" />
			</h2>
			<h2>
				<liferay-ui:message key="registration.password" />
				<c:out value="${firstPassword}" />
			</h2>
			<h1>
				<liferay-ui:message key="registration.pwd-change" />
			</h1>
		</c:when>
		<c:otherwise>
			<h1>
				<liferay-ui:message key="registration.active-or-failed" />
			</h1>
		</c:otherwise>
	</c:choose>
	<c:if test="${resultCode == true}">
		<hr />
	</c:if>
</div>

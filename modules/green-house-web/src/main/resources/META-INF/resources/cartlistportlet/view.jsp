<%--
/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%><%@
taglib
	uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%><%@
taglib
	uri="http://liferay.com/tld/theme" prefix="liferay-theme"%><%@
taglib
	uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

<portlet:defineObjects />

<liferay-theme:defineObjects />

<div class="container-fluid">
	<c:forEach items="${carts}" var="cart">
		<div class="row">
			<div class="col-md">
				<c:out value="${cart.cartUser.fullName}" />
			</div>
			<div class="col-md">
				<c:choose>
					<c:when test="${cart.status == 0}">
						<i class="icon-ok"></i> (confermato)</c:when>
					<c:otherwise>(non confermato)</c:otherwise>
				</c:choose>
			</div>
			<div class="col-md">
				Importo:
				<c:out value="${cart.total}" />
				<i class="icon-euro"></i>
			</div>
			<div class="col-md">
				<i class="icon-money"></i> Sconto in fattura:
				<c:choose>
					<c:when test="${cart.invoiceDiscount == 'true'}"> (SI)</c:when>
					<c:otherwise>(NO)</c:otherwise>
				</c:choose>
			<div class="col-md">
				<a href="${cart.offerUrl}" target="_blank">APRI OFFERTA <i class="icon-file"></i>
				</a>
			</div>
			</div>
			<div class="col-md">
				<a href="${baseConfiguratorUrl}?cartId=${cart.cartId}" class="btn btn-default">VAI ALLA
					CONFIGURAZIONE <i class="icon-share"></i>
				</a>
			</div>
		</div>
	</c:forEach>
</div>
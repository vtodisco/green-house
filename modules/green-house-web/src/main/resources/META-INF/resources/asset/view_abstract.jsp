<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%><%@
taglib
	uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%><%@
taglib
	uri="http://liferay.com/tld/theme" prefix="liferay-theme"%><%@
taglib
	uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

<div class="container-fluid">
	<div class="row">
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
		</div>
	</div>
	<hr />
	<a href="${dashboardUrl}" class="btn btn-secondary">VAI ALLA
		CONFIGURAZIONE <i class="icon-cog"></i>
	</a>
	<a href="javascript:void" class="btn btn-secondary" onclick="getUserDetails(${cart.cartId})">VAI AI DETTAGLI
		UTENTE <i class="icon-user"></i>
	</a>
	<a href="${cart.offerUrl}" class="btn btn-secondary" target="_new">VISUALIZZA PREVENTIVO <i class="icon-file"></i>
	</a>
	<hr />
</div>
<aui:script>
	const getUserDetails = (cartId) => {
	console.log("FIRING EVENT FOR USER DETAILS");
		Liferay.fire("cart-user-details", {cartId: cartId});
	}
</aui:script>

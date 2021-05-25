<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://liferay.com/tld/captcha" prefix="liferay-captcha"%>

<div class="container-fluid">
	<div class="row">
		<div class="col-md">
			<liferay-ui:success key="vendor-creation-success"
				message="vendor.message.save.success" />
			<liferay-ui:error key="vendor-creation-failure"
				message="vendor.message.save.failure" />
			<liferay-ui:error key="validation-failure"
				message="common.message.validation.failure" />
			<liferay-ui:error key="permission-failure"
				message="common.message.permission.failure" />
			<liferay-ui:error key="captcha-verification-failure"
				message="common.message.captcha.failure" />
		</div>
	</div>
</div>
<div class="container-fluid">
	<aui:form action="">
		<aui:input name="userId" type="hidden" value="${user.userId}" />
		<aui:input name="cartId" type="hidden" value="${cart.cartId}" />
		<aui:fieldset-group markupView="lexicon">
			<aui:fieldset label="cart.user-info.fieldset-label" markupView="lexicon">
				<aui:row>
					<aui:col width="50">
						<aui:input name="userFirstName" type="text"
							label="cart.user.firstname.label" value="${user.firstName}">
							<aui:validator name="required" />
						</aui:input>
					</aui:col>
					<aui:col width="50">
						<aui:input name="userLastName" type="text"
							label="cart.user.lastname.label" value="${user.lastName}">
							<aui:validator name="required" />
						</aui:input>
					</aui:col>
				</aui:row>
				<aui:row>
					<aui:col width="50">
						<aui:input name="userEmailAddress" type="text"
							label="cart.user.email.label" value="${user.emailAddress}">
							<aui:validator name="email" />
						</aui:input>
					</aui:col>
					<aui:col width="50">
						<aui:input name="userPhone" type="text"
							label="cart.user.phone.label" value="${phone.number}">
							<aui:validator name="number" />
						</aui:input>
						<a href="javascript:void(0)" onclick="addPhone(${user.userId})" id="<portlet:namespace />phone-confirm" class="pull-right">Conferma telefono <i class="icon-ok"></i></a>
					</aui:col>
				</aui:row>
				<aui:row>
					<aui:col width="100">
						<aui:input name="addressInput" type="text" label="" />
					</aui:col>
				</aui:row>
				<aui:row>
					<aui:col width="100">
						<aui:input name="street" type="text" label="cart.user.street.label" value="${address.street1}" />
					</aui:col>
				</aui:row>
				<aui:row>
					<aui:col width="50">
						<aui:input name="placeName" type="text" label="cart.user.place.label" value="${address.city}" />
					</aui:col>
					<aui:col width="50">
						<aui:input name="placeZip" type="text" label="cart.user.zip.label" value="${address.zip}" />
					</aui:col>
				</aui:row>
				<aui:row>
					<aui:col width="50">
						<aui:input name="province" type="text" label="cart.user.province.label" value="${address.region.name}" />
					</aui:col>
					<aui:col width="50">
						<aui:input name="iso" type="text" label="cart.user.country.label" value="${address.country.name}" />
					</aui:col>
				</aui:row>
				<aui:row>
					<aui:col width="100">
						<a href="javascript:void(0)" onclick="addAddress(${user.userId})" id="<portlet:namespace />address-confirm">Conferma indirizzo <i class="icon-ok"></i></a>
					</aui:col>
				</aui:row>
			</aui:fieldset>
		</aui:fieldset-group>
	</aui:form>
</div>

<script data-senna-track="temporary">
AUI().ready(function(A){
    var addressInput = (document.getElementById("<portlet:namespace />addressInput"));
    
	var autocomplete = new google.maps.places.Autocomplete(addressInput);
	autocomplete.setTypes(['geocode']);
	google.maps.event.addListener(autocomplete, 'place_changed', function() {
		var place = autocomplete.getPlace();
		var placeDetails = place.address_components;
		if(Array.isArray(placeDetails)){
			console.log(placeDetails);
			for(var i=0; i < placeDetails.length; i++){
				if(placeDetails[i].types[0] == 'route'){
					street = placeDetails[i].long_name;
					$("#<portlet:namespace />street").val(street);
					console.log("Address: "+street);
				}else if(placeDetails[i].types[0] == 'locality'){
					city = placeDetails[i].long_name;
					$("#<portlet:namespace />placeName").val(city);
					console.log("City: "+city);
				}else if(placeDetails[i].types[0] == 'administrative_area_level_2'){
					province = placeDetails[i].long_name;
					provinceCode = placeDetails[i].short_name;
					$("#<portlet:namespace />province").val(provinceCode);
					console.log("Province: "+provinceCode);
				}else if(placeDetails[i].types[0] == 'administrative_area_level_1'){
					region = placeDetails[i].long_name;
					console.log("Region: "+region);
				}else if(placeDetails[i].types[0] == 'country'){
					country = placeDetails[i].long_name;
					countryA2 = placeDetails[i].short_name;
					$("#<portlet:namespace />iso").val(countryA2);
					console.log("Country: "+countryA2);
				}else if(placeDetails[i].types[0] == 'postal_code'){
					zip = placeDetails[i].long_name;
					$("#<portlet:namespace />placeZip").val(zip);
					console.log("ZIP: "+zip);
				}
			}
		}
	});
});

Liferay.on("cart-user-details", function(event){
	console.log("EVENT CART-USER-DETAILS CAPTURED", event);
	Liferay.Portlet.refresh("#p_p_id<portlet:namespace/>", {<portlet:namespace/>cartId: event.cartId});
});

function addPhone(userId){
		var number = $("#<portlet:namespace />userPhone").val();
		Liferay.Service(
		  '/gh.cart/add-phone',
		  {
		    userId: userId,
		    number: number
		  },
		  function(obj) {
		    console.log(obj);
		  }
		);
}

function addAddress(userId){
	var street = $("#<portlet:namespace />street").val();
	var number = "";
	var city = $("#<portlet:namespace />placeName").val();
	var zip = $("#<portlet:namespace />placeZip").val();
	var country = $("#<portlet:namespace />iso").val();
	var province = $("#<portlet:namespace />province").val();

	Liferay.Service(
	  '/gh.cart/add-address',
		  {
		    userId: userId,
		    street: street,
		    number: number,
		    city: city,
		    zip: zip,
		    countryA3: country,
		    regionCode: province
		  },
		  function(obj) {
		    console.log(obj);
		  }
		);
}
</script>

<script
	src="https://maps.googleapis.com/maps/api/js?key=AIzaSyByqXs8ISCPRKnzfWn5zggx_LCPn3dVAy0&v=3.exp&signed_in=true&libraries=places"
	type="text/javascript"
	data-senna-track="temporary"></script>
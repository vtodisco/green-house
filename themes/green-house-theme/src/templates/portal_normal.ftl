<!DOCTYPE html>

<#include init />

<html class="${root_css_class}" dir="<@liferay.language key="lang.dir" />" lang="${w3c_language_id}">

<head>
	<meta name="google-site-verification" content="${google_meta_tag_content}" />
	<link rel="preload" href="https://fonts.googleapis.com/css?family=Montserrat&display=swap" as="style">
	<title>${html_title}</title>

	<meta content="initial-scale=1.0, width=device-width" name="viewport" />

	<@liferay_util["include"] page=top_head_include />
</head>

<body class="${css_class}">
<!--
<@liferay_ui["quick-access"] contentId="#main-content" />
-->
<@liferay_util["include"] page=body_top_include />

<div class="d-flex flex-column min-vh-100">
	<#if theme_display.getPermissionChecker().isOmniadmin()>
		<@liferay.control_menu />
	</#if>
	<div class="d-flex flex-column flex-fill" id="wrapper">
		<#if show_header>
			<header id="banner" style="background-image:url(${site_logo}); background-repeat: no-repeat; padding: 0; margin: 0; background-size: cover; height: 334px; padding-top: 200px;">
				<div class="navbar navbar-classic navbar-top py-3">
					<div class="container user-personal-bar">
						<div class="align-items-center autofit-row">
							<!--
							<a class="${logo_css_class} align-items-center d-md-inline-flex d-sm-none d-none logo-md" href="${site_default_url}" title="<@liferay.language_format arguments="" key="go-to-x" />">
								<img alt="${logo_description}" class="mr-2" height="56" src="${site_logo}" />

								<#if show_site_name>
									<h2 class="font-weight-bold h2 mb-0 text-dark" role="heading" aria-level="1">${site_name}</h2>
								</#if>
							</a>
							-->
							<#assign preferences = freeMarkerPortletPreferences.getPreferences({"portletSetupPortletDecoratorId": "barebone", "destination": "/search"}) />
							<!--
							<div class="autofit-col autofit-col-expand">
								<#if show_header_search>
									<div class="justify-content-md-end mr-4 navbar-form" role="search">
										<@liferay.search_bar default_preferences="${preferences}" />
									</div>
								</#if>
							</div>

							<div class="autofit-col">
								<@liferay.user_personal_bar />
							</div>
							-->
						</div>
					</div>
				</div>

				<div data-nosnippet class="navbar navbar-classic navbar-expand-md navbar-light pb-3">
					<div class="container">
						<!--
						<a class="${logo_css_class} align-items-center d-inline-flex d-md-none logo-xs" href="${site_default_url}" rel="nofollow">
							<img alt="${logo_description}" class="mr-2" height="56" src="${site_logo}" />

							<#if show_site_name>
								<h2 class="font-weight-bold h2 mb-0 text-dark">${site_name}</h2>
							</#if>
						</a>
						-->
						<#include "${full_templates_path}/navigation.ftl" />

						<div data-nosnippet class="autofit-col" style="padding-top: 8px">
							<#if is_signed_in>
								<#if theme_display.getPermissionChecker().isOmniadmin()>
									<@liferay.user_personal_bar />
								<#else>
									<a href="/c/portal/logout" class="btn btn-secondary">ESCI</a>
								</#if>
							<#else>
								<a href="/c/portal/login" class="btn btn-secondary">ENTRA</a>
							</#if>
						</div>
					</div>
				</div>
			</header>
		</#if>

		<section class="${portal_content_css_class} flex-fill" id="content">
			<h2 class="sr-only" role="heading" aria-level="1">${the_title}</h2>

			<#if selectable>
				<@liferay_util["include"] page=content_include />
			<#else>
				${portletDisplay.recycle()}

				${portletDisplay.setTitle(the_title)}

				<@liferay_theme["wrap-portlet"] page="portlet.ftl">
					<@liferay_util["include"] page=content_include />
				</@>
			</#if>
		</section>

		<#if show_footer>
			<footer id="footer" role="contentinfo">
				<div class="container">
					<div class="row">
						<div class="col-md-12 text-center text-md-left">
							<@liferay.language key="powered-by" />

							<a class="text-white" href="http://www.liferay.com" rel="external">Liferay</a>
						</div>
					</div>
				</div>
			</footer>
		</#if>
	</div>
</div>

<@liferay_util["include"] page=body_bottom_include />

<@liferay_util["include"] page=bottom_include />

</body>

</html>
<!-- Global site tag (gtag.js) - Google Analytics -->
<script async src="https://www.googletagmanager.com/gtag/js?id=${google_tracking_id}"></script>
<!--
<script>
  window.dataLayer = window.dataLayer || [];
  function gtag(){dataLayer.push(arguments);}
  gtag('js', new Date());

  gtag('config', '${google_tracking_id}');
</script>
-->
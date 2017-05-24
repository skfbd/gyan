<%@ page pageEncoding="UTF-8"%>
<%@ include file="includes.jsp"%>
<%@ page session="true"%>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE8" />
<title>Edu Information System</title>
<meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
<!-- Bootstrap 3.3.4 -->
<link media="screen" rel="stylesheet" href="<c:url value="/bootstrap/css/bootstrap.min.css"/>" type="text/css"></link>

<!-- Font Awesome Icons -->
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
<!-- Ionicons -->
<link href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css" rel="stylesheet" type="text/css" />
<!-- Theme style -->
<link href="<c:url value="/dist/css/AdminLTE.min.css"/>" rel="stylesheet" type="text/css" />
<link href="<c:url value="/dist/css/skins/skin-blue.min.css"/>" rel="stylesheet" type="text/css" />

</style>


<!-- REQUIRED JS SCRIPTS -->


<!-- Bootstrap 3.3.2 JS -->
<script src="<c:url value="/bootstrap/js/bootstrap.min.js"/>"></script>
<!-- AdminLTE App -->
<script src="<c:url value="/dist/js/app.min.js"/>"></script>
<!-- jQuery 2.1.4 -->
<script src="<c:url value="/plugins/jQuery/jQuery-2.1.4.min.js"/>"></script>
</head>

<body class="login-page">

	<div class="container-fluid">
		<div class="row">
			<tiles:insertAttribute name="content" />
		</div>
	</div>

	<ul style="z-index: 1; top: 0px; left: 0px; display: none;" aria-activedescendant="ui-active-menuitem" role="listbox"
		class="ui-autocomplete ui-menu ui-widget ui-widget-content ui-corner-all">
	</ul>
<body>
</html>
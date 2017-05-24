<%@ page pageEncoding="UTF-8"%>
<%@ include file="includes.jsp"%>
<%@ page session="true"%>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE8" />
<title>Edu Information System</title>
<meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
<link media="screen" rel="stylesheet" href="<c:url value="/bootstrap/css/bootstrap.min.css"/>" type="text/css"></link>
<link media="screen" rel="stylesheet" href="<c:url value="/bootstrap/css/bootstrap.css"/>" type="text/css"></link>
<link media="screen" rel="stylesheet" href="<c:url value="/css/font-awesome-4.4.0/css/font-awesome.min.css"/>" type="text/css"></link>
<link media="screen" rel="stylesheet" href="<c:url value="/css/ionicons-2.0.1/css/ionicons.min.css"/>" type="text/css"></link>
<link href="<c:url value="/dist/css/AdminLTE.min.css"/>" rel="stylesheet" type="text/css" />
<link href="<c:url value="/dist/css/skins/skin-blue.min.css"/>" rel="stylesheet" type="text/css" />
<script src="<c:url value="/plugins/jQuery/jQuery-2.1.4.min.js"/>"></script>
<script src="<c:url value="/bootstrap/js/bootstrap.min.js"/>"></script>

<!-- ATTENTION
 - Please do not include easyui scripts on this page, as bootstrap and easyui do not work fine
 - easyui-2.4.1 uses jquery 1.9.3 so include both the scripts locally on a page.
 - Bootstarp needs an upgraded jquery version to we need to keep it 2.1.4 -->

</head>


<body class="skin-blue  sidebar-mini">
	<div class="wrapper">
		<tiles:insertAttribute name="header" />
		<!-- Left side column. contains the logo and sidebar -->
		<tiles:insertAttribute name="menu" />
		<!-- Content Wrapper. Contains page content -->

		<div class="content-wrapper" >
			<!-- Content Header (Page header) -->

			<!-- Main content -->
			<section class="content" style="padding:0px;">
				<!-- Small boxes (Stat box) -->
				<div id="contentSection">
							
				</div>
				<!-- Main row -->
			</section>
			<!-- /.content -->
		</div>
		<!-- /.content-wrapper 
		<footer class="main-footer"> </footer>
		-->
		

		<!-- Control Sidebar -->
		<aside class="control-sidebar control-sidebar-dark">
			<!-- Create the tabs -->
			<ul class="nav nav-tabs nav-justified control-sidebar-tabs">
				<li><a href="#control-sidebar-home-tab" data-toggle="tab"><i class="fa fa-home"></i></a></li>

				<li><a href="#control-sidebar-settings-tab" data-toggle="tab"><i class="fa fa-gears"></i></a></li>
			</ul>
			<!-- Tab panes -->
			<div class="tab-content">
				<!-- Home tab content -->
				<div class="tab-pane" id="control-sidebar-home-tab">
					<h3 class="control-sidebar-heading">Recent Activity</h3>
					<ul class='control-sidebar-menu'>
						<li><a href='javascript::;'> <i class="menu-icon fa fa-birthday-cake bg-red"></i>
								<div class="menu-info">
									<h4 class="control-sidebar-subheading">Langdon's Birthday</h4>
									<p>Will be 23 on April 24th</p>
								</div>
						</a></li>
						<li><a href='javascript::;'> <i class="menu-icon fa fa-user bg-yellow"></i>
								<div class="menu-info">
									<h4 class="control-sidebar-subheading">Frodo Updated His Profile</h4>
									<p>New phone +1(800)555-1234</p>
								</div>
						</a></li>
						<li><a href='javascript::;'> <i class="menu-icon fa fa-envelope-o bg-light-blue"></i>
								<div class="menu-info">
									<h4 class="control-sidebar-subheading">Nora Joined Mailing List</h4>
									<p>nora@example.com</p>
								</div>
						</a></li>
						<li><a href='javascript::;'> <i class="menu-icon fa fa-file-code-o bg-green"></i>
								<div class="menu-info">
									<h4 class="control-sidebar-subheading">Cron Job 254 Executed</h4>
									<p>Execution time 5 seconds</p>
								</div>
						</a></li>
					</ul>
					<!-- /.control-sidebar-menu -->

					<h3 class="control-sidebar-heading">Tasks Progress</h3>
					<ul class='control-sidebar-menu'>
						<li><a href='javascript::;'>
								<h4 class="control-sidebar-subheading">
									Custom Template Design <span class="label label-danger pull-right">70%</span>
								</h4>
								<div class="progress progress-xxs">
									<div class="progress-bar progress-bar-danger" style="width: 70%"></div>
								</div>
						</a></li>
						<li><a href='javascript::;'>
								<h4 class="control-sidebar-subheading">
									Update Resume <span class="label label-success pull-right">95%</span>
								</h4>
								<div class="progress progress-xxs">
									<div class="progress-bar progress-bar-success" style="width: 95%"></div>
								</div>
						</a></li>
						<li><a href='javascript::;'>
								<h4 class="control-sidebar-subheading">
									Laravel Integration <span class="label label-waring pull-right">50%</span>
								</h4>
								<div class="progress progress-xxs">
									<div class="progress-bar progress-bar-warning" style="width: 50%"></div>
								</div>
						</a></li>
						<li><a href='javascript::;'>
								<h4 class="control-sidebar-subheading">
									Back End Framework <span class="label label-primary pull-right">68%</span>
								</h4>
								<div class="progress progress-xxs">
									<div class="progress-bar progress-bar-primary" style="width: 68%"></div>
								</div>
						</a></li>
					</ul>
					<!-- /.control-sidebar-menu -->

				</div>
				<!-- /.tab-pane -->
				<!-- Stats tab content -->
				<div class="tab-pane" id="control-sidebar-stats-tab">Stats Tab Content</div>
				<!-- /.tab-pane -->
				<!-- Settings tab content -->
				<div class="tab-pane" id="control-sidebar-settings-tab">
					<form method="post">
						<h3 class="control-sidebar-heading">General Settings</h3>
						<div class="form-group">
							<label class="control-sidebar-subheading"> Report panel usage <input type="checkbox" class="pull-right" checked />
							</label>
							<p>Some information about this general settings option</p>
						</div>
						<!-- /.form-group -->

						<div class="form-group">
							<label class="control-sidebar-subheading"> Allow mail redirect <input type="checkbox" class="pull-right" checked />
							</label>
							<p>Other sets of options are available</p>
						</div>
						<!-- /.form-group -->

						<div class="form-group">
							<label class="control-sidebar-subheading"> Expose author name in posts <input type="checkbox" class="pull-right" checked />
							</label>
							<p>Allow the user to show his name in blog posts</p>
						</div>
						<!-- /.form-group -->

						<h3 class="control-sidebar-heading">Chat Settings</h3>

						<div class="form-group">
							<label class="control-sidebar-subheading"> Show me as online <input type="checkbox" class="pull-right" checked />
							</label>
						</div>
						<!-- /.form-group -->

						<div class="form-group">
							<label class="control-sidebar-subheading"> Turn off notifications <input type="checkbox" class="pull-right" />
							</label>
						</div>
						<!-- /.form-group -->

						<div class="form-group">
							<label class="control-sidebar-subheading"> Delete chat history <a href="javascript::;" class="text-red pull-right"><i class="fa fa-trash-o"></i></a>
							</label>
						</div>
						<!-- /.form-group -->
					</form>
				</div>
				<!-- /.tab-pane -->
			</div>
		</aside>
		<!-- /.control-sidebar -->
		<div class='control-sidebar-bg'></div>
	</div>
	<!-- ./wrapper -->

	<script>
		//$.widget.bridge('uibutton', $.ui.button);
	</script>  
   <script src="<c:url value="/dist/js/app.min.js"/>"></script>
   <script src="<c:url value="/plugins/moment/moment.js"/>"></script>
	<script src="<c:url value="/plugins/slimScroll/jquery.slimscroll.min.js"/>"></script>
 	
</body>
</html>
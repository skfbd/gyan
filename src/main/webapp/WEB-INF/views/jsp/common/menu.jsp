<%@ include file="includes.jsp"%>
<aside class="main-sidebar">
	<!-- sidebar: style can be found in sidebar.less -->
	<section class="sidebar">
		<!-- search form -->
		<form action="#" method="get" class="sidebar-form">
			<div class="input-group">
				<input type="text" name="q" class="form-control" placeholder="Search..." /> <span class="input-group-btn">
					<button type='submit' name='search' id='search-btn' class="btn btn-flat">
						<i class="fa fa-search"></i>
					</button>
				</span>
			</div>
		</form>
		<!-- /.search form -->
		<!-- sidebar menu: : style can be found in sidebar.less -->
		<ul class="sidebar-menu">
			<li class="header">MAIN NAVIGATION</li>

			<c:forEach var="itemMod" items="${sessionScope.listofElement}" varStatus="rows">
				<c:if test="${itemMod.checkflag}">
					<li class="treeview"><a href="#"><i class='fa fa-link'></i><span>${itemMod.moduleCaption}</span><i class="fa fa-angle-left pull-right"></i></a>
						<ul class="treeview-menu">
							<c:forEach var="itemSubMod" items="${itemMod.subfrmList}" varStatus="rows1">
								<c:if test="${itemSubMod.checkflag}">
									<c:url var="linkUrlEdit" value="${fn:trim(itemSubMod.linkUrl)}" />
									<li><a href="#" onclick="ajaxCall('${linkUrlEdit}');return false;"><i class="fa fa-circle-o text-aqua"></i>${itemSubMod.moduleCaption}</a></li>
								</c:if>
							</c:forEach>
						</ul></li>
				</c:if>
			</c:forEach>
			<!-- <li><a href="#" onclick="ajaxCall('/Gyaan/admin/loadModules.htm');return false;">Load Modules</a></li> -->
		</ul>
		
		<script>
			function ajaxCall(URL) {
				$.ajax({
					async : true,
					type : 'POST',
					url : URL,
					beforeSend: function(){
						$(".box-danger").show();
					   },
					success : function(data) {
						$("#contentSection").html(data);
					}
				});
			}
		</script>
	</section>
	<!-- /.sidebar -->
</aside>

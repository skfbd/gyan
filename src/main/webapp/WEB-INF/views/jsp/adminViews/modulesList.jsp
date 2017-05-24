<%@ include file="../common/includes.jsp"%>
<c:url var="urlOrgEdit" value="/admin/saveModulesList.htm" />
<link media="screen" rel="stylesheet" href="<c:url value="/css/easyui/themes/default/easyui.css"/>" type="text/css"></link>
<link media="screen" rel="stylesheet" href="<c:url value="/css/easyui/themes/icon.css"/>" type="text/css"></link>

<script type="text/javascript" src="<c:url value="/easyui/jquery.easyui.min.js"/>" /></script>


<style type="text/css">
.datagrid-row-selected, .datagrid-row-over {
	background: "#79a2c9";
}

#back-top {
	position: fixed;
	bottom: 30px;
	margin-left: -150px;
}
</style>


<div id="succussMange" class="alert alert-success" role="alert" style="display: none">You successfully saved message.</div>
<section class="content-header">
	<h1>
		<small>Add Employee Type</small>
	</h1>
	<ol class="breadcrumb">
		<li><a href="#"><i class="fa fa-dashboard"></i>New Employee Type</a></li>
	</ol>
</section>
<form:form action="${urlOrgEdit}" method="post" enctype="multipart/form-data" modelAttribute="moduleListForm">
	<form:errors path="*" cssClass="errorblock" element="div" />

	<table class="table table-bordered table-hover">
		<tr>
			<td>
				<div id="save" class="btn btn-success">Save</div>
			</td>
		</tr>
		<tr>
			<td><label>Employee Type</label></td>
			<td><form:input type="text" path="userType" placeholder="Enter ..." class="easyui-validatebox textbox" data-options="required:true,validType:'length[3,10]'"
					style="width:520px;" value="${role.perName}" /> <form:input type="hidden" path="userTypeId" value="${editId}" /></td>
		</tr>
		<tr>
			<td><label>Description</label></td>
			<td><form:input type="text" path="userDescription" placeholder="Enter ..." class="textbox" style="width:520px;" value="${role.roleDesc}" /></td>
		</tr>
	</table>

<style type="text/css">
#grad1 {
	background: rgba(179, 220, 237, 1);
	background: -moz-linear-gradient(top, rgba(179, 220, 237, 1) 0%, rgba(41, 184, 229, 1) 85%, rgba(188, 224, 238, 1) 100%);
	background: -webkit-gradient(left top, left bottom, color-stop(0%, rgba(179, 220, 237, 1)), color-stop(85%, rgba(41, 184, 229, 1)), color-stop(100%, rgba(188, 224, 238, 1)));
	background: -webkit-linear-gradient(top, rgba(179, 220, 237, 1) 0%, rgba(41, 184, 229, 1) 85%, rgba(188, 224, 238, 1) 100%);
	background: -o-linear-gradient(top, rgba(179, 220, 237, 1) 0%, rgba(41, 184, 229, 1) 85%, rgba(188, 224, 238, 1) 100%);
	background: -ms-linear-gradient(top, rgba(179, 220, 237, 1) 0%, rgba(41, 184, 229, 1) 85%, rgba(188, 224, 238, 1) 100%);
	background: linear-gradient(to bottom, rgba(179, 220, 237, 1) 0%, rgba(41, 184, 229, 1) 85%, rgba(188, 224, 238, 1) 100%);
	filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#b3dced', endColorstr='#bce0ee', GradientType=0);
}
</style>
	<table id="grad1" class="table table-bordered table-hover">

		<c:forEach var="itemMod" items="${modList}" varStatus="rows">
			<tr>
				<td><c:if test="${itemMod.checkflag}">
						<form:checkbox path="mainModules" value="${itemMod.moduleValue}" checked="true" />${itemMod.moduleCaption}
                    </c:if> <c:if test="${!itemMod.checkflag}">
						<form:checkbox path="mainModules" class="flat-red" value="${itemMod.moduleValue}" />${itemMod.moduleCaption} 
                    </c:if></td>
				<td><form:errors path="mainModules" cssClass="error" /></td>
			</tr>

			<c:forEach var="itemSubMod" items="${itemMod.subfrmList}" varStatus="rows1">
				<tr>
					<td></td>

					<td><c:if test="${itemSubMod.checkflag}">

							<form:checkbox path="subModule" value="${itemSubMod.moduleValue}" checked="true" />${itemSubMod.moduleCaption} 
					   </c:if> <c:if test="${!itemSubMod.checkflag}">
							<form:checkbox path="subModule" value="${itemSubMod.moduleValue}" />${itemSubMod.moduleCaption} 
					   </c:if></td>
					<td><form:errors path="subModule" cssClass="error" /></td>

					<c:forEach var="itemPerm" items="${itemSubMod.perfrmList}" varStatus="rows2">
						<td><c:if test="${itemPerm.checkflag}">
								<form:checkbox path="perModule" value="${itemPerm.moduleValue}" checked="true" />${itemPerm.moduleName} 
						    </c:if> <c:if test="${!itemPerm.checkflag}">
								<form:checkbox path="perModule" value="${itemPerm.moduleValue}" />${itemPerm.moduleName} 
						    </c:if></td>
						<td><form:errors path="perModule" cssClass="error" /></td>

					</c:forEach>

				</tr>
			</c:forEach>
		</c:forEach>
		<tr>
			<td>
				<p id="back-top">
					<a href="#top">backtotop</a>
				</p>
			</td>
		</tr>
	</table>
</form:form>

<script>
	$(document).ready(function() {
	             $("#save").click(function(){

			$.ajax({
				async : true,
				type : 'POST',
				url : '${urlOrgEdit}',
				data : $('#moduleListForm').serialize(),
				success : function(data) {
					$("#succussMange").fadeIn("slow", function() {
						$("#succussMange").show();
					});
					$("#succussMange").fadeOut("slow", function() {
						$("#succussMange").hide();
					});

				}
			});

		});
	});
</script>



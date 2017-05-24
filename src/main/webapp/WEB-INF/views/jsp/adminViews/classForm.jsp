<%@ include file="../common/includes.jsp"%>
<c:url var="urlClassSave" value="/admin/saveClass.htm" />
<div  style="width:90%;padding-top:5px; border-radius: 25px;border: 2px solid #8AC007;padding: 20px;">
<div class="box-header with-border bg-yellow ribbon ">
	<div id="classheader" style="color: #5cb85c; font-size: 20px;">
		<b>Class
	</div>
</div>
<form:form id="classfrmId" method="post" enctype="multipart/form-data" modelAttribute="classForm">
<table style="width:100%">
	<tr>
		<td>School Name  </td>
		<td>
				  <form:select path="schoolId" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;">
				    <c:forEach items="${schoolLst}" var="s" varStatus="status">
				        <c:choose>
				            <c:when test="${s.schoolId eq classForm.schoolId}">
				                 <option value="${s.schoolId}" selected="selected">${s.schoolName}</option>
				            </c:when>
				            <c:otherwise>
				                <option value="${s.schoolId}">${s.schoolName}</option>
				            </c:otherwise>
				        </c:choose> 
				    </c:forEach>
				</form:select>
                 </td>
	</tr>
	 <tr>
		<td > Class Name*</td>
	   <td ><form:input  path="name"  value="${classForm.name}" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/> </td>
	 </tr>
	 <tr>
		<td > Priority*</td>
		<td ><form:input path="priority" id="intPriority" value="${classForm.priority}" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/>
		</td>
	 </tr>
	  <tr>
		<td > Description</td>
		<td ><form:input path="description" value="${classForm.description}" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/> </td>
	 </tr>
	 
	 <tr>
	 <td>
	 <tr>
				<td><div id="succussMange" class="alert alert-success" role="alert" style="display: none">You successfully saved message.</div>
				</td>
				<td colspan="4" align="center">
					<input type="button" value="Save" class="btn-small saveExpandForm" id="saveButton" /> 
				</td>
	 <td><form:input id="classId" type="hidden" path="id" value="${classForm.id}"/>
	 <form:input id="schoolid" type="hidden" path="schoolId" value="${classForm.schoolId}"/></td></tr>
	
</table>
</form:form>
</div>
<script>
$(document).ready(function(){
    
	   $("#saveButton").click(function(){
     	$.ajax({
	    	async: true, 
		    type:'POST',
			url: '${urlClassSave}', 
		   	data: $('#classfrmId').serialize(),
		    success: function(data){
			    $("#classId").val($(data).find("#classId").val());
			    $("#schoolid").val($(data).find("#schoolid").val());
		    	$("#succussMange" ).fadeIn( "slow", function() {
		    		$("#succussMange").show();
		    	  });
		    	$("#succussMange" ).fadeOut( "slow", function() {
		    		$("#succussMange").hide();
		    	  });
		          
			}
	     });
 });
});


</script>

<%@ include file="../common/includes.jsp"%>
<c:url var="urlupdateSchoolOrgGlobalConfig" value="/admin/updateSchoolOrgGlobalConfig.htm" />
<link media="screen" rel="stylesheet"
 href="<c:url value="/plugins/validation/css/validationEngine.jquery.css"/>" type="text/css"></link>
<script src="<c:url value="/plugins/validation/jquery.validationEngine-en.js"/>"></script>
<script src="<c:url value="/plugins/validation/jquery.validationEngine.js"/>"></script>

<div  style="width:90%;padding-top:5px; border-radius: 25px;border: 2px solid #8AC007;padding: 20px;">
<div class="box-header with-border bg-yellow ribbon ">
	<div id="AcademicSession" style="color: #5cb85c; font-size: 20px;">
		<b>School Org Global Configuration Section Form
	</div>
</div>

<form:form id="schoolOrgGlbConfigId"  name="schoolOrgGlobalConfigForm"  method="post" enctype="multipart/form-data" 
modelAttribute="schoolOrgGlobalConfigForm">
              
	<table>
	<tbody><tr>
		<td>School/Organization Name :</td>
		<td>${schoolOrgGlbConfigFrm.name}</td>
	</tr>
	<tr>
		<td >School/Organization Short Name (sms sender name):</td>
		<td><form:input path="shortName" value="${schoolOrgGlbConfigFrm.shortName}" maxlength="7" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
	</tr>
	<tr>
		<td>School/Organization Prefix :</td>
		<td><form:input  path="prefix" value="${schoolOrgGlbConfigFrm.prefix}" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
	</tr>
	<tr>
		<td>Registration No Prefix :</td>
		<td><form:input path="regNoPrefix" value="${schoolOrgGlbConfigFrm.regNoPrefix}" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
	</tr>
	<tr>
		<td>Admission No Prefix :</td>
		<td><form:input path="admissionNoPrefix" value="${schoolOrgGlbConfigFrm.admissionNoPrefix}" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
	</tr>
	<tr>
		<td>Student Fee Receipt Prefix :</td>
		<td><form:input path="feeReceiptPrefix" value="${schoolOrgGlbConfigFrm.feeReceiptPrefix}" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
	</tr>
	<tr>
		<td>Starting Receipt No. :</td>
		<td><form:input path="startingReceiptNo" value="${schoolOrgGlbConfigFrm.startingReceiptNo}" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
	</tr>
	<tr>
		<td>Academic Year Start Month :</td>
		<td >
		<form:select path="academicYearStartMonth" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;">
			                <option value="0">Select Month</option>
							<option value="1">January</option>
							<option value="2">February</option>
							<option value="3">March</option>
							<option value="4">April</option>
							<option value="5">May</option>
							<option value="6">June</option>
							<option value="7">July</option>
							<option value="8">August</option>
							<option value="9">September</option>
							<option value="10">October</option>
							<option value="11">November</option>
							<option value="12">December</option>
					</form:select>		</td>
	</tr>	
	<tr>
		<td>Financial Start Month :</td>
		<td>
		<form:select path="financialStartMonth" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;">
			<option value="0">Select Month</option>
							<option value="1">January</option>
							<option value="2">February</option>
							<option value="3">March</option>
							<option value="4">April</option>
							<option value="5">May</option>
							<option value="6">June</option>
							<option value="7">July</option>
							<option value="8">August</option>
							<option value="9">September</option>
							<option value="10">October</option>
							<option value="11">November</option>
							<option value="12">December</option>
		</form:select>		</td>
	</tr>	
	<tr>
		<td>Leave Start Month :</td>
		<td>
		<form:select path="leaveStartMonth" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;">
			<option value="0">Select Month</option>
							<option value="1">January</option>
							<option value="2">February</option>
							<option value="3">March</option>
							<option value="4">April</option>
							<option value="5">May</option>
							<option value="6">June</option>
							<option value="7">July</option>
							<option value="8">August</option>
							<option value="9">September</option>
							<option value="10">October</option>
							<option value="11">November</option>
							<option value="12">December</option>
					</form:select>		</td>
	</tr>
	<tr>
		<td>Current Academic Session :</td>
		<td>
				  <form:select  path="academicSession" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;">
				  <option value="" selected="selected">Select</option>
				    <c:forEach items="${acadSessionNew}" var="s" varStatus="status">
				        <c:choose>
				            <c:when test="${s.id eq schoolOrgGlbConfigFrm.academicSession}">
				                 <option value="${s.id}" selected="selected">${s.startYear}-${s.endYear}</option>
				            </c:when>
				            <c:otherwise>
				                <option value="${s.id}">${s.startYear}-${s.endYear}</option>
				            </c:otherwise>
				        </c:choose> 
				    </c:forEach>
				</form:select>
           </td>
	</tr>
	<tr><td><form:input id="schoolorgglobalid" type="hidden" path="id" value="${schoolOrgGlbConfigFrm.id}"/></td></tr>	
	<tr><td><form:input id="schoolId" type="hidden" path="schoolId" value="${schoolOrgGlbConfigFrm.schoolId}"/></td></tr>
	<tr>
				<td colspan="4" align="center">
					<input type="button" value="Update" class="btn-small cancelExpandForm" id="updateButton" />
				</td>
			</tr>
		
    </tbody>
</table>
</form:form>
</div>
<script>
   	  $(document).ready(function(){
			     
					   $("#updateButton").click(function(){
				    	$.ajax({
					    	async: true, 
						    type:'POST',
							url: '${urlupdateSchoolOrgGlobalConfig}', 
						   	data: $('#schoolOrgGlbConfigId').serialize(),
						    success: function(data){
						    	$("#schoolorgglobalid").val($(data).find("#schoolorgglobalid").val());
						    	$("#schoolId").val($(data).find("#schoolId").val());

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
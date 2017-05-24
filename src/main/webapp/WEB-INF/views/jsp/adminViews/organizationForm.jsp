<%@ include file="../common/includes.jsp"%>
<c:url var="urlOrgSave" value="/admin/saveOrg.htm" />
<style type="text/css">
input[type="text"] {
	margin-top: 5px;
	width: 200px;
}
select {
	margin-top: 5px;
	width: 200px;
	padding-top: 3px;
	padding-bottom: 3px;
}
textarea {
	margin-top: 5px;
	width: 200px;
}

</style>
<link media="screen" rel="stylesheet"
 href="<c:url value="/plugins/validation/css/validationEngine.jquery.css"/>" type="text/css"></link>
<script src="<c:url value="/plugins/validation/jquery.validationEngine-en.js"/>"></script>
<script src="<c:url value="/plugins/validation/jquery.validationEngine.js"/>"></script>

<div id="hione" style="width:90%;padding-top:5px; border-radius: 25px;border: 2px solid #8AC007;padding: 20px;">
<div class="box-header with-border bg-yellow ribbon ">
	<div id="AcademicSession" style="color: #5cb85c; font-size: 20px;">
		<b>Organization Form
	</div>
</div>
<form:form id="orgForm"  name="organizationForm"  method="post" enctype="multipart/form-data" 
modelAttribute="organizationForm">
		<table >
			<tr>
				<td>Name * </td>
				<td>Employee ID Prefix *</td>
			</tr>
			<tr>
				<td style="padding-right:20px;">
				<form:input path="orgName" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;" value="${organizationForm.orgName}" class="validate[required]"/></td>
				<td><form:input path="employeeIdPrefix"  style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;" value="${organizationForm.employeeIdPrefix}"/></td>
			</tr>
			<tr>
				<td>Type *</td>
				<td id='orgHeadLabel' class='hide'>Organization Head Name</td>
			</tr>
			<tr>
				<td>
				<form:select id="orgTypes" path="type" items="${orgTypes}" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;" class="validate[required]">
				</form:select>
				</td>
				<td id='orgHeadValue'class='hide'>
						<form:select id="orgHead" path="orgHead" items="${orgHeads}" itemLabel="name" itemValue="id" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/>
				</td>
			</tr>
		
			<tr>
				<td>Address 1 *</td>
				<td>Address 2</td>
			</tr>
			<tr>
				<td><form:input path="address1" 
				style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;" value="${organizationForm.address1}" class="validate[required]"/></td>
				<td><form:input path="address2" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;" value="${organizationForm.address2}"/></td>
			</tr>
			<tr>
				<td>Address 3</td>
				<td>Pin Code</td>
			</tr>
			<tr>
				<td><form:input path="address3" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"  value="${organizationForm.address3}"/></td>
				<td><form:input path="pincode" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;" value="${organizationForm.pincode}" class="validate[custom[number],maxSize[6]]"/></td>
			</tr>
			<tr>
				<td>Country *</td>
				<td>State *</td>
			</tr>
			<tr>
				<td>
				  <form:select  path="country">
				  <option value="" selected="selected">Select</option>
				    <c:forEach items="${countries}" var="s" varStatus="status">
				        <c:choose>
				            <c:when test="${s.id eq organizationForm.country}">
				                 <option value="${s.id}" selected="selected">${s.name}</option>
				            </c:when>
				            <c:otherwise>
				                <option value="${s.id}">${s.name}</option>
				            </c:otherwise>
				        </c:choose> 
				    </c:forEach>
				</form:select>
           </td>
				<td>
				 <form:select path="state" class="validate[required]">
				    <option value="" selected="selected">Select</option>
				    <c:forEach items="${states}" var="s" varStatus="status">
				        <c:choose>
				            <c:when test="${s.id eq organizationForm.state}">
				                 <option value="${s.id}" selected="selected">${s.name}</option>
				            </c:when>
				            <c:otherwise>
				                <option value="${s.id}">${s.name}</option>
				            </c:otherwise>
				        </c:choose> 
				    </c:forEach>
				</form:select>
				 </td>
			</tr>
			<tr>
				<td>District/Location/City *</td>
				<td>Display Address</td>
			</tr>
			<tr>
				<td> 
                  <form:select path="district" class="validate[required]">
                    <option value="" selected="selected" >Select</option>
				    <c:forEach items="${cities}" var="s" varStatus="status">
				        <c:choose>
				            <c:when test="${s.id eq organizationForm.district}">
				                 <option value="${s.id}" selected="selected">${s.name}</option>
				            </c:when>
				            <c:otherwise>
				                <option value="${s.id}">${s.name}</option>
				            </c:otherwise>
				        </c:choose> 
				    </c:forEach>
				   </form:select>
                </td>
				<td><form:checkbox path="displayAddress" value="1" checked="checked" style="border:1px solid #ccc;
  border-radius: 4px;"/></td>
			</tr>
			<tr>
				<td>Website</td>
				<td>Email Id</td>
			</tr>
				<tr>
				<td><form:input path="website" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;" value="${organizationForm.website}" /></td>
				<td><form:input path="emailId"  style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;" value="${organizationForm.emailId}" class="validate[required,custom[email]]"/></td>
			</tr>
		
			<tr>
				<td>Logo</td>
				<td>About Company</td>
			</tr>
			<tr>
		    	<td id="imagefile"> 
		    	    <c:if test="${not empty organizationForm.orgId}">
					  <img id="myimg" src="/Gyaan/images/imageOrgLogo.htm?id=${organizationForm.orgId}&tt=new Date().getTime();" style="width:100px;height:100px;padding:10px;">
					</c:if>
		    	     <form:input type="file" path="logo" value="/Gyaan/images/imageOrgLogo.htm?id=${organizationForm.orgId}&tt=new Date().getTime();"/>
		    	 </td>
				<td><form:textarea path="aboutCompany" style="height:50px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"></form:textarea></td>
			</tr>
			
			<tr>
				<td><div id="succussMange" class="alert alert-success" role="alert" style="display: none">You successfully saved message.</div>
				</td>
				<td colspan="4" align="center">
					<c:if test="${empty organizationForm.orgId}">
					<input type="button" value="Save" class="btn-small saveExpandForm" id="saveButton" /> 
					</c:if>
					<c:if test="${not empty organizationForm.orgId}">
					 <input type="button" value="Update" class="btn-small updateExpandForm" id="updateButton" />
					</c:if>
					<input type="button" value="Cancel" class="btn-small cancelExpandForm" id="cancelButton" />
				</td>
			</tr>
			<tr><td><form:input id="organistionId" type="hidden" path="orgId" value="${organizationForm.orgId}"/></td></tr>
		</table>
</form:form>
</div>
<script>
(function($) {
	$.fn.serializefiles = function() {
	    var obj = $(this);
	    /* ADD FILE TO PARAM AJAX */
	    var formData = new FormData();
	    $.each($(obj).find("input[type='file']"), function(i, tag) {
	        $.each($(tag)[0].files, function(i, file) {
	            formData.append(tag.name, file);
	        });
	    });
	    var params = $(obj).serializeArray();
	    $.each(params, function (i, val) {
	        formData.append(val.name, val.value);
	    });
	    return formData;
	};
	})(jQuery);
		  $(document).ready(function(){
			     
					   $("#saveButton,#updateButton").click(function(){
						   if(!$("#orgForm").validationEngine('validate')){
					     		   return false;
					      	}
				    	$.ajax({
					    	async: true, 
						    type:'POST',
							url: '${urlOrgSave}', 
						   	data: $('#orgForm').serializefiles(),
						    contentType: false,
						    processData: false,
						    success: function(data){
							    $("#organistionId").val($(data).find("#organistionId").val());
							  //  $("#imagefile").html($(data).find("#imagefile").html());

							    $("#myimg").attr("src", $("#myimg").attr("src")+"?timestamp=" + new Date().getTime());
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
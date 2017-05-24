<%@ include file="../common/includes.jsp"%>
<c:url var="urlSchoolSave" value="/admin/saveSchool.htm" />
<link media="screen" rel="stylesheet"
 href="<c:url value="/plugins/validation/css/validationEngine.jquery.css"/>" type="text/css"></link>
<script src="<c:url value="/plugins/validation/jquery.validationEngine-en.js"/>"></script>
<script src="<c:url value="/plugins/validation/jquery.validationEngine.js"/>"></script>

<div  style="width:90%;padding-top:5px; border-radius: 25px;border: 2px solid #8AC007;padding: 20px;">
	<div class="box-header with-border bg-yellow ribbon ">
	<div id="AcademicSession" style="color: #5cb85c; font-size: 20px;">
		<b>School Form
	</div>
</div>
	<form:form id="schoolfrmId" method="post" enctype="multipart/form-data" modelAttribute="schoolForm">
		
		<table width="100%">
			<tr>
				<td>Name *</td>
				<td>Company / Organization *</td>
			</tr>
			<tr>
				<td>
				<form:input path="schoolName" value="${schoolFrm.schoolName}" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;" class="validate[required]"/></td>
				<td>
				<form:select path="orgId" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;" class="validate[required]">
				     <option value="" >Please Select</option>
				     <c:forEach items="${orgFromList}" var="s" varStatus="status">
				        <c:choose>
				            <c:when test="${s.orgId eq schoolFrm.orgId}">
				                 <option value="${s.orgId}" selected="selected">${s.orgName}</option>
				            </c:when>
				            <c:otherwise>
				                <option value="${s.orgId}">${s.orgName}</option>
				            </c:otherwise>
				        </c:choose> 
				    </c:forEach>
				</form:select>
				</td>
			</tr>
			<tr>
				<td>Address 1 *</td>
				<td>Address 2</td>
			</tr>
			<tr>
				<td><form:input path="address1"  value="${schoolFrm.address1}" 
				style="height:25px;width:300px;border:1px solid #ccc;
                border-radius: 4px;" class="validate[required]"/></td>
				<td><form:input path="address2" class="fielddecor" value="${schoolFrm.address2}" 
				style="height:25px;width:300px;border:1px solid #ccc; border-radius: 4px;"/></td>
			</tr>
			<tr>
				<td>Address 3</td>
				<td>Pin Code</td>
			</tr>
			<tr>
				<td><form:input path="address3" class="fielddecor" value="${schoolFrm.address3}" 
				style="height:25px;width:300px;border:1px solid #ccc;  border-radius: 4px;"/></td>
				<td><form:input path="pincode"   value="${schoolFrm.pincode}" 
				style="height:25px;width:300px;border:1px solid #ccc;border-radius: 4px;" class="validate[custom[number],maxSize[6]]"/></td>
			</tr>
		
			<tr>
				<td>Country *</td>
				<td>State *</td>
			</tr>
			<tr>
				<td>
				  <form:select path="country" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;">
				    <c:forEach items="${countries}" var="s" varStatus="status">
				        <c:choose>
				            <c:when test="${s.id eq schoolFrm.country}">
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
				 <form:select path="state" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;" class="validate[required]">
				    <c:forEach items="${states}" var="s" varStatus="status">
				        <c:choose>
				            <c:when test="${s.id eq schoolFrm.state}">
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
                  <form:select path="district" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;" class="validate[required]">
				    <c:forEach items="${cities}" var="s" varStatus="status">
				        <c:choose>
				            <c:when test="${s.id eq schoolFrm.district}">
				                 <option value="${s.id}" selected="selected">${s.name}</option>
				            </c:when>
				            <c:otherwise>
				                <option value="${s.id}">${s.name}</option>
				            </c:otherwise>
				        </c:choose> 
				    </c:forEach>
				   </form:select>
                </td>
				<td><form:checkbox path="displayAddress" value="1" checked="checked" /></td>
			</tr>
			<tr>
				<td>Website</td>
				<td>Email Id</td>
			</tr>
			<tr>
				<td><form:input path="website"  value="${schoolFrm.website}" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
				<td><form:input path="emailId" 
				  value="${schoolFrm.emailId}" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;" /></td>
			</tr>
		
			<tr>
				<td>Fee Reciept Prefix</td>
				<td>Starting Reciept No.</td>
			</tr>
			<tr>
				<td><form:input path="feeRecieptPrefix"  value="${schoolFrm.feeRecieptPrefix}" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
				<td><form:input path="startingRecieptNo" 
				  value="${schoolFrm.startingRecieptNo}" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
			</tr>
			<tr>
				<td>Logo</td>
				<td>About Company</td>
			</tr>
			<tr>
				<td id="imagefile"> 
		    	    <c:if test="${not empty schoolFrm.schoolId}">
					  <img id="myimg" src="/Gyaan/images/imageSchoolLogo.htm?id=${schoolFrm.schoolId}&tt=new Date().getTime();" style="width:100px;height:100px;padding:10px;">
					</c:if>
		    	     <form:input type="file" path="logo" value="/Gyaan/images/imageSchoolLogo.htm?id=${schoolFrm.schoolId}&tt=new Date().getTime();"/>
		    	 </td>
				<td><form:textarea path="aboutCompany" value="${schoolFrm.aboutCompany}" 
				style="height:50px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
			</tr>
	
			<tr>
				<td>Enable Mobile App</td>
				<td>District/Location/City *</td>
			</tr>
			<tr>
				<td><form:checkbox path="enableMobileApp" value="1" checked="checked" /></td>
				<td>
					<div id="mobilePlatformDiv">
						<form:select path="mobilePlatform"  
						style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;">
							<form:option value="">Select</form:option>
							<form:option value="Android">Android</form:option>
							<form:option value="Windows">Windows</form:option>
						</form:select>
					</div>
				</td>
			</tr>
	
			<tr>
				<td>Parent Login Theme</td>
			</tr>
			<tr>
				<td>
					<div id="parentLoginThemeDiv">
						<form:select path="parentLoginTheme" class="fielddecor easyui-validatebox"
						 required="required" style="height:25px;width:300px;border:1px solid #ccc;
                         border-radius: 4px;">
							<form:option value="">Select</form:option>
							<form:option value="A">A</form:option>
							<form:option value="B">B</form:option>
							<form:option value="C">C</form:option>
						</form:select>
					</div>
				</td>
			</tr>
			<tr>
			<td><div id="succussMange" class="alert alert-success" role="alert" style="display: none">You successfully saved message.</div>
				
				<td colspan="4" align="center">
					<c:if test="${empty schoolFrm.schoolId}">
					<input type="button" value="Save" class="btn-small saveExpandForm" id="saveButton" />
					</c:if>
					<c:if test="${not empty schoolFrm.schoolId}">
						<input type="button" value="Update" class="btn-small saveExpandForm" id="updateButton" />
					</c:if>
					<input type="button" value="Cancel" class="btn-small cancelExpandForm" id="cancelButton" />
				</td>
			</tr>
			<tr><td><form:input id="schoolId" type="hidden" path="schoolId" value="${schoolFrm.schoolId}"/></td></tr>
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
						   if(!$("#schoolfrmId").validationEngine('validate')){
				     		   return false;
				      	   }
				    	$.ajax({
					    	async: true, 
						    type:'POST',
							url: '${urlSchoolSave}', 
							data: $('#schoolfrmId').serializefiles(),
						    contentType: false,
						    processData: false,
						    success: function(data){
						    	 $("#schoolId").val($(data).find("#schoolId").val());
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
<%@ include file="../../common/includes.jsp"%>
<c:url  var="urlsetPassword" value="register.htm" />
<table  style="width:98%"  class="table table-bordered table-hover">
			<tbody>
			        <tr>
						<td width="20%">First Name<samp style="color:#ff0000">*</samp></td>
						
						<td width="20%">Middle Name</td>
						
				   </tr>
					<tr>
						<td style="padding-right:20px;" width="30%">
							<form:input type="text" path="empFirstName"	id="empFirstName" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;" class="validate[required] text-input fielddecor   select-input"  />
						</td>
						<td width="30%">
						<form:input type="text"	path="empMiddelName"   style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"  class="fielddecor inputFieldWidth  select-input "/>
						</td>
				  </tr>
				  <tr>  
						<td>Last Name<samp style="color:#ff0000">*</samp></td>	
						<td>Gender</td>
				 </tr>
				 <tr>  
						<td style="padding-right:20px;">
						<form:input type="text" path="empLastName"	
						id="empLastName" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;" class="validate[required] text-input"/></td>
						
						<td><form:select path="empGender" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;">
								<option value="0">Gender</option>
								<option value="1">Male</option>
								<option value="2">Female</option>
						</form:select>
						</td>
				</tr>
				<tr>
					<td>Employee Type <samp style="color:#ff0000">*</samp></td>
					<td>Designation <samp style="color:#ff0000">*</samp></td>
				</tr>
				
				<tr>
					<td>
					
					<form:select id="employTypeId" path="empofficialdtl.employee_Type"
						 style="height:34px;width:300px;border:1px solid #ccc; border-radius: 4px;" class="validate[required]">
							<option value="">Select Employee Type</option>
							 <c:forEach items="${roleLst}" var="s" varStatus="status">
						        <c:choose>
						            <c:when test="${s.rId eq employeefrm.empofficialdtl.employee_Type}">
						                 <option value="${s.rId}" selected="selected">${s.perName}</option>
						            </c:when>
						            <c:otherwise>
						                <option value="${s.rId}">${s.perName}</option>
						            </c:otherwise>
						        </c:choose> 
				             </c:forEach>
					</form:select></td>
					<td>
						
							<form:select id="designationId" path="empofficialdtl.designation"
							 style="height:34px;width:300px;border:1px solid #ccc;  border-radius: 4px;" class="validate[required]">	
							 	    <option value="">Select</option>
								
							</form:select>
						
					</td>
				</tr>
				<tr>
					<td>Blood Group</td>
				    <td>Father's Name</td>	
				</tr>
			    <tr>
						<td style="padding-right:20px;"><form:select
							path="empBloodGrp" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"  >
								<option value="">Select Blood Group</option>
								<option value="A+">A+</option>
								<option value="B+">B+</option>
								<option value="AB+">AB+</option>
								<option value="O+">O+</option>
								<option value="A-">A-</option>
								<option value="B-">B-</option>i
								<option value="AB-">AB-</option>
								<option value="O-">O-</option>
						    </form:select>
						</td>
				      <td><form:input type="text"
							path="empFatherName"  value="" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;" /></td>	
			     </tr>
			     <tr>
						<td >
						 Mother's Name
						</td>
						<td>
						 Date Of Birth
						</td>
						
				 </tr>
					  <tr>
						<td style="padding-right:20px;">
						<form:input type="text"
							path="empMotherName"   style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;" />
						</td>
						<td> 
						 <div class="input-group input-append date dateRangePicker" style="width:250px;height:34px;"> 
						    <form:input type="text" id="dateOfBirth" style="width:250px;height:34px;" path="dateOfBirth" /> 
							<span class="input-group-addon add-on">
								<span class="glyphicon glyphicon-calendar">
								</span>
							</span>
					    </div>
					   </td>
					</tr>
					<tr>
						<td>
						 Birth Place
						</td>
				         <td>
						 Existing Disease
						</td>
					</tr>
					<tr>
				       <td style="padding-right:20px;"><form:input type="text"
							path="birthPlace"  value="" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;" /></td>
					   <td ><form:input type="text"
							path="empExistingDisease"  value="" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;" /></td>
					</tr>
					<tr>
					  <td>
						 Passport Number
						</td>
                         <td>						
						 Height 
						</td>
				      	
					</tr>
					<tr>
					  	<td style="padding-right:20px;"><form:input type="text"
							path="passportNumber" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"  value=""/></td>
						
				      	<td><form:input type="text" path="height"
							style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"  value="" /></td>
					</tr>
					<tr>
					  <td>
						 Weight
						</td>	
						<td>
						Can read
						</td>
					</tr>
					<tr>
						 <td style="padding-right:20px;">
						 <form:input type="text" path="weight"
							style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"  value="" /></td>
						<td><form:radiobutton  path="can_read"
							value="Yes" /> Yes <form:radiobutton 
							path="can_read" value="No" class="fielddecor radioButtoninputFieldHeight"/> No</td>
					</tr>
					<tr>
					   <td>
						 Can write 
						</td>
						<td>
						 Can speak
						</td>	
					</tr>
					<tr>
						<td><form:radiobutton type="radio"
							path="can_write" value="Yes" class="fielddecor radioButtoninputFieldHeight"/> Yes <form:radiobutton
							type="radio" path="can_write" value="No" class="fielddecor radioButtoninputFieldHeight"/>
							No</td>
						 <td><form:radiobutton  type="radio"
							path="can_speak" value="Yes" class="fielddecor radioButtoninputFieldHeight"/> Yes <form:radiobutton
							type="radio" path="can_speak" value="No" class="fielddecor radioButtoninputFieldHeight"/>
							No</td>
					</tr>
					<tr>
					   <td >
						 Hobbies 
						</td>
						<td >
						 Identification Mark
						</td>
					</tr>
					<tr>
						<td style="padding-right:20px;"><form:input path="hobbies"
								id="hobbies" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"  /></td>
						<td ><form:input type="text"
							path="identification_Mark" id="indentificationMark" value="" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"  /></td>
					</tr>
					<tr>		
					 <td >
						 Medical Report 
						</td>	
						<td>
						 Marital Status
						</td>
					</tr>
					<tr>		
					 <td  style="padding-right:20px;">
					 <input name="medicalReport" type="file" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius:4px;"/>
					</td>
					<td><form:select
							path="martialStatus" id="txtMaritialStatus"
							style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;">
								<option value="">Select Marital Status</option>
								<option value="Married">Married</option>
								<option value="Unmarried" selected>Unmarried</option>
						</form:select></td>
					</tr>
					<tr>
						<td>
						 Date Of Anniversary 
						</td>
						<td>
						 Spouse Name 
						</td>
					</tr>
					<tr>
						<td  style="padding-right:20px;"> 
						 <div class="input-group input-append date dateRangePicker" style="width:250px;height:34px;"> 
						    <form:input type="text" id="dateOfAnniversary" style="width:250px;height:34px;" path="dateOfAnniversary" /> 
							<span class="input-group-addon add-on">
								<span class="glyphicon glyphicon-calendar">
								</span>
							</span>
							
					    </div>
					   </td>
						<td><form:input type="text"	path="spouseName" id="txtSpouseName" 
							disabled="disabled" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"  /></td>
					</tr>
					<tr>	
						
						<td>
						 Spouse Blood Group 
						</td>
						<td >
						No of childrens 
						</td>
					</tr>
					<tr>	
						<td  style="padding-right:20px;"><form:select
							path="spouseBloodGroup" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"  >
								<option value="">Select Blood Group</option>
								<option value="A+">A+</option>
								<option value="B+">B+</option>
								<option value="AB+">AB+</option>
								<option value="O+">O+</option>
								<option value="A-">A-</option>
								<option value="B-">B-</option>
								<option value="AB-">AB-</option>
								<option value="O-">O-</option>
						</form:select></td>
						<td ><form:input type="text"
							path="noOfChildrens" id="noOfChildren" value="0" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"  /></td>
					</tr>
					<tr>
				      <td>Company (Employer) <samp style="color:#ff0000">*</samp> </td>
					  <td><label class="control-label"> Upload Image</label></td>
         	        </tr>
					
					<tr>
						<td>
						 <form:select path="schoolId" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;" class="validate[required] ">
				    <option value="">Please Select</option>
				    <c:forEach items="${schoolLst}" var="s" varStatus="status">
				        <c:choose>
				            <c:when test="${s.schoolId eq employeefrm.schoolId}">
				                 <option value="${s.schoolId}" selected="selected">${s.schoolName}</option>
				            </c:when>
				            <c:otherwise>
				                <option value="${s.schoolId}">${s.schoolName}</option>
				            </c:otherwise>
				        </c:choose> 
				    </c:forEach>
				</form:select>
                 </td>
         	    <td colspan="3">
				       <input name="employeeImge" type="file" />
				 </td>
         	   </tr>
         	
		</tbody>	
</table>
					
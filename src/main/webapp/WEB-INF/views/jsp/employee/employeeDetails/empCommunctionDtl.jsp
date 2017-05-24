<%@ include file="../../common/includes.jsp"%>
<table   style="width:98%" class="table table-bordered table-hover">
			
			<tbody>
			        <tr>
						<td >
						   Address
						</td>
						<td>
						   Country<samp style="color:#ff0000">*</samp>
						</td>
					</tr>
					<tr>
						<td  style="padding-right:20px;">
						  <form:input id="address"  path="empcommunicationdtl.address"   style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/>
						</td>
						
						<td>
				  <form:select  path="empcommunicationdtl.country" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;" class="validate[required]" >
				  <option value="" selected="selected">Select</option>
				    <c:forEach items="${countries}" var="s" varStatus="status">
				      
				        <c:choose>
				            <c:when test="${s.id eq employeefrm.empcommunicationdtl.country}">
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
						 <td>
						 State<samp style="color:#ff0000">*</samp>
						</td>	
						<td>
						 District<samp style="color:#ff0000">*</samp>
						</td>
					</tr>
                    <tr>
							<td>
				 			<form:select path="empcommunicationdtl.state"  style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;" class="validate[required]" >
				    		<option value="" selected="selected">Select</option>
				    			<c:forEach items="${states}" var="s" varStatus="status">
				        		<c:choose>
				            		<c:when test="${s.id eq employeefrm.empcommunicationdtl.state}">
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
                  <form:select path="empcommunicationdtl.district"  style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;" class="validate[required]" >
                    <option value="" selected="selected" >Select</option>
				    <c:forEach items="${cities}" var="s" varStatus="status">
				        <c:choose>
				            <c:when test="${s.id eq employeefrm.empcommunicationdtl.district}">
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
						<td style="padding-right:2px;">
						 Pin code
						</td>
						<td>
						 Phone No
						</td>	
					</tr>
				
				    <tr>
						<td>
						<form:input path="empcommunicationdtl.pin_code" 
										  style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/>
						</td>
				     	<td>
						<form:input path="empcommunicationdtl.phone_No"  style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/>
						</td>	
					</tr>
				
					<tr>
						<td>
						Resident Phone No
						</td>
						<td>
						 Mobile No 
						</td>
					</tr>
					
					<tr>
						<td ><form:input path="empcommunicationdtl.resident_Phone_No" 
						style="height:34px;width:300px;border:1px solid #ccc;
  								border-radius: 4px;"/></td>
						<td> 
						<form:select path="empcommunicationdtl.taxCountryCode"
									  style="height:34px;width:40px;border:1px solid #ccc;
  border-radius: 4px;">
											<option value="91">91</option>
											<option value="27">27</option>
									</form:select> 
									<form:input path="empcommunicationdtl.mobile_No" 
										 style="height:34px;width:255px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
						
					</tr>
					
					
					<tr>
						<td>
						 Emergency Contact	Number
						</td>
				         <td>
						 Email Id
						</td>
					</tr>
					
					<tr>
						<td><form:input path="empcommunicationdtl.emergency_Contact_Number" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;" /></td>
						<td ><form:input  path="empcommunicationdtl.email_Id" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;" /></td>
					</tr>
					
					
					<tr>
					 	<td>
						 Alternative Email
						</td>
						<td>
						 Height
						</td>
				   </tr>
					<tr>
					 	<td>
					 	 <form:input path="empcommunicationdtl.alternative_Email" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/>
					 	</td>
					  	<td>
					  	<form:input path="empcommunicationdtl.height"
							style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/>
							</td>
					</tr>
					<tr>
					   <td>
					     <form:hidden id="communicationId" path="empcommunicationdtl.empCommId"/>
				       </td>
					</tr>
				</tbody>	
				</table>
				
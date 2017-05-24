<%@ include file="../../common/includes.jsp"%>
<div id="pastExp">
 <table  style="width:98%">
   <tbody >
   <tr>
				 <td>
				  <c:forEach items="${employeefrm.emppastexperiancedtls}" var="employee" varStatus="i" begin="0" >
                      <table class="list-Pastlst table table-bordered table-hover" >
						<tr>
							<td>Duration</td>
							<td>Company</td>
							<td>Company Address</td>
						</tr>
						<tr>
							<td style="padding-right:10px;"><form:input path="emppastexperiancedtls[${i.index}].duration"
								style="height:34px;width:220px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
							<td style="padding-right:10px;"><form:input path="emppastexperiancedtls[${i.index}].Company_Name" style="height:34px;width:220px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
						
							<td><form:textarea path="emppastexperiancedtls[${i.index}].company_Address" style="height:34px;width:220px;border:1px solid #ccc;
  border-radius: 4px;"/>
							</td>
						</tr>
						
						<tr>
							<td>Company Contact Detail	</td>
							<td>Designation</td>
							<td>Priority </td>
						</tr>
						
						<tr>
							<td><form:textarea
									path="emppastexperiancedtls[${i.index}].company_contact_dtl" style="height:34px;width:220px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
						
							<td><form:input  path="emppastexperiancedtls[${i.index}].designation" style="height:34px;width:220px;border:1px solid #ccc;
  border-radius: 4px;" /></td>
							<td><form:input path="emppastexperiancedtls[${i.index}].priority"	style="height:34px;width:220px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
						</tr>
						
						
						
						
						<tr>
							<td class="head-4" colspan="4">Enter Two References</td>
						</tr>
						<tr>
							<td>Name </td>
							<td>Phone</td>
							<td>Email</td>
						</tr>
						
						<tr>
							<td><form:input path="emppastexperiancedtls[${i.index}].refname" style="height:34px;width:220px;border:1px solid #ccc;
  border-radius: 4px;" /></td>
							<td><form:input path="emppastexperiancedtls[${i.index}].phone"  style="height:34px;width:220px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
							<td><form:input path="emppastexperiancedtls[${i.index}].email" style="height:34px;width:220px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
							
						</tr>
						<tr>
							<td>Designation</td>
						</tr>
						<tr>
							<td style="padding-right:5px;">
							<form:input path="emppastexperiancedtls[${i.index}].designation0" style="height:34px;width:220px;border:1px solid #ccc;
                             border-radius: 4px;"/></td>
						   </tr>
						<tr>
							<td>Name</td>
							<td>Phone</td>
							<td>Email</td>
						 </tr>
						  
						  <tr>
							<td><form:input path="emppastexperiancedtls[${i.index}].refname1" style="height:34px;width:220px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
							<td><form:input path="emppastexperiancedtls[${i.index}].phone1"  style="height:34px;width:220px;border:1px solid #ccc;
  border-radius: 4px;" /></td>
							<td><form:input path="emppastexperiancedtls[${i.index}].email1" style="height:34px;width:220px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
						  </tr>
						  <tr>
							<td>Designation</td>
						 </tr>
						  <tr>
							
							<td><form:input path="emppastexperiancedtls[${i.index}].designation1" style="height:34px;width:220px;border:1px solid #ccc;
  border-radius: 4px;" /></td>
  <td style="padding-top:10px;padding-bottom:10px;">
                                  	<a class="btn btn-info btn-xs list-pastadd" href="#" role="button">Add</a>
					 	<a class="btn btn-info btn-xs list-pastremove" href="#" role="button">Remove</a>  
						 		 
						    </td>
						  </tr>
						
						   <tr><td><form:hidden id="empPastExperiencId" path="emppastexperiancedtls[${i.index}].emp_pExpe_id"/></td></tr>
						 </table>
				 
                </c:forEach>
         		 </td>
               </tr>
              
		<tr>
				 <td>
				     <c:if test="${fn:length(employeefrm.emppastexperiancedtls) == 0}">
				      <table class="list-Pastlst" >
						<tr>
							<td>Duration</td>
							<td>Company</td>
							<td>Company Address</td>
						</tr>
						<tr>
							<td style="padding-right:10px;"><input type="text" name="emppastexperiancedtls[0].duration"
								style="height:34px;width:220px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
							<td style="padding-right:10px;"><input type="text"
								name="emppastexperiancedtls[0].Company_Name" style="height:34px;width:220px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
						
							<td><textarea name="emppastexperiancedtls[0].company_Address" style="height:34px;width:220px;border:1px solid #ccc;
  border-radius: 4px;"></textarea>
							</td>
						</tr>
						
						<tr>
							<td>Company Contact Detail	</td>
							<td>Designation</td>
							<td>Priority </td>
						</tr>
						
						<tr>
							<td><textarea
									name="emppastexperiancedtls[0].company_contact_dtl" style="height:34px;width:220px;border:1px solid #ccc;
  border-radius: 4px;"></textarea></td>
						
							<td><input type="text"
								name="emppastexperiancedtls[0].designation" style="height:34px;width:220px;border:1px solid #ccc;
  border-radius: 4px;" /></td>
							<td><input type="text" name="emppastexperiancedtls[0].priority"	style="height:34px;width:220px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
						</tr>
						
						
						
						
						<tr>
							<td class="head-4" colspan="4">Enter Two References</td>
						</tr>
						<tr>
							<td>Name </td>
							<td>Phone</td>
							<td>Email</td>
						</tr>
						
						<tr>
							<td><input type="text"	name="emppastexperiancedtls[0].refname" style="height:34px;width:220px;border:1px solid #ccc;
  border-radius: 4px;" /></td>
							<td><input type="text"
								name="emppastexperiancedtls[0].phone"  style="height:34px;width:220px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
							<td><input type="text"
								name="emppastexperiancedtls[0].email" style="height:34px;width:220px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
							
						</tr>
						<tr>
							<td>Designation</td>
						</tr>
						<tr>
							<td style="padding-right:5px;">
							<input type="text"
								name="emppastexperiancedtls[0].designation0" style="height:34px;width:220px;border:1px solid #ccc;
                             border-radius: 4px;"/></td>
						   </tr>
						<tr>
							<td>Name</td>
							<td>Phone</td>
							<td>Email</td>
						 </tr>
						  
						  <tr>
							<td><input type="text"
								name="emppastexperiancedtls[0].refname1" style="height:34px;width:220px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
							<td><input type="text"
								name="emppastexperiancedtls[0].phone1"  style="height:34px;width:220px;border:1px solid #ccc;
  border-radius: 4px;" /></td>
							<td><input type="text"
								name="emppastexperiancedtls[0].email1" style="height:34px;width:220px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
						  </tr>
						  <tr>
							<td>Designation</td>
						 </tr>
						  <tr>
							
							<td><input type="text"
								name="emppastexperiancedtls[0].designation1" style="height:34px;width:220px;border:1px solid #ccc;
  border-radius: 4px;" /></td>
  <td style="padding-top:10px;padding-bottom:10px;">
                                  	<a class="btn btn-info btn-xs list-pastadd" href="#" role="button">Add</a>
					 	<a class="btn btn-info btn-xs list-pastremove" href="#" role="button">Remove</a>  
						 		 
						    </td>
						  </tr>
					 </table>
			     </c:if>
         		 </td>
               </tr>
	</tbody>
</table>
</div>

<div id="pastExpFileUpload">
 <table >
<tr>
				  	 <td>
				  	     <c:if test="${fn:length(employeefrm.fileUploadLstPastExp) == 0}">
							<table class="list-PastFileUpload">
								<tr>
								<td >
								 File Name
								</td>
								</tr>
								<tr>
								<td>
								     <input type="text"
									name="fileUploadLstPastExp[0].fileName"  style="height:34px;width:220px;border:1px solid #ccc;
  border-radius: 4px;" />
								</td>
						       	<td>
						       	 <input type="file" name="fileUploadLstPastExp[0].files"  style="height:34px;width:220px;border:1px solid #ccc;
  border-radius: 4px;" />
						       	</td>
						       	 <td>
			                  	<a class="btn btn-info btn-xs list-pastaddfileupload" href="#" role="button">Add</a>
					 	<a class="btn btn-info btn-xs list-pastremovefileupload" href="#" role="button">Remove</a>  
			                   </td>
							</tr>
						   </table>
					    </c:if>
					 </td>
					 <td>
		       <c:forEach items="${employeefrm.fileUploadLstPastExp}" var="employee" varStatus="j" begin="0" >
               		    	<table class="list-PastFileUpload">
								<tr>
								<td >
								 File Name
								</td>
								</tr>
								<tr>
								<td>
								     <form:input path="fileUploadLstPastExp[${j.index}].fileName"  style="height:34px;width:220px;border:1px solid #ccc;
  border-radius: 4px;" />
								</td>
						       	<td>
						       	 <input type="file" name="fileUploadLstPastExp[${j.index}].files"  style="height:34px;width:220px;border:1px solid #ccc;
  border-radius: 4px;" />
						       	</td>
						 
						       	 <td>
			                  	<a class="btn btn-info btn-xs list-pastaddfileupload" href="#" role="button">Add</a>
					 	<a class="btn btn-info btn-xs list-pastremovefileupload" href="#" role="button">Remove</a>  
			                   </td>
							</tr>
							   <tr><td><input type="hidden"  name="emppastexperiancedtls[${j.index}].emp_PEFileUpload_id"></td></tr>
						   </table>
			 </c:forEach>
		 </td>
	  </tr>
</table>
</div>
    
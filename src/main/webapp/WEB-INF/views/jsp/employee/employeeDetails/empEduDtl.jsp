<%@ include file="../../common/includes.jsp"%>
<div id="list1">
 <c:forEach items="${employeefrm.empeducationaldtl}" var="employeeedu" varStatus="i" begin="0" >
       <table style="width:98%" class="list-item1 table table-bordered table-hover">
						<tr>
							<td>Qualification Name<samp style="color:#ff0000">*</samp></td>
						   <td>Institute/College/School Name<samp style="color:#ff0000">*</samp></td>
					    </tr>
					   
					   <tr>
						<td style="padding-right: 30px;" >
							<form:select path="empeducationaldtl[${i.index}].qualificationName" style="height:34px;width:280px;border:1px solid #ccc;
  border-radius: 4px;" class="validate[required]" >
									<form:option value="mca">MCA</form:option>
									<form:option value="bca">BCA</form:option>
							       	<form:option value="bsc">BSC</form:option>
							</form:select>
							</td>
							<td>
							     <form:input path="empeducationaldtl[${i.index}].institCollSchool" style="height:34px;width:280px;border:1px solid #ccc;
  border-radius: 4px;" class="validate[required]" />
							</td>
				       </tr>
					   
					   
					   <tr>
						   <td>
						       Board/Institute/Collage/University<samp style="color:#ff0000">*</samp>
						  </td>	
						  <td>
						        Year of Passing<samp style="color:#ff0000">*</samp>
						  </td>
					   </tr>
					    <tr>
						  <td><form:input path="empeducationaldtl[${i.index}].boardcollUniver" style="height:34px;width:280px;border:1px solid #ccc;
  border-radius: 4px;" class="validate[required]" /></td>
						  <td><form:input path="empeducationaldtl[${i.index}].yearofpassing" style="height:34px;width:280px;border:1px solid #ccc;
  border-radius: 4px;"/>
					   </tr>
					   
					   
					   
					   <tr>
						<td>
						 Which criteria followed by your university?
						</td>
						<td>
						 Percentage or CGPA or Grade
						</td>		
				       </tr>
					 	
						<tr>
				         <td><form:radiobutton type="radio"
							path="empeducationaldtl[${i.index}].cgpaPercentage" value="Percentage" />Percentage 
							<form:radiobutton path="empeducationaldtl[${i.index}].cgpaPercentage" value="CGPA" />CGPA
							 <form:radiobutton path="empeducationaldtl[${i.index}].cgpaPercentage" value="GRADE" />GRADE</td>
				     
				     	<td><form:input path="empeducationaldtl[${i.index}].criteriaUniversity" style="height:34px;width:280px;border:1px solid #ccc;
  border-radius: 4px;"/></td>	
					    </tr>
					<tr>
						<td>
						 Division
						</td>
						<td>
						 Medium
						</td>
					</tr>
				    <tr>
						<td><form:input path="empeducationaldtl[${i.index}].division" style="height:34px;width:280px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
						<td><form:select path="empeducationaldtl[${i.index}].medium" style="height:34px;width:280px;border:1px solid #ccc;
  border-radius: 4px;">
								<form:option value="">Medium</form:option>
								<form:option value="Full Time">Full Time</form:option>
								<form:option value="Part Time">Part Time</form:option>
						</form:select></td>
					</tr>
					<tr>
						<td>Electives</td>
				   	</tr>
				  	<tr>
				     	<td><form:input path="empeducationaldtl[${i.index}].electives" style="height:34px;width:280px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
				   </tr>
				   <tr>
				   <td style="width:5px;"> 
					   	<a class="btn btn-info btn-xs list-add1" href="#" role="button">Add</a>
					 	<a class="btn btn-info btn-xs list-remove1" href="#" role="button">Remove</a>
					 </td></tr>
				    </table>
				    <table>
				     <tr>
				       <td>
                          <c:forEach items="${employeefrm.empeducationaldtl[i.index].fileUploadLst}" var="employeeedu" varStatus="j" begin="0" >
				  	 	    <table class="list-item">
								<tr>
									<td>
									 File Name
									</td>
									<td>
									 File
									</td>
								</tr>
							    <tr>
									<td>
									     <form:input path="empeducationaldtl[${i.index}].fileUploadLst[${j.index}].fileName"
                                    style="height:34px;width:100px;border:1px solid #ccc;  border-radius: 4px;" />
									</td>
						            <td>
						            <input type="file" name="empeducationaldtl[${i.index}].fileUploadLst[${j.index}].files" style="width:130px;"/>
						            </td>
						            <td>
							            <div class="btn-group btn-group-lg">
							             <!--<span class="glyphicon glyphicon-minus-sign list-remove"></span>-->
								         <span  class="glyphicon glyphicon-plus-sign list-add"></span>
								        </div>
						            </td>
						        </tr>
						        
						   </table>
					    </c:forEach>				     
				       </td>
				     </tr>
		</table>
</c:forEach> 
<c:if test="${fn:length(employeefrm.empeducationaldtl) == 0}">
       <table style="width:98%" class="list-item1 table table-bordered table-hover">
						<tr>
							<td>Qualification Name<samp style="color:#ff0000">*</samp></td>
						   <td>Institute/College/School Name<samp style="color:#ff0000">*</samp></td>
					    </tr>
					   
					   <tr>
						<td style="padding-right: 30px;" >
							<select name="empeducationaldtl[0].qualificationName" style="height:34px;width:280px;border:1px solid #ccc;
  border-radius: 4px;" class="validate[required]" >
									<option value="mca">MCA</option>
									<option value="bca">BCA</option>
							       	<option value="bsc">BSC</option>
							</select>
							</td>
							<td>
							     <input type="text"
								name="empeducationaldtl[0].institCollSchool" style="height:34px;width:280px;border:1px solid #ccc;
  border-radius: 4px;" class="validate[required]" />
							</td>
				       </tr>
					   
					   
					   <tr>
						   <td>
						       Board/Institute/Collage/University<samp style="color:#ff0000">*</samp>
						  </td>	
						  <td>
						        Year of Passing<samp style="color:#ff0000">*</samp>
						  </td>
					   </tr>
					    <tr>
						  <td><input type="text" name="empeducationaldtl[0].boardcollUniver" style="height:34px;width:280px;border:1px solid #ccc;
  border-radius: 4px;" class="validate[required]" /></td>
						  <td><input type="text" name="empeducationaldtl[0].yearofpassing" style="height:34px;width:280px;border:1px solid #ccc;
  border-radius: 4px;"/>
					   </tr>
					   
					   
					   
					   <tr>
						<td>
						 Which criteria followed by your university?
						</td>
						<td>
						 Percentage or CGPA or Grade
						</td>		
				       </tr>
					 	
						<tr>
				         <td><input type="radio"
							name="empeducationaldtl[0].cgpaPercentage" value="Percentage" />Percentage <input 
							type="radio" name="empeducationaldtl[0].cgpaPercentage" value="CGPA" />CGPA <input
							type="radio" name="empeducationaldtl[0].cgpaPercentage" value="GRADE" />GRADE</td>
				     
				     	<td><input type="text"
							name="empeducationaldtl[0].criteriaUniversity" style="height:34px;width:280px;border:1px solid #ccc;
  border-radius: 4px;"/></td>	
					    </tr>
					<tr>
						<td>
						 Division
						</td>
						<td>
						 Medium
						</td>
					</tr>
				    <tr>
						<td><input type="text" name="empeducationaldtl[0].division" style="height:34px;width:280px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
						<td><select name="empeducationaldtl[0].medium" style="height:34px;width:280px;border:1px solid #ccc;
  border-radius: 4px;">
								<option value="">Medium</option>
								<option value="Full Time">Full Time</option>
								<option value="Part Time">Part Time</option>
						</select></td>
					</tr>
					<tr>
						<td>Electives</td>
				   	</tr>
				  	<tr>
				     	<td><input type="text"	name="empeducationaldtl[0].electives" style="height:34px;width:280px;border:1px solid #ccc;
                         border-radius: 4px;"/>
  						</td>
  						 <td style="width:5px;"> 
						   	<a class="btn btn-info btn-xs list-add1" href="#" role="button">Add</a>
						 	<a class="btn btn-info btn-xs list-remove1" href="#" role="button">Remove</a>
						 </td>
  					</tr>
  
                      
				  <tr>
				   <td>
		          	    <c:if test="${fn:length(empeducationaldtl[0].fileUploadLst) == 0}">
						    <table class="list-item">
								<tr>
									<td>
									 File Name
									</td>
									<td>
									 File
									</td>
								</tr>
							    <tr>
									<td>
									     <input type="text"	name="empeducationaldtl[0].fileUploadLst[0].fileName"
                                    style="height:34px;width:100px;border:1px solid #ccc;  border-radius: 4px;" />
									</td>
						            <td>
						            <input type="file" name="empeducationaldtl[0].fileUploadLst[0].files" style="width:130px;"/>
						            </td>
						            <td>
							            <div class="btn-group btn-group-lg">
							             <!--<span class="glyphicon glyphicon-minus-sign list-remove"></span>-->
								         <span  class="glyphicon glyphicon-plus-sign list-add"></span>
								        </div>
						            </td>
						        </tr>
						        
						   </table>
					    </c:if>
			    </td>
			 </tr>
			</table>		
         </c:if>
         <div id="nextv">
	         <c:forEach items="${employeefrm.empeducationaldtl}" var="employeeed" varStatus="p" begin="0" >
	           <form:hidden id="educationId${p.index}" path="empeducationaldtl[${p.index}].emp_edu_id"/>
	            <c:forEach items="${employeefrm.empeducationaldtl[p.index].fileUploadLst}" var="employeee" varStatus="q" begin="0" >
			            <form:hidden  path="empeducationaldtl[${p.index}].fileUploadLst[${q.index}].emp_EEduFileUpload_id"/>
			       </c:forEach>
	           	           
	           
			</c:forEach>
		 </div>
</div>

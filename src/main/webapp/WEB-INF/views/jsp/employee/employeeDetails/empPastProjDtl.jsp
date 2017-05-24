<%@ include file="../../common/includes.jsp"%>
<table   style="width:98%" class="table table-bordered table-hover">
   <tbody >
                <tr>
                <td>
                <div id="pastProj">
                  <c:forEach items="${employeefrm.emppastprojects}" var="employee" varStatus="i" begin="0" >
                  <table class="list-projlst table table-bordered table-hover" >
                 	 <tr>
							<td style="padding-right:10px;">Project<samp style="color:#ff0000">*</samp></td>
							<td>Project Description</td>
				   </tr>
				    <tr>
							<td><form:input path="emppastprojects[${i.index}].projectName" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;" class="validate[required] text-input"/></td>
							<td><form:input path="emppastprojects[${i.index}].projectDescription" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
				   </tr>
				   <tr><td><form:hidden id="empPastProjectId" path="emppastprojects[${i.index}].emp_pastProj_id"/></td></tr>
				   <tr>
				   <td>
				   	    <a class="btn btn-info btn-xs list-projadd" href="#" role="button">Add</a>
					 	<a class="btn btn-info btn-xs list-projremove" href="#" role="button">Remove</a>
				   </td></tr>
				   </table>
				   </c:forEach> 
				</div> 
			    </td>
                </tr>
                
				<tr>
				 <td>
				 <div id="pastProj">
				     <c:if test="${fn:length(employeefrm.emppastprojects) == 0}">
				          <table class="list-projlst" >
		                 	 <tr>
									<td >Project Name</td>
									<td>Project Description</td>
						     </tr>
						     <tr>
									<td><form:input path="emppastprojects[0].projectName" style="height:34px;width:250px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
									<td><form:input path="emppastprojects[0].projectDescription" style="height:34px;width:250px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
						    
						      <td>
						       <td style="padding-left:20px;">
						      	<a class="btn btn-info btn-xs list-projadd"    href="#" role="button">Add</a>
					 	        <a class="btn btn-info btn-xs list-projremove" href="#" role="button">Remove</a>  
						      </td>
						     </tr>
					   </table>
				  
                 </c:if>
                 </div>
                 </td>
                 </tr>
	</tbody>
</table>

	 <div id="pastProjFileUpload">
	            <c:forEach items="${employeefrm.fileUploadLstPastProj}" var="employee" varStatus="j" begin="0" >
    
	 				<table class="list-projFileUpload">
				 
								<tr>
								<td >
								 File Name
								</td>
							   </tr>
						 	   <tr>
								<td>
								     <form:input  path="fileUploadLstPastProj[${j.index}].fileName" style="height:34px;width:250px;border:1px solid #ccc;
  border-radius: 4px;" />
								</td>
						 		<td><input type="file" name="fileUploadLstPastProj[${j.index}].files"/>
						 		</td>
							    <td>
						      	<a class="btn btn-info btn-xs list-projaddfileupload" href="#" role="button">Add</a>
					 	       </td><td>
						       <a class="btn btn-info btn-xs list-projremovefileupload" href="#" role="button">Remove</a>  
						      </td>
			                 </tr>
			                  <tr><td><form:hidden  path="fileUploadLstPastProj[${j.index}].emp_PPFileUpload_id"/></td></tr>
				 
						   </table>
       </c:forEach> 
		 
	 <c:if test="${fn:length(employeefrm.fileUploadLstPastProj) == 0}">
					<table class="list-projFileUpload">
								<tr>
								<td >
								 File Name
								</td>
							   </tr>
						 	   <tr>
								<td>
								     <form:input  path="fileUploadLstPastProj[0].fileName" style="height:34px;width:250px;border:1px solid #ccc;
  border-radius: 4px;" />
								</td>
						 		<td><input type="file" name="fileUploadLstPastProj[0].files"/>
						 			 
						      
						 		</td>
							    <td>
						      	<a class="btn btn-info btn-xs list-projaddfileupload" href="#" role="button">Add</a>
					 	       </td><td>
						       <a class="btn btn-info btn-xs list-projremovefileupload" href="#" role="button">Remove</a>  
						      </td>
			                 </tr>
						   </table>
       </c:if>
 </div>
 

	    
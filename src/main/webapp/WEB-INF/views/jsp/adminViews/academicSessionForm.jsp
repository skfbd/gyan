<%@ include file="../common/includes.jsp"%>
<c:url var="saveAcademicSession" value="/admin/saveAcademicSession.htm" />
<div  style="width:90%;padding-top:5px; border-radius: 25px;border: 2px solid #8AC007;padding: 20px;">
<div class="box-header with-border bg-yellow ribbon ">
	<div id="AcademicSession" style="color: #5cb85c; font-size: 20px;">
		<b>Academic Session Section
	</div>
</div>
<form:form id="saveAcademicSessionId"  name="academicSessionFrm"  method="post" enctype="multipart/form-data" 
modelAttribute="academicSessionFrm">
               <table style="width:100%">
                           <tr>
								<td>School/Organisation </td>
							</tr>
                           <tr>
                           <td>
				  <form:select path="schoolId" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;">
				    <c:forEach items="${schoolLst}" var="s" varStatus="status">
				        <c:choose>
				            <c:when test="${s.schoolId eq academicSessionFrm.schoolId}">
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
								<td>Session Start Year : </td>
								<td>Session End Year:</td>
							</tr>
							 <tr>
								<td>
								  <form:input  path="startYear"  style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"  value="${academicSessionFrm.startYear}"/>
								</td>
								
								<td>
								 <form:input  path="endYear"  style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;" value="${academicSessionFrm.endYear}"/>
								</td>
							</tr>
							
							
							<tr>
								<td>Session Start Date:</td>
								<td>Session End Date:</td>
							</tr>
							<tr>
								
								<td style="padding-right:20px;">
								<div class="input-group input-append date dateRangePicker inputFieldHeight"> 
						   			 <form:input   class="form-control calendarinputFieldHeight" 
						   			 path="sessionStartDate" value="${academicSessionFrm.sessionStartDate}"/> 
										<span class="input-group-addon add-on">
								<span class="glyphicon glyphicon-calendar">
								</span>
							</span>
					    	</div>
								</td>
									
								
								<td style="padding-right:20px;">
								   <div class="input-group input-append date dateRangePicker inputFieldHeight"> 
								    <form:input   class="form-control calendarinputFieldHeight"
								     path="sessionEndDate" style="height:25px;width:260px;border:1px solid #ccc;
  border-radius: 4px;" value="${academicSessionFrm.sessionEndDate}"/> 
									<span class="input-group-addon add-on">
										<span class="glyphicon glyphicon-calendar">
										</span>
							        </span>
					                </div>
								</td>
							</tr>
							<tr>
								<td>Subject-wise Attendence:</td>
							    <td>Fee Start Month : </td>
                           </tr>
							<tr>
								<td>
									<form:radiobutton path="subjectWiseAttendance" value="Yes" style="width:20px" />Yes
									<form:radiobutton path="subjectWiseAttendance" value="No" style="width:20px" checked="checked" />No
								</td>
                                <td>
                                <form:select path="feeStartMonth" style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;">
                                                                    <option value="">Select Month</option>
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
                                   </form:select>
                                </td>
							</tr>
								
							
							
							<tr>
							    <td>Prospectus String: </td>
								<td>Current Academic Session :</td>
							</tr>	
							<tr>
							   <td>
									<form:input path="prospectusString"  style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;" disabled="disabled" value="${academicSessionFrm.prospectusString}"/>
								</td>
								<td>
								  <form:checkbox path="notApplicable"   style="height:25px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"   checked="checked"/>
								</td>
							</tr>	
							<tr>
							<td colspan="4" align="center">
								<c:if test="${empty academicSessionFrm.id}">
								<input type="button" value="Save" class="btn-small saveExpandForm" id="saveButton" /> 
								</c:if>
								<c:if test="${not empty academicSessionFrm.id}">
								<input type="button" value="Update" class="btn-small updateExpandForm" id="updateButton" />
								</c:if>
								<input type="button" value="Cancel" class="btn-small cancelExpandForm" id="cancelButton" />
							</td>
						</tr>
						<tr><td><form:input id="accdemicId" type="hidden" path="id" value="${academicSessionFrm.id}"/></td></tr>
				</table>
	
</form:form>
</div>
<script>
   
		  $(document).ready(function(){
			     
					   $("#saveButton,#updateButton").click(function(){
				    	$.ajax({
					    	async: true, 
						    type:'POST',
							url: '${saveAcademicSession}', 
						   	data: $('#saveAcademicSessionId').serialize(),
						    success: function(data){
						    	$("#accdemicId").val($(data).find("#accdemicId").val());
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
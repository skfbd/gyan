<style type="text/css">
.lines-both .datagrid-body td {
	border-bottom-style: none;
	border-right-style: none;
}

input[type="text"]{
	margin-top: 5px;
	width:200px;
}

select{
	margin-top: 5px;
	width:200px;
	padding-top: 3px;
	padding-bottom: 3px;
}
textarea{
	margin-top: 5px;
	width:200px;
}


#grad1 {
    background: rgba(255,255,255,1);
/* Old Browsers */background: -moz-linear-gradient(top, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 47%, rgba(237,237,237,1) 100%);
 /* FF3.6+ */background: -webkit-gradient(left top, left bottom, color-stop(0%, rgba(255,255,255,1)), color-stop(47%, rgba(246,246,246,1)), color-stop(100%, rgba(237,237,237,1)));
/* Chrome, Safari4+ */background: -webkit-linear-gradient(top, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 47%, rgba(237,237,237,1) 100%);
 /* Chrome10+,Safari5.1+ */background: -o-linear-gradient(top, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 47%, rgba(237,237,237,1) 100%);
 /* Opera 11.10+ */background: -ms-linear-gradient(top, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 47%, rgba(237,237,237,1) 100%);
 /* IE 10+ */background: linear-gradient(to bottom, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 47%, rgba(237,237,237,1) 100%);
/* W3C */filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#ffffff', endColorstr='#ededed', GradientType=0 );
/* IE6-9 */
}
</style>

<div id="grad1">
<form action="AddEditSchool.php?urlstring=eNortjI0tlJKTC7JzM-zzcwrTi0qUbIGXDBK9gcb" name="organization" method="post" onSubmit="return validateAddForm(this);" enctype="multipart/form-data">
<table width="100%">
                           <tr>
								<td class="fieldlevel" style="width:240px;">
								  Session Start Year : </td>
								<td>
								  <input type="text" name="intSessionStart207" id="intSessionStart_207" style="width:55px" maxlength="4" onkeypress="return isNumberKey(event)" onblur="setSessionEnd(this.value,'207','31','04','03')"/>
								</td>
								<td class="fieldlevel">
								  Session End Year:</td>
								<td>
								 <input type="text" name="intSessionEnd207" id="intSessionEnd_207" style="width:55px" maxlength="4" readonly=""/>
								</td>
							</tr>
							<tr>
								<td class="fieldlevel">Session Start Date:</td>
								<td>
									<input type="text" name="intSessionStartDate207" id="intSessionStartDate207" style="width:70px" readonly="true" />
								</td>
									
								<td class="fieldlevel">Session End Date:</td>
								<td>
									<input type="text" name="intSessionEndDate207" id="intSessionEndDate207" style="width:70px" readonly="true" />
								</td>
							</tr>
							<tr>
								<td class="fieldlevel">Subject-wise Attendence:</td>
								<td>
									<input type="radio" name="subjectAtten207" value="Yes" style="width:20px" />Yes
									<input type="radio" name="subjectAtten207" value="No" style="width:20px" checked="checked" />No
								</td>
                                <td>Fee Start Month : </td>
                                <td>
                                <select name="fee_start_month_207" id="fee_start_month_207" style="width:100px">
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
                                                                </select>
                                </td>
								
								
							</tr>
								
							
							<tr>
							    <td>Prospectus String: </td>
								<td>
									<input type="checkbox" name="notApplicable207" id="notApplicable207"  style="width:20px" value="207" onclick="displayPros(this.value)" checked="checked"/>NA
									<input type="text" name="prospectusString207" id="prospectusString207" style="width:70px" disabled="disabled"/>
								</td>
								<td class="fieldlevel">Current Academic Session :</td>
								<td>
								<input type="checkbox" name="notApplicable207" id="notApplicable207"  style="width:20px" value="207" onclick="displayPros(this.value)" checked="checked"/>
								</td>
							</tr>	
							
							<!-- Global config Session -->
							<tr id="currentSessionOn">
										            <td class="fieldlevel">School/Organization Name :</td>
													<td>[SCHOOL NAME]</td>
												
													<td class="fieldlevel">School/Organization Short Name (sms sender name):</td>
													<td><input type="text" name="txtShortName" value="ETS" maxlength="7" /></td>
												
												</tr>
												<tr>
												    <td class="fieldlevel">School/Organization Prefix :</td>
													<td><input type="text" name="txtSchoolCode" value="ETS" /></td>
											
													<td class="fieldlevel">Registration No Prefix :</td>
													<td><input type="text" name="txtRegistrationNo" value="ETS" /></td>
												
													
												</tr>
												<tr>
												    <td class="fieldlevel">Admission No Prefix :</td>
													<td><input type="text" name="txtAdmissionNo" value="" /></td>
												
													<td class="fieldlevel">Student Fee Receipt Prefix :</td>
													<td><input type="text" name="txtBillCode" value="ETS" /></td>
														
												</tr>	
												<tr>
												   <td class="fieldlevel">Starting Receipt No. :</td>
													<td><input type="text" name="txtBillNo" value="" /></td>
												
													<td class="fieldlevel">Academic Year Start Month :</td>
													<td class="fieldlevel">
													<select name="cboAcadStartMonth" >
														<option value="0">Select Month</option>
																		<option value="1" >January</option>
																		<option value="2" >February</option>
																		<option value="3" >March</option>
																		<option value="4"  selected>April</option>
																		<option value="5" >May</option>
																		<option value="6" >June</option>
																		<option value="7" >July</option>
																		<option value="8" >August</option>
																		<option value="9" >September</option>
																		<option value="10" >October</option>
																		<option value="11" >November</option>
																		<option value="12" >December</option>
																</select>		</td>
												
													
												</tr>
												<tr>
												<td class="fieldlevel">Financial Start Month :</td>
													<td class="fieldlevel">
													<select name="cboFinStartMonth" >
														<option value="0">Select Month</option>
																		<option value="1" >January</option>
																		<option value="2" >February</option>
																		<option value="3" >March</option>
																		<option value="4"  selected>April</option>
																		<option value="5" >May</option>
																		<option value="6" >June</option>
																		<option value="7" >July</option>
																		<option value="8" >August</option>
																		<option value="9" >September</option>
																		<option value="10" >October</option>
																		<option value="11" >November</option>
																		<option value="12" >December</option>
																</select>		</td>
												
												
												
													<td class="fieldlevel">Leave Start Month :</td>
													<td>
													<select name="cboLeaveStartMonth" >
														<option value="0">Select Month</option>
																		<option value="1" >January</option>
																		<option value="2" >February</option>
																		<option value="3" >March</option>
																		<option value="4"  selected>April</option>
																		<option value="5" >May</option>
																		<option value="6" >June</option>
																		<option value="7" >July</option>
																		<option value="8" >August</option>
																		<option value="9" >September</option>
																		<option value="10" >October</option>
																		<option value="11" >November</option>
																		<option value="12" >December</option>
																</select>		</td>
												</tr>
							
							<tr>
								<td colspan="4" style="text-align:right">
									<input type="submit" class="btn" value="Submit" onClick="javascript:return confirm('Are You Sure you want to Add session?\n Click OK to Continue, Cancel to Stop')"/>
									<input type="reset" class="btn" value="Reset" />
									<input name="button" type="button" class="btn" onClick="javascript: HideShow('addForm207','displayMsg207');" value="Cancel">
								</td>
							</tr>
						</table>
	
</form>
</div>

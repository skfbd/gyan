<%@ include file="../../common/includes.jsp"%>
<c:url  var="calendarImageUrl" value="/images/calendar.jpg" />
	<p>
		<table width="100%" class="table table-bordered table-hover">
			<tr>
				<td  width="20%">Date of anniversary</td>
				<td  width="30%">
					<div class="input-group input-append date dateRangePicker calendarInputFieldWidth"> 
						<input type="text" id="anniversaryDate" class="form-control" name="studentParentalCommonInfoForm.anniversaryDate" /> 
							<span class="input-group-addon add-on">
								<span class="glyphicon glyphicon-calendar">
								</span>
							</span>
					</div>
				</td>
				<td  width="20%">Mobile number in which SMS will be send *</td>
				<td  width="30%"><form:select id="SMSList" path="studentParentalCommonInfoForm.smsToSend" items="${SMSList}" itemLabel="name" itemValue="id" class="fielddecor inputFieldWidth " /> </td>
			</tr>
			<tr>
				<td>Email id where email will be send</td>
				<td colspan="3">
					<form:checkbox path="studentParentalCommonInfoForm.emailToBeSentFather" label="Father's email id" /> 
					<form:checkbox path="studentParentalCommonInfoForm.emailToBeSentMother" label="Mother's email id" /> 
					<form:checkbox path="studentParentalCommonInfoForm.emailToBeSentGuardian" label="Guardian's email id"/> 
				</td>
			</tr>
			<tr>
				<td>Is parent divorced?</td>
				<td>
					<form:radiobutton path="studentParentalCommonInfoForm.isDivorced"  value="1"/>&nbsp;Yes
					<form:radiobutton path="studentParentalCommonInfoForm.isDivorced"  value="0"/>&nbsp;No
				</td>
				<td>Is parent employer of the school or group?</td>
				<td><form:checkbox path="studentParentalCommonInfoForm.parentEmpOfSchool"/></td>
			</tr>
			<tr>
				<td>School :*</td>
				<td><form:select id="commonParentalSchool" path="studentParentalCommonInfoForm.schoolId" items="${schools}" itemLabel="name" itemValue="id" class="fielddecor inputFieldWidth " /></td>
				<td>Employees :*</td>
				<td><form:select id="commonParentalEmployees" path="studentParentalCommonInfoForm.employees" items="${employees}" itemLabel="name" itemValue="id" class="fielddecor inputFieldWidth " /> </td>
			</tr>
		</table>
	</p>

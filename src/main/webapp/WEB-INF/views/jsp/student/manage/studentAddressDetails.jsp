<%@ include file="../../common/includes.jsp"%>

	<p>
		<table width="100%" class="table table-bordered table-hover">
			<tr>
				<td width="20%">Communication address *</td>
				<td width="30%"><form:textarea path="studentAddressForm.studentCommAddress" class=" text-input fielddecor inputFieldWidth"  /></td>
				<td width="20%">Permanent address *</td>
				<td width="30%"><form:textarea path="studentAddressForm.studentPermanentAdd" class=" text-input fielddecor inputFieldWidth"  /></td>
			</tr>
			<tr>
				<td>Country *</td>
				<td><form:select id="countries" path="studentAddressForm.studentCountry" items="${countries}" itemLabel="name" itemValue="id" class="fielddecor inputFieldWidth  select-input" /></td>
				<td>State *</td>
				<td><form:select id="states" path="studentAddressForm.studentState" items="${states}" itemLabel="name" itemValue="id" class="fielddecor inputFieldWidth  select-input" /> </td>
			</tr>
			<tr>
				<td>District/Location/City *</td>
				<td><form:select id="cities" path="studentAddressForm.studentCity" items="${cities}" itemLabel="name" itemValue="id" class="fielddecor inputFieldWidth  select-input" /></td>
				<td>Pin code *</td>
				<td><form:input path="studentAddressForm.studentPinCode" class=" text-input fielddecor inputFieldWidth"  /></td>
			</tr>
			<tr>
				<td>Residence phone number</td>
				<td><form:input path="studentAddressForm.studentResidencePhNumber" class="fielddecor inputFieldWidth" /></td>
				<td>Emergency contact number *</td>
				<td><form:input path="studentAddressForm.studentEmergencyContact" class="fielddecor inputFieldWidth  text-input"  /></td>
			</tr>
			<tr>
				<td>Residence's FAX number</td>
				<td class="fieldlevel1" colspan="3"> <form:input path="studentAddressForm.studentResidenceFaxNumber" class="fielddecor inputFieldWidth" /></td>
			</tr>
		</table>
	</p>

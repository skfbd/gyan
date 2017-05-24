<%@ include file="../../common/includes.jsp"%>

	<p>
		<table width="100%" class="table table-bordered table-hover">
			<tr>
				<td width="20%">Hostel Facility</td>
				<td width="30%"><form:checkbox id="studentHostelFacility" path="studentOtherFacilityForm.studentHostelFacility" class="fielddecor" /></td>
				<td width="20%">Transport Facility </td>
				<td width="30%"><form:checkbox id="studentTransportFacility" path="studentOtherFacilityForm.studentTransportFacility" class="fielddecor" /></td>
			</tr>
			<tr id="laundryRow" style="display:none;">
				<td>Laundry Number *</td>
				<td colspan="3"><form:input path="studentOtherFacilityForm.studentLaundryNumber" class="fielddecor inputFieldWidth" /></td>
			</tr>
			<tr  id="transportRow" style="display:none;">
				<td>Pick up point</td>
				<td><form:input path="studentOtherFacilityForm.studentPickupPoint" class="fielddecor inputFieldWidth" /></td>
				<td>Droping point</td>
				<td><form:input path="studentOtherFacilityForm.studentDropPoint" class="fielddecor inputFieldWidth" /></td>
			</tr>
		</table>
		<script>
			$("#studentHostelFacility").click(function(){
				var ischecked= $(this).is(':checked');
                if(ischecked){
                	$('#laundryRow').show();
                }else{
                	$('#laundryRow').hide();
                }
			});
			$("#studentTransportFacility").click(function(){
				var ischecked= $(this).is(':checked');
                if(ischecked){
                	$('#transportRow').show();
                }else{
                	$('#transportRow').hide();
                }
			});
		</script>
	</p>

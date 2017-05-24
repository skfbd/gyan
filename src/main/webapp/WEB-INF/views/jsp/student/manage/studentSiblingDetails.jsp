<%@ include file="../../common/includes.jsp"%>

	<p>
		<table width="100%" class="table table-bordered table-hover">
			
			<tr>
				<td colspan="4">Any sibling studying in same school or group? <form:checkbox id="studentPermanentAdd" path="studentSibblingInfoForm.studentPermanentAdd"  /></td>
			</tr>
			<tr class="sibblingRow" style="display:none">
				<td width="20%">Sibling school *</td>
				<td width="30%"><form:select id="siblingSchool" path="studentSibblingInfoForm.sibblingSchool" items="${schools}" itemLabel="name" itemValue="id" class="fielddecor inputFieldWidth " /></td>
				<td width="20%">Session *</td>
				<td width="30%"><form:select id="siblingSession" path="studentSibblingInfoForm.sibblingSession" items="${sessions}" itemLabel="name" itemValue="id" class="fielddecor inputFieldWidth " /> </td>
			</tr>
			<tr class="sibblingRow" style="display:none">
				<td>Sibling class *</td>
				<td><form:select id="siblingClass" path="studentSibblingInfoForm.sibblingClass" items="${classes}" itemLabel="name" itemValue="id" class="fielddecor inputFieldWidth " /></td>
				<td>Sibling Name</td>
				<td><form:select id="siblingName" path="studentSibblingInfoForm.sibblingName" items="${studentNames}" itemLabel="name" itemValue="id" class="fielddecor inputFieldWidth"/> </td>
			</tr>
		</table>
		<script>
			$("#studentPermanentAdd").click(function(){
				var ischecked= $(this).is(':checked');
                if(ischecked){
                	$('.sibblingRow').show();
                }else{
                	$('.sibblingRow').hide();
                }
			});
			
		</script>
	</p>

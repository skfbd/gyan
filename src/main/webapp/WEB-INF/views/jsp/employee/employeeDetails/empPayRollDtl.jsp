<%@ include file="../../common/includes.jsp"%>

<table style="width:98%">
				
				<tr>
				    <td>Bank Account No.</td>
					<td>Bank Branch</td>
				</tr>
				<tr>
					<td><form:input path="emppayrolldetail.Bank_Acc_No" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
				    <td><form:input path="emppayrolldetail.bank_Branch" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
				</tr>
				<tr>
					<td>Bank Name</td>
					<td>TAN Number</td>
				</tr>
				<tr>
					<td><form:input path="emppayrolldetail.bank_Name" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
					<td><form:input path="emppayrolldetail.tan_number" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
				</tr>
				<tr>
					<td>PAN Card Number</td>
					<td >PAN Ward Circle</td>
				</tr>
				<tr>
					<td ><form:input path="emppayrolldetail.PAN_Card_Num" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
					<td ><form:input path="emppayrolldetail.PAN_Ward_Circle" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
				</tr>
				<tr>
					<td>PF Number</td>
					<td>PF Department File Number</td>
				</tr>
				<tr>
					<td><form:input path="emppayrolldetail.PF_Num" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
					<td><form:input path="emppayrolldetail.PF_Dep_File_Num" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
				</tr>
			
			
				<tr>
					<td>ESI Number</td>
					<td>ESI Dispensary</td>
				</tr>
			    <tr>
					<td><form:input path="emppayrolldetail.ESI_Num" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
					<td><form:input path="emppayrolldetail.ESI_Dispensary" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
				</tr>
			
				<tr>
					<td>Nominee for Gratuity</td>
					<td>Nominee for pension if any</td>
				</tr>
				<tr>
					<td><form:input path="emppayrolldetail.nominee_for_Gratuity" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
					<td><form:input path="emppayrolldetail.nominee_for_pension" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
				</tr>
				<tr>
					<td>Form Sixteen
					</td>
					<td>ITR File 
					</td>
					
				</tr>
				<tr>
					<td><form:input path="emppayrolldetail.form_Sixteen" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
					<td><form:input path="emppayrolldetail.ITR_File" style="height:34px;width:300px;border:1px solid #ccc;
  border-radius: 4px;"/></td>
                    <td><form:hidden id="empPayrollId" path="emppayrolldetail.empPayrollId" /></td>
				</tr>

</table>
		
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
<table width="100%" border="0" cellspacing="0" cellpadding="0" class="form-common">
		<tr>
			<td colspan="2" class="head-1">Add New Paper Type</td>
		</tr>
		<tr>
			<td class="fieldlevel">School <span class="MandatoryField">*</span></td>
			<td style="padding-top:0px">
				<table width="100%" border="0" cellspacing="0" cellpadding="0" class="form-common">
					<tr>
						<td style="padding-top:0px">
						<input type="checkbox" name="intSchoolAll" id="intSchoolAll" value="0" onclick="disableCheckBox();" style="width:20px" checked="checked" />All
													<input type="checkbox" name="intSchoolId[]" value="243" style="width:20px" disabled="disabled" />Bishop Convent							<input type="hidden" name="schoolIdArray[]" value="243" />
													<input type="checkbox" name="intSchoolId[]" value="255" style="width:20px" disabled="disabled" />Bishops College							<input type="hidden" name="schoolIdArray[]" value="255" />
													<input type="checkbox" name="intSchoolId[]" value="264" style="width:20px" disabled="disabled" />St. Mary							<input type="hidden" name="schoolIdArray[]" value="264" />
						<br>							<input type="checkbox" name="intSchoolId[]" value="434" style="width:20px" disabled="disabled" />School Name - CBSE							<input type="hidden" name="schoolIdArray[]" value="434" />
													<input type="checkbox" name="intSchoolId[]" value="540" style="width:20px" disabled="disabled" />DLF RK P							<input type="hidden" name="schoolIdArray[]" value="540" />
													<input type="checkbox" name="intSchoolId[]" value="542" style="width:20px" disabled="disabled" />SMPS							<input type="hidden" name="schoolIdArray[]" value="542" />
													<input type="checkbox" name="intSchoolId[]" value="545" style="width:20px" disabled="disabled" />India\'s Future Public School							<input type="hidden" name="schoolIdArray[]" value="545" />
												</td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
			<td width="21%" class="fieldlevel">Paper Short Name <span class="MandatoryField">*</span></td>
			<td width="79%"><input type="Text" name="txtShortName"  maxlength="250"/></td>
		</tr>
		<tr>
			<td class="fieldlevel">Paper Full Name <span class="MandatoryField">*</span></td>
			<td><input type="Text" name="txtFullName" maxlength="250"/></td>
		</tr>
		<tr>
			<td colspan="2" class="fieldhead"><input name="submit2" type="submit" class="btn" value="Submit" onclick="return confirm('Are You Sure you want to Save it?\n Click OK to Continue, Cancel to Stop')" /> 
			<input type="reset" value="Reset" name="btnReset" class="btn" />
			<input name="button" type="button" id="btnSubmit" class="btn" value="Cancel" onClick="javascript: history.back(-1);"/>
			</td>
		</tr>
	</table>
	</form>
</form>
</div>

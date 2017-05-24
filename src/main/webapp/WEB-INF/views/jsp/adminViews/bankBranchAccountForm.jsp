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
			<td colspan="4" class="head-1">Bank </td>
		</tr>
		<tr>
			<td>Bank Name </td>
			<td><input type="text" name="bankName" id="bankName" ></td>
			<td>Bank Code/Short Name</td>
			<td><input type="text" name="bankCodeShortName" id="bankCodeShortName" ></td>
		</tr>
		<tr>
			<td colspan="4" class="head-4">Bank Branch</td>
		</tr>
		<tr>
			 <td><input type="button" name="Add New Branch" value="Add New Branch" class="btn1" onclick="AddMoreBranchAndAccDetails()" />
			 <input name="Remove" value="Remove Branch" class="btn1" onClick="javascript:removeNodes()" type="button"></td>
		</tr>
		<tr>
			<td colspan="4" style="padding-top:0px">
				<table width="100%" border="0" cellspacing="0" cellpadding="0" class="form-common">
										<tr>
						<td width="25%" class="fieldlevel3">Branch Address <span class="MandatoryField">*</span></td>
						<td colspan="3"><input type="text" name="bankBranchAddress1" id="bankBranchAddress1" style="width:300px" ></td>
					</tr>
					<tr>
						<td class="fieldlevel3">Bank Branch Code</td>
						<td><input type="text" name="bankBranchCode1" id="bankBranchCode1" ></td>
						<td class="fieldlevel3">IFSC Code</td>
						<td><input type="text" name="ifscCode1" id="ifscCode1" ></td>
					</tr>
					<tr>
						<td class="fieldlevel">Country <span class="MandatoryField">*</span></td>
						<td class="fieldlevel">
												<select name="bankBranchCountry1" id="bankBranchCountry1" onchange="getStateByCountryId(this.value,'1')">
						<option value="">Country</option>
												<option value="1">India</option>
												<option value="2">Nepal</option>
												<option value="3">Bangladesh</option>
												<option value="4">United Arab Emirates</option>
												<option value="5">Nigeria</option>
												<option value="6">Mauritius</option>
												<option value="7">Uganda</option>
												<option value="8">Afghanistan</option>
												<option value="9">Albania</option>
												<option value="10">Algeria</option>
												<option value="11">American Samoa</option>
												<option value="12">Andorra</option>
												<option value="13">Angola</option>
												<option value="14">Anguilla</option>
												<option value="15">Antigua and Barbuda</option>
												<option value="16">Argentina</option>
												<option value="17">Armenia</option>
												<option value="18">Aruba</option>
												<option value="19">Australia</option>
												<option value="20">Austria</option>
												<option value="21">Azerbaijan</option>
												<option value="22">Bahamas</option>
												<option value="23">Bahrain</option>
												<option value="25">Barbados</option>
												<option value="26">Belarus</option>
												<option value="27">Belgium</option>
												<option value="28">Belize</option>
												<option value="29">Benin</option>
												<option value="30">Bermuda</option>
												<option value="31">Bhutan</option>
												<option value="32">Bolivia</option>
												<option value="33">Bosnia-Herzegovina</option>
												<option value="34">Botswana</option>
												<option value="35">Bouvet Island</option>
												<option value="36">Brazil</option>
												<option value="37">Brunei</option>
												<option value="38">Bulgaria</option>
												<option value="39">Burkina Faso</option>
												<option value="40">Burundi</option>
												<option value="41">Cambodia</option>
												<option value="42">Cameroon</option>
												<option value="43">Canada</option>
												<option value="44">Cape Verde</option>
												<option value="45">Cayman Islands</option>
												<option value="46">Central African Republic</option>
												<option value="47">Chad</option>
												<option value="48">Chile</option>
												<option value="49">China</option>
												<option value="50">Christmas Island</option>
												<option value="51">Cocos (Keeling) Islands</option>
												<option value="52">Colombia</option>
												<option value="53">Comoros</option>
												<option value="54">Congo, Democratic Republic of the (Zaire)</option>
												<option value="55">Congo, Republic of</option>
												<option value="56">Cook Islands</option>
												<option value="57">Costa Rica</option>
												<option value="58">Croatia</option>
												<option value="59">Cuba</option>
												<option value="60">Cyprus</option>
												<option value="61">Czech Republic</option>
												<option value="62">Denmark</option>
												<option value="63">Djibouti</option>
												<option value="64">Dominica</option>
												<option value="65">Dominican Republic</option>
												<option value="66">Ecuador</option>
												<option value="67">Egypt</option>
												<option value="68">El Salvador</option>
												<option value="69">Equatorial Guinea</option>
												<option value="70">Eritrea</option>
												<option value="71">Estonia</option>
												<option value="72">Ethiopia</option>
												<option value="73">Falkland Islands</option>
												<option value="74">Faroe Islands</option>
												<option value="75">Fiji</option>
												<option value="76">Finland</option>
												<option value="77">France</option>
												<option value="78">French Guiana</option>
												<option value="79">Gabon</option>
												<option value="80">Gambia</option>
												<option value="81">Georgia</option>
												<option value="82">Germany</option>
												<option value="83">Ghana</option>
												<option value="84">Gibraltar</option>
												<option value="85">Greece</option>
												<option value="86">Greenland</option>
												<option value="87">Grenada</option>
												<option value="88">Guadeloupe (French)</option>
												<option value="89">Guam (USA)</option>
												<option value="90">Guatemala</option>
												<option value="91">Guinea</option>
												<option value="92">Guinea Bissau</option>
												<option value="93">Guyana</option>
												<option value="94">Haiti</option>
												<option value="95">Holy See</option>
												<option value="96">Honduras</option>
												<option value="97">Hong Kong</option>
												<option value="98">Hungary</option>
												<option value="99">Iceland</option>
												<option value="101">Indonesia</option>
												<option value="102">Iran</option>
												<option value="103">Iraq</option>
												<option value="104">Ireland</option>
												<option value="105">Israel</option>
												<option value="106">Italy</option>
												<option value="107">Ivory Coast (Cote D`Ivoire)</option>
												<option value="108">Jamaica</option>
												<option value="109">Japan</option>
												<option value="110">Jordan</option>
												<option value="111">Kazakhstan</option>
												<option value="112">Kenya</option>
												<option value="113">Kiribati</option>
												<option value="114">Kuwait</option>
												<option value="115">Kyrgyzstan</option>
												<option value="116">Laos</option>
												<option value="117">Latvia</option>
												<option value="118">Lebanon</option>
												<option value="119">Lesotho</option>
												<option value="120">Liberia</option>
												<option value="121">Libya</option>
												<option value="122">Liechtenstein</option>
												<option value="123">Lithuania</option>
												<option value="124">Luxembourg</option>
												<option value="125">Macau</option>
												<option value="126">Macedonia</option>
												<option value="127">Madagascar</option>
												<option value="128">Malawi</option>
												<option value="129">Malaysia</option>
												<option value="130">Maldives</option>
												<option value="131">Mali</option>
												<option value="132">Malta</option>
												<option value="133">Marshall Islands</option>
												<option value="134">Martinique (French)</option>
												<option value="135">Mauritania</option>
												<option value="137">Mayotte</option>
												<option value="138">Mexico</option>
												<option value="139">Micronesia</option>
												<option value="140">Moldova</option>
												<option value="141">Monaco</option>
												<option value="142">Mongolia</option>
												<option value="143">Montenegro</option>
												<option value="144">Montserrat</option>
												<option value="145">Morocco</option>
												<option value="146">Mozambique</option>
												<option value="147">Myanmar</option>
												<option value="148">Namibia</option>
												<option value="149">Nauru</option>
												<option value="151">Netherlands</option>
												<option value="152">Netherlands Antilles</option>
												<option value="153">New Caledonia (French)</option>
												<option value="154">New Zealand</option>
												<option value="155">Nicaragua</option>
												<option value="156">Niger</option>
												<option value="158">Niue</option>
												<option value="159">Norfolk Island</option>
												<option value="160">North Korea</option>
												<option value="161">Northern Mariana Islands</option>
												<option value="162">Norway</option>
												<option value="163">Oman</option>
												<option value="164">Pakistan</option>
												<option value="165">Palau</option>
												<option value="166">Panama</option>
												<option value="167">Papua New Guinea</option>
												<option value="168">Paraguay</option>
												<option value="169">Peru</option>
												<option value="170">Philippines</option>
												<option value="171">Pitcairn Island</option>
												<option value="172">Poland</option>
												<option value="173">Polynesia (French)</option>
												<option value="174">Portugal</option>
												<option value="175">Puerto Rico</option>
												<option value="176">Qatar</option>
												<option value="177">Reunion</option>
												<option value="178">Romania</option>
												<option value="179">Russia</option>
												<option value="180">Rwanda</option>
												<option value="181">Saint Helena</option>
												<option value="182">Saint Kitts and Nevis</option>
												<option value="183">Saint Lucia</option>
												<option value="184">Saint Pierre and Miquelon</option>
												<option value="185">Saint Vincent and Grenadines</option>
												<option value="186">Samoa</option>
												<option value="187">San Marino</option>
												<option value="188">Sao Tome and Principe</option>
												<option value="189">Saudi Arabia</option>
												<option value="190">Senegal</option>
												<option value="191">Serbia</option>
												<option value="192">Seychelles</option>
												<option value="193">Sierra Leone</option>
												<option value="194">Singapore</option>
												<option value="195">Slovakia</option>
												<option value="196">Slovenia</option>
												<option value="197">Solomon Islands</option>
												<option value="198">Somalia</option>
												<option value="199">South Africa</option>
												<option value="200">South Georgia and South Sandwich Islands</option>
												<option value="201">South Korea</option>
												<option value="202">South Sudan</option>
												<option value="203">Spain</option>
												<option value="204">Sri Lanka</option>
												<option value="205">Sudan</option>
												<option value="206">Suriname</option>
												<option value="207">Svalbard and Jan Mayen Islands</option>
												<option value="208">Swaziland</option>
												<option value="209">Sweden</option>
												<option value="210">Switzerland</option>
												<option value="211">Syria</option>
												<option value="212">Taiwan</option>
												<option value="213">Tajikistan</option>
												<option value="214">Tanzania</option>
												<option value="215">Thailand</option>
												<option value="216">Timor-Leste (East Timor)</option>
												<option value="217">Togo</option>
												<option value="218">Tokelau</option>
												<option value="219">Tonga</option>
												<option value="220">Trinidad and Tobago</option>
												<option value="221">Tunisia</option>
												<option value="222">Turkey</option>
												<option value="223">Turkmenistan</option>
												<option value="224">Turks and Caicos Islands</option>
												<option value="225">Tuvalu</option>
												<option value="227">Ukraine</option>
												<option value="229">United Kingdom</option>
												<option value="230">United States</option>
												<option value="231">Uruguay</option>
												<option value="232">Uzbekistan</option>
												<option value="233">Vanuatu</option>
												<option value="234">Venezuela</option>
												<option value="235">Vietnam</option>
												<option value="236">Virgin Islands</option>
												<option value="237">Wallis and Futuna Islands</option>
												<option value="238">Yemen</option>
												<option value="239">Zambia</option>
												<option value="240">Zimbabwe</option>
												<option value="241">British</option>
												<option value="242">Korean</option>
												<option value="243">French</option>
												<option value="244">Thai</option>
												</select>
						</td>
						<td class="fieldlevel">State <span class="MandatoryField">*</span></td>
						<td class="fieldlevel">
						<div id="stateList1">
						<select name="intStateId1" id="intStateId1" onchange="getDistrictByStateId(this.value,'1')">
						<option value="">Select </option>
						</select>
						</div>
						</td>
					</tr>
					<tr>
						<td class="fieldlevel">District/Location/City <span class="MandatoryField">*</span></td>
						<td class="fieldlevel">
						<div id="districtList1">
						<select name="intDistrictId1" id="intDistrictId1">
						<option value="">Select</option>
						</select>
						</div>
						</td>
						<td class="fieldlevel3">Pin Code <span class="MandatoryField">*</span></td>
						<td colspan=""><input type="text" name="bankBranchPin1" id="bankBranchPin1" maxlength="6" onkeypress="return isNumberKey(event)"></td>
					</tr>
				</table>
			</td>
		</tr>
		<tr><td colspan="4" class="head-4">Bank Account Numbers</td></tr>
		<tr>
			<td colspan="4" style="padding-top:0px">
				<table width="100%" border="0" cellspacing="0" cellpadding="0" class="form-common">
					<tr>
						<td class="head-4">Account No.</td>
						<td class="head-4">Account Name</td>
						<td class="head-4">Account Purpose</td>
					</tr>
					<tr>
						<td><input type="text" name="accNo1_1" id="accNo1_1" style="width:150px" /></td>
						<td><input type="text" name="accName1_1" id="accName1_1" style="width:150px" /></td>
						<td>
							<input type="checkbox" style="width:20px" name="accPurpose1_1[]" id="accPurpose1_1_stuFee" value="Student Fee" />Student Fee
							<input type="checkbox" style="width:20px" name="accPurpose1_1[]" id="accPurpose1_1_empSal" value="Employee Salary" />Employee Salary
							<br />
							<input type="checkbox" style="width:20px" name="accPurpose1_1[]" id="accPurpose1_1_supPay" value="Supplier Payment" />Supplier Payment
							<input type="checkbox" style="width:20px" name="accPurpose1_1[]" id="accPurpose1_1_other" value="Other" />Other
						</td>
					</tr>
				</table>	
				<div id="addMoreBranch1_1"></div>
			</td>
					</tr>
					<tr>
						<td colspan="4">
							<input type="hidden" name="addMore1" id="addMore1" value="1">
							<input type="button" name="Add More" value="Add More" class="btn" onclick="AddMoreAccount('1')" />
							<input name="Remove" value="Remove" class="btn" onClick="removeAccNode('1')" type="button"></td>
					</tr>
				</table>
				<div id="strBranchAndAccDetailType_1"></div>
				<table width="100%" border="0" cellspacing="0" cellpadding="0" class="form-common">
					<tr>
						<td style="text-align:right" colspan="4">
						<input type="submit" name="submit" class="btn" value="Submit" onclick="return confirm('Are You Sure you want to Save it?\n Click OK to Continue, Cancel to Stop')">
						<input type="reset" name="reset" value="Reset" class="btn">
						<input type="button" name="cancel" class="btn" value="Cancel" onClick="javascript:history.back(-1)"></td>
					</tr>
				</table>
		<input type="hidden" name="noofcount" id="noofcount" value="1" />
	</form>
</div>

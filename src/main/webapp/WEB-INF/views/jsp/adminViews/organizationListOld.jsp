<%@ include file="../common/includes.jsp"%>
<c:url var="urlOrgEdit" value="/admin/orgEdit.htm" />
<c:url var="urlOrgSave" value="/admin/saveOrg.htm" />
<c:url var="urlOrgList" value="/admin/getOrgs.htm" />
<c:url var="urlOrgDelete" value="/admin/deleteOrg.htm" />

<style type="text/css">
.datagrid-row-over td {
	background: #D0E5F5;
}

.datagrid-row-selected td {
	background: #FBEC88;
}
</style>

<table id="dg" class="easyui-datagrid " toolbar="#toolbar" data-options="url:'${urlOrgList}',
																	     method:'get',
																	     border:false,
																	     fitColumns:true,
																	     autoRowHeight:false,
																	     singleSelect:true,
																	     nowrap:false,
																	     pagination:true,
																	     pagePosition:'top',
																	     scrollbarSize:0">
	<thead>
		<tr>
			<th data-options="field:'orgId',align:'center',sortable:'true',hidden:'true'" width="80">orgId</th>
			<th data-options="field:'orgName',align:'center',sortable:'true'" width="80">Organization Name</th>
			<th data-options="field:'employeeIdPrefix',align:'center',sortable:'true'" width="100">Employee ID Prefix</th>
			<th data-options="field:'address1',align:'center',sortable:'true'" width="80">Address</th>
			<th data-options="field:'stateString',align:'center',sortable:'true'" width="80">State</th>
			<th data-options="field:'districtString',align:'center',sortable:'true'" width="80">District</th>
			<th data-options="field:'pincode',align:'center',sortable:'true'" width="80">Pin Code</th>
			<th data-options="field:'email',align:'center',sortable:'true'" width="80">Email</th>
			<th data-options="field:'website',align:'center',sortable:'true'" width="80">Website</th>
		</tr>
	</thead>
</table>

<div id="toolbar">

	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newItem()">New</a> 
	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyItem()">Destroy</a>
</div>
<div style="margin: 20px 0;"></div>



<script type="text/javascript">
	$(function() {
		$('#dg').datagrid({
			view : detailview,
			detailFormatter : function(index, row) {
				return '<div class="ddv"></div>';
			},
			rowStyler : function(index, row) {
				if (index % 2 == 0) {
					return 'background-color:#f5f5f5;color:#000;';
				} else
					return 'background-color:#e0e0e0;color:#000;';

			},
			onExpandRow : function(index, row) {
				var ddv = $(this).datagrid('getRowDetail', index).find('div.ddv');
				ddv.panel({
					border : false,
					cache : true,
					height : 350,
					href : '${urlOrgEdit}',
					onLoad : function() {
						var cc = [];
						var hasLogo = $('#dg').datagrid('getRows')[index].logo;
						var imageDiv = 'imageDiv' + index;
						if (hasLogo !== null && typeof hasLogo !== 'undefined' && hasLogo.length > 0) {
							var imageId = $('#dg').datagrid('getRows')[index].orgId;
							var img = "image.htm?id=" + imageId;
							cc.push('<img src="/Gyaan/images/' + img + '" style="width: 100px;height:100px;padding: 10px;">');
						} else {
							cc.push('<input type="file" name="logo" class="fileUpload">');
							}

						$('#dg').datagrid('fixDetailRowHeight', index);
						$('#dg').datagrid('selectRow', index);
						$('#dg').datagrid('getRowDetail', index).find('form').form('load', row);
						$('#dg').datagrid('getRowDetail', index).find('#imageDiv').attr('id', imageDiv);
						document.getElementById(imageDiv).innerHTML = cc.join(' ');
					}
				});
				$('#dg').datagrid('fixDetailRowHeight', index);
			},
			onAppendRow : function(index, row) {
				var ddv = $(this).datagrid('getRowDetail', index).find('div.ddv');
				ddv.panel({
					border : false,
					cache : true,
					height : 350,
				});
				$('#dg').datagrid('fixDetailRowHeight', index);
			}
			
		});
		$('#dg').datagrid('getPanel').removeClass('lines-both lines-no lines-right lines-bottom').addClass('lines-no');
		$('#dg').datagrid('getPanel').attr('height', '10000px')
	});
	function saveItem(index) {
		var row = $('#dg').datagrid('getRows')[index];
		var url = '${urlOrgSave}';
		$('#dg').datagrid('getRowDetail', index).find('form').form('submit', {
			url : url,
			onSubmit : function() {
				return $(this).form('validate');
			},
			success : function(data) {
				//data = eval('('+data+')');

				$('#dg').datagrid('reload'); //this needs to change. above line does not reload.

				data.isNewRecord = false;
				$('#dg').datagrid('collapseRow', index);
				$('#dg').datagrid('updateRow', {
					index : index,
					row : data
				});
			}
		});
	}
	function cancelItem(index) {
		var row = $('#dg').datagrid('getRows')[index];
		if (row.isNewRecord) {
			$('#dg').datagrid('deleteRow', index);
		} else {
			$('#dg').datagrid('collapseRow', index);
		}
	}
	function destroyItem() {
		var row = $('#dg').datagrid('getSelected');
		if (row) {
			$.messager.confirm('Confirm', 'Are you sure you want to remove?', function(r) {
				if (r) {
					var index = $('#dg').datagrid('getRowIndex', row);
					var url = '/Gyaan/admin/deleteOrg.htm?orgId=' + row.orgId;
					$.post(url, {
						id : row.orgId
					}, function() {
						$('#dg').datagrid('deleteRow', index);
					});

				}
			});
		}
	}
	function newItem() {
		$('#dg').datagrid('appendRow', {
			isNewRecord : true
		});
		var index = $('#dg').datagrid('getRows').length - 1;
		$('#dg').datagrid('expandRow', index);
		$('#dg').datagrid('selectRow', index);
	}

	/* Pagination start */

	(function($) {
		function pagerFilter(data) {
			if ($.isArray(data)) { // is array
				data = {
					total : data.length,
					rows : data
				}
			}
			var dg = $(this);
			var state = dg.data('datagrid');
			var opts = dg.datagrid('options');
			if (!state.allRows) {
				state.allRows = (data.rows);
			}
			var start = (opts.pageNumber - 1) * parseInt(opts.pageSize);
			var end = start + parseInt(opts.pageSize);
			data.rows = $.extend(true, [], state.allRows.slice(start, end));
			return data;
		}

		var loadDataMethod = $.fn.datagrid.methods.loadData;
		$.extend($.fn.datagrid.methods, {
			clientPaging : function(jq) {
				return jq.each(function() {
					var dg = $(this);
					var state = dg.data('datagrid');
					var opts = state.options;
					opts.loadFilter = pagerFilter;
					var onBeforeLoad = opts.onBeforeLoad;
					opts.onBeforeLoad = function(param) {
						state.allRows = null;
						return onBeforeLoad.call(this, param);
					}
					dg.datagrid('getPager').pagination({
						onSelectPage : function(pageNum, pageSize) {
							opts.pageNumber = pageNum;
							opts.pageSize = pageSize;
							$(this).pagination('refresh', {
								pageNumber : pageNum,
								pageSize : pageSize
							});
							dg.datagrid('loadData', state.allRows);
						}
					});
					$(this).datagrid('loadData', state.data);
					if (opts.url) {
						$(this).datagrid('reload');
					}
				});
			},
			loadData : function(jq, data) {
				jq.each(function() {
					$(this).data('datagrid').allRows = null;
				});
				return loadDataMethod.call($.fn.datagrid.methods, jq, data);
			},
			getAllRows : function(jq) {
				return jq.data('datagrid').allRows;
			}
		})
	})(jQuery);

	function getData() {
		var rows = [];
		for (var i = 1; i <= 800; i++) {
			var amount = Math.floor(Math.random() * 1000);
			var price = Math.floor(Math.random() * 1000);
			rows.push({
				inv : 'Inv No ' + i,
				date : $.fn.datebox.defaults.formatter(new Date()),
				name : 'Name ' + i,
				amount : amount,
				price : price,
				cost : amount * price,
				note : 'Note ' + i
			});
		}
		return rows;
	}

	$(function() {
		$('#dg').datagrid({
			data : getData()
		}).datagrid('clientPaging');
	});

	/* Pagination end */

	/* Filter start */

	$(function() {
		var dg = $('#dg').datagrid();
		dg.datagrid('enableFilter', []);
	});

	/* Filter end */

	$('#dg').datagrid('getPanel').removeClass('lines-both lines-no lines-right lines-bottom').addClass('lines-no');

	/* var detailview = $.extend({}, $.fn.datagrid.defaults.view, {
	    renderRow: function(target, fields, frozen, rowIndex, rowData){
	        var cc = [];
	        cc.push('<td colspan=' + fields.length + ' style="padding:10px 5px;border:0;">');
	        if (!frozen){
	            var aa = rowData.itemid.split('-');
	            var img = 'image.htm/id=' + aa[1];
	            console.log('printing orgid')
	            console.log(aa[1])
	            cc.push('<img src="images/' + img + '" style="width:150px;float:left">');
	            cc.push('<div style="float:left;margin-left:20px;">');
	            for(var i=0; i<fields.length; i++){
	                var copts = $(target).datagrid('getColumnOption', fields[i]);
	                cc.push('<p><span class="c-label">' + copts.title + ':</span> ' + rowData[fields[i]] + '</p>');
	            }
	            cc.push('</div>');
	        }
	        cc.push('</td>');
	        return cc.join('');
	    }
	});
	
	$('#dg').datagrid({
	    view: detailview
	}); */

	$.extend($.fn.validatebox.defaults.rules, {
		notEquals : {
			validator : function(value, param) {
				return value !== $(param[0]).val();
			},
			message : 'Please select a value.'
		}
	});
</script>
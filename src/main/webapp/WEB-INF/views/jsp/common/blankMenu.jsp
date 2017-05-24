<%@ page pageEncoding="UTF-8"%>
<%@ include file="includes.jsp"%>
<!--Easy UI inclusion  -->
<link media="screen" rel="stylesheet" href="<c:url value="/css/easyui/themes/icon.css"/>" type="text/css"></link>
<link media="screen" rel="stylesheet" href="<c:url value="/css/jquery/jquery-ui-1.9.2.css"/>" type="text/css"></link>
<script src="<c:url value="/jquery/jquery-1.11.3.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/easyui/jquery.easyui.min.js"/>" /></script>
<link media="screen" rel="stylesheet" href="<c:url value="/css/inputFieldLayout.css"/>" type="text/css"/>	

 <!--  -->
<link media="screen" rel="stylesheet" href="<c:url value="/css/calendar.css"/>" type="text/css"/>
<script type="text/javascript" src="<c:url value="/easyui/datagrid-detailview.js"/>" /></script>
<link media="screen" rel="stylesheet" href="<c:url value="/plugins/datepicker/datepicker3.css"/>" type="text/css"></link>
<link media="screen" rel="stylesheet" href="<c:url value="/plugins/datepicker/datepicker.min.css"/>" type="text/css"></link>
<script type="text/javascript" src="<c:url value="/easyui/datagrid-filter.js"/>" /></script>
<script src="<c:url value="/plugins/datepicker/bootstrap-datepicker.js"/>"></script>
<link media="screen" rel="stylesheet" href="<c:url value="/css/easyui/themes/bootstrap/easyui.css"/>" type="text/css"></link>
 
<style>
#contentBodyGradient {
	background: rgba(179, 220, 237, 1);
	background: -moz-linear-gradient(top, rgba(179, 220, 237, 1) 0%, rgba(41, 184, 229, 1) 85%, rgba(188, 224, 238, 1) 100%);
	background: -webkit-gradient(left top, left bottom, color-stop(0%, rgba(179, 220, 237, 1)), color-stop(85%, rgba(41, 184, 229, 1)), color-stop(100%, rgba(188, 224, 238, 1)));
	background: -webkit-linear-gradient(top, rgba(179, 220, 237, 1) 0%, rgba(41, 184, 229, 1) 85%, rgba(188, 224, 238, 1) 100%);
	background: -o-linear-gradient(top, rgba(179, 220, 237, 1) 0%, rgba(41, 184, 229, 1) 85%, rgba(188, 224, 238, 1) 100%);
	background: -ms-linear-gradient(top, rgba(179, 220, 237, 1) 0%, rgba(41, 184, 229, 1) 85%, rgba(188, 224, 238, 1) 100%);
	background: linear-gradient(to bottom, rgba(179, 220, 237, 1) 0%, rgba(41, 184, 229, 1) 85%, rgba(188, 224, 238, 1) 100%);
	filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#b3dced', endColorstr='#bce0ee', GradientType=0);
}

.panel-header {
	background: rgba(255, 223, 184, 1);
	background: -moz-linear-gradient(top, rgba(255, 223, 184, 1) 0%, rgba(255, 184, 97, 1) 100%);
	background: -webkit-gradient(left top, left bottom, color-stop(0%, rgba(255, 223, 184, 1)), color-stop(100%, rgba(255, 184, 97, 1)));
	background: -webkit-linear-gradient(top, rgba(255, 223, 184, 1) 0%, rgba(255, 184, 97, 1) 100%);
	background: -o-linear-gradient(top, rgba(255, 223, 184, 1) 0%, rgba(255, 184, 97, 1) 100%);
	background: -ms-linear-gradient(top, rgba(255, 223, 184, 1) 0%, rgba(255, 184, 97, 1) 100%);
	background: linear-gradient(to bottom, rgba(255, 223, 184, 1) 0%, rgba(255, 184, 97, 1) 100%);
	filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#ffdfb8', endColorstr='#ffb861', GradientType=0);
}


.ribbon {
	background: rgba(255, 223, 184, 1);
	background: -moz-linear-gradient(top, rgba(255, 223, 184, 1) 0%, rgba(255, 184, 97, 1) 100%);
	background: -webkit-gradient(left top, left bottom, color-stop(0%, rgba(255, 223, 184, 1)), color-stop(100%, rgba(255, 184, 97, 1)));
	background: -webkit-linear-gradient(top, rgba(255, 223, 184, 1) 0%, rgba(255, 184, 97, 1) 100%);
	background: -o-linear-gradient(top, rgba(255, 223, 184, 1) 0%, rgba(255, 184, 97, 1) 100%);
	background: -ms-linear-gradient(top, rgba(255, 223, 184, 1) 0%, rgba(255, 184, 97, 1) 100%);
	background: linear-gradient(to bottom, rgba(255, 223, 184, 1) 0%, rgba(255, 184, 97, 1) 100%);
	filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#ffdfb8', endColorstr='#ffb861', GradientType=0);
}
.searchbox {
	background: rgba(255, 175, 75, 1);
	background: -moz-linear-gradient(top, rgba(255, 175, 75, 1) 0%, rgba(255, 146, 10, 1) 100%);
	background: -webkit-gradient(left top, left bottom, color-stop(0%, rgba(255, 175, 75 , 1)), color-stop(100%, rgba(255, 146, 10, 1)));
	background: -webkit-linear-gradient(top, rgba(255, 175, 75, 1) 0%, rgba(255, 146, 10, 1) 100%);
	background: -o-linear-gradient(top, rgba(255, 175, 75, 1) 0%, rgba(255, 146, 10, 1) 100%);
	background: -ms-linear-gradient(top, rgba(255, 175, 75, 1) 0%, rgba(255, 146, 10, 1) 100%);
	background: linear-gradient(to bottom, rgba(255, 175, 75, 1) 0%, rgba(255, 146, 10, 1) 100%);
	filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#ffaf4b', endColorstr='#ff920a', GradientType=0);
}
.searchResults {
	background: rgba(222, 229, 242, 1);
	background: -moz-linear-gradient(top, rgba(222, 229, 242, 1) 0%, rgba(161, 175, 206, 1) 51%, rgba(201, 208, 228, 1) 72%, rgba(195, 212, 253, 1) 89%, rgba(195, 212, 253, 1) 100%);
	background: -webkit-gradient(left top, left bottom, color-stop(0%, rgba(222, 229, 242, 1)), color-stop(51%, rgba(161, 175, 206, 1)), color-stop(72%, rgba(201, 208, 228, 1)), color-stop(89%, rgba(195, 212, 253, 1)), color-stop(100%, rgba(195, 212, 253, 1)));
	background: -webkit-linear-gradient(top, rgba(222, 229, 242, 1) 0%, rgba(161, 175, 206, 1) 51%, rgba(201, 208, 228, 1) 72%, rgba(195, 212, 253, 1) 89%, rgba(195, 212, 253, 1) 100%);
	background: -o-linear-gradient(top, rgba(222, 229, 242, 1) 0%, rgba(161, 175, 206, 1) 51%, rgba(201, 208, 228, 1) 72%, rgba(195, 212, 253, 1) 89%, rgba(195, 212, 253, 1) 100%);
	background: -ms-linear-gradient(top, rgba(222, 229, 242, 1) 0%, rgba(161, 175, 206, 1) 51%, rgba(201, 208, 228, 1) 72%, rgba(195, 212, 253, 1) 89%, rgba(195, 212, 253, 1) 100%);
	background: linear-gradient(to bottom, rgba(222, 229, 242, 1) 0%, rgba(161, 175, 206, 1) 51%, rgba(201, 208, 228, 1) 72%, rgba(195, 212, 253, 1) 89%, rgba(195, 212, 253, 1) 100%);
	filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#dee5f2', endColorstr='#c3d4fd', GradientType=0);
}
</style>
<script>
function sprout(to, from) {
		var parentId = ''
		if (from != undefined) {
			parentId = $('#' + from).val()
		}
		var url = '/Gyaan/lookup/' + to + '.htm?parentId=' + parentId
		var options = $('#' + to)
		$.getJSON(url, function(data) {
			options.html('');
			$.each(data, function(key, val) {
				options.append($("<option />").val(this.id).text(this.name));
			})
		});
	}
	
function sproutEntity(to, entity) {
	var url = '/Gyaan/lookup/' + entity + '.htm';
	var options = $('#' + to);
	$.getJSON(url, function(data) {
		options.html('');
		$.each(data, function(key, val) {
			options.append($("<option />").val(this.id).text(this.name));
		})
	});
}

function sproutOnChangeEntity(to,from, entity) {
	var parentId = ''
	if (from != undefined) {
		parentId = $('#' + from).val()
	}
	var url = '/Gyaan/lookup/' + entity + '.htm?parentId=' + parentId;
	var options = $('#' + to);
	$.getJSON(url, function(data) {
		options.html('');
		$.each(data, function(key, val) {
			options.append($("<option />").val(this.id).text(this.name));
		})
	});
}

</script>
<tiles:insertAttribute name="content" />


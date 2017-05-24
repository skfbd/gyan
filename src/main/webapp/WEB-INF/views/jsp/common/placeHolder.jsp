<%@ page pageEncoding="UTF-8"%>
<%@ include file="includes.jsp"%>
<%@ page session="true"%>



<script>
function sprout(to, from) {
		var parentId = ''
		if (from != undefined) {
			parentId = $('#' + from).val()
		}
		var url = '/Gyaan/lookup/' + to + '.htm?parentId=' + parentId
		var options = $('#' + to)
		$.getJSON(url, function(data) {
			options.html($("<option />").val('0').text('Select'));
			$.each(data, function(key, val) {
				options.append($("<option />").val(this.id).text(this.name));
			})
		});
	}
</script>



<tiles:insertAttribute name="placeHolder" />


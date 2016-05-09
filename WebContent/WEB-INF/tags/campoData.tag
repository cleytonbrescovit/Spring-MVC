<%@ attribute name="id" required="true" %>
<%@ attribute name="value" required="true" %>

<input id="${id}" name="${id}" value="${value}" >

<script>
	$("#${id}").datepicker({dateFormat: 'dd/mm/yy'});
	$("#${value}").datepicker({dateFormat: 'dd/mm/yy'});
</script>
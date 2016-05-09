<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="me" %>
<html>
<head>
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Alterar tarefa - ${tarefa.id}</h3>	
	<form action="alteraTarefa" method="post">
		<input type="hidden" name="id" value="${tarefa.id}" /> 
		Descrição: 
		<br />
		<textarea name="descricao" cols="100" rows="5">${tarefa.descricao}</textarea>
		<br /> 
		Finalizado?
		<input type="checkbox" name="finalizado" value="true" ${tarefa.finalizado? 'checked' : '' } /> 
		<br /> 
		Data de finalização: <br /> 
		<input type="text" name="dataFinalizacao" value="<fmt:formatDate value="${tarefa.dataFinalizacao.time}" pattern="dd/MM/yyyy" />"/>
		<br /> 
		<input type="submit" value="Alterar" />
	</form>	
</body>
</html>
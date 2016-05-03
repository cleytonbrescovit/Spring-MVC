<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<script type="text/javascript" src="resources/jquery.js"></script>
</head>
<body>
	<script type="text/javascript">
  function finalizaAgora(id) {
    $.post("finalizaTarefa", {'id' : id}, function(resposta) {
      $("#tarefa_"+id).html("Finalizado");
      $("#tarefa_data_"+id).html(resposta);
    });
  }
</script>

	<a href="novaTarefa">Criar nova tarefa</a>

	<br />
	<br />

	<table border="1">
		<tr>
			<th>Id</th>
			<th>Descrição</th>
			<th>Finalizado?</th>
			<th>Data de finalização</th>
			<th>Altera</th>
			<th>Remove</th>
		</tr>
		<c:forEach items="${tarefa}" var="tarefas">
			<tr>
				<td>${tarefas.id}</td>
				<td>${tarefas.descricao}</td>
				<c:if test="${tarefas.finalizado eq 0}">
					<td id="tarefa_${tarefas.id}"><a href="#"
						onClick="finalizaAgora(${tarefas.id})"> Finaliza agora! </a></td>
				</c:if>
				<c:if test="${tarefas.finalizado eq 1}">
					<td id="tarefa_data_${tarefa.id}">
					  <fmt:formatDate value="${tarefa.dataFinalizacao.time}" pattern="dd/MM/yyyy" />
					</td>
				</c:if>
				<td>
				<td align="center"><a href="mostraTarefa?id=${tarefas.id}">e</a></td>
				<td align="center"><a href="removeTarefa?id=${tarefas.id}">x</a></td>
				<fmt:formatDate value="${tarefas.dataFinalizacao.time}"
					pattern="dd/MM/yyyy" />
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
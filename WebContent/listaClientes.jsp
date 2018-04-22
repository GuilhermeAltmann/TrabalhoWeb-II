<%@ page import="java.util.*,
			classes.*,
			dao.*"%>
<%@ include file="header.jsp"%>
<body>
	<%@ include file="menu.jsp"%>
	<section class="container-fluid">
		<div class="row">
			<div class="col">
				<h2>Lista de Clientes</h2>
			</div>
			<div class="col">
				<a class="btn btn-success  float-right" href="cadastroCliente.jsp" role="button">Adicionar Cliente</a>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<table class="table table-striped">
					<thead>
						<tr>
							<th scope="col">Nome</th>
							<th scope="col">CPF</th>
							<th scope="col">Alterar</th>
							<th scope="col">Excluir</th>
						</tr>
					</thead>
					<tbody>
						<%
							ClienteDao dao = new ClienteDao();
							List<Cliente> clientes = dao.getLista();
							for (Cliente cli : clientes) {
						%>
						<tr>
							<td><%=cli.getPessoa().getNome()%></td>
							<td><%=cli.getPessoa().getCpf()%></td>
							<td></td>
							<td></td>
						</tr>
						<%
							}
						%>
					</tbody>
				</table>
			</div>
		</div>
	</section>
</body>
</html>
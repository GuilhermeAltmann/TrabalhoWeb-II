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
				<a class="btn btn-success  float-right" href="cadastroContato.jsp" role="button">Adicionar Contato</a>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<table class="table table-striped">
					<thead>
						<tr>
							<th scope="col">Nome</th>
							<th scope="col">Email</th>
							<th scope="col">Telefone</th>
							<th scope="col">Alterar</th>
							<th scope="col">Excluir</th>
						</tr>
					</thead>
					<tbody>
						<%
							ContatoDao dao = new ContatoDao();
							List<Contato> contatos = dao.getLista();
							for (Contato con : contatos) {
						%>
						<tr>
							<td><%=con.getPessoa().getNome()%></td>
							<td><%=con.getEmail()%></td>
							<td><%=con.getTelefone()%></td>
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
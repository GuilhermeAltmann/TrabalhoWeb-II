<%@ page import="java.util.*,
			classes.*,
			dao.*"%>
<%@ include file="header.jsp"%>
<body>
	<%@ include file="menu.jsp"%>
	<section class="container-fluid">
		<div class="row">
			<div class="col">
				<h2>Lista de Especialidades</h2>
			</div>
			<div class="col">
				<a class="btn btn-success  float-right" href="cadastroEspecialidade.jsp" role="button">Adicionar Especialidade</a>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<table class="table table-striped">
					<thead>
						<tr>
							<th scope="col">Especialidade</th>
							<th scope="col">Alterar</th>
							<th scope="col">Excluir</th>
						</tr>
					</thead>
					<tbody>
						<%
							EspecialidadeDao dao = new EspecialidadeDao();
							List<Especialidade> especialidades = dao.getLista();
							for (Especialidade esp : especialidades) {
						%>
						<tr>
							<td><%=esp.getDescricao()%></td>
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
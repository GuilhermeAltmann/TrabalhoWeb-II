<%@ include file="header.jsp"%>
<body>
	<%@ include file="menu.jsp"%>
	<section class="container-fluid">
		<h2>Cadastro de Especialidades</h2>
		<form action="cadastrarespecialidade" method="post">
		  <div class="form-group">
		    <label for="descricao">Especialidade</label>
		    <input type="text" class="form-control" id="descricao" name="descricao" placeholder="Especialidade" required>
		  </div>
		  <button type="submit" class="btn btn-primary">Salvar Especialidade</button>
		</form>
	</section>
</body>
</html>
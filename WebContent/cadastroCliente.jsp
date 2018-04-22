<%@ include file="header.jsp"%>
<body>
	<%@ include file="menu.jsp"%>
	<section class="container-fluid">
		<h2>Cadastro de Clientes</h2>
		<form>
		  <div class="form-group">
		    <label for="nome">Nome</label>
		    <input type="text" class="form-control" id="nome" placeholder="Nome" required>
		  </div>
		  <div class="form-group">
		    <label for="cpf">Cpf</label>
		    <input type="text" class="form-control" id="cpf" placeholder="CPF" required>
		  </div>
		  <div class="form-group">
		    <label for="rg">RG</label>
		    <input type="text" class="form-control" id="rg" placeholder="RG">
		  </div>
		  <button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</section>
</body>
</html>
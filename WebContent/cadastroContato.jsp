<%@ include file="header.jsp"%>
<body>
	<%@ include file="menu.jsp"%>
	<section class="container-fluid">
		<h2>Cadastro de Contatos</h2>
		<form action="cadastrarcliente" method="post">
		  <div class="form-group">
		    <label for="nome">Parentesco</label>
		    <input type="text" class="form-control" id="parentesco" name="parentesco" placeholder="Pai">
		  </div>
		  <div class="form-group">
		    <label for="telefone">Telefone</label>
		    <input type="text" class="form-control" id="telefone" name="telefone" placeholder="(99) 999999999">
		  </div>
		  <div class="form-group">
		    <label for="endereco">Endereço</label>
		    <input type="text" class="form-control" id="endereco" name="endereco" placeholder="Rua x, 229">
		  </div>
		  <div class="form-group">
		    <label for="email">Email</label>
		    <input type="text" class="form-control" id="email" name="email" placeholder="email@email.com">
		  </div>
		  <div class="form-group">
		    <label for="idpessoa">Pessoa</label>
		    <select class="form-control" id="idpessoa" name="idpessoa">
		      
		    </select>
		  </div>
		  <button type="submit" class="btn btn-primary">Salvar Contato</button>
		</form>
	</section>
</body>
</html>
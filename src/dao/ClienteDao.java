package dao;

import classes.Cliente;

public class ClienteDao extends DaoCore{

	public ClienteDao() {
		
		super();
	}

	public void adiciona(Cliente cli) {
		
		String sql =
				   "insert into clientes" +
				   "(idpessoa)" +
				   " values (?)";
	}
}

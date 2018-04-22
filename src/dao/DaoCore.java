package dao;

import java.sql.Connection;

import database.ConnectionFactory;

public class DaoCore {

	// a conexão com o banco de dados
	protected Connection connection;

	public DaoCore() {
		
		try {
			
			this.connection = new ConnectionFactory().getConnection();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
	}
	
}

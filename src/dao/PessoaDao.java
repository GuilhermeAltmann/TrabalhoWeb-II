package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

import classes.Pessoa;

public class PessoaDao extends DaoCore{

	public PessoaDao() {
		super();
	}
	
	/**
	 * 
	 * @param pes
	 * @return retorna id da pessoa inserida
	 */
	public int adiciona(Pessoa pes) {
		
		String sql =
				   "insert into pessoas" +
				   "(nome, cpf, rg)" +
				   " values (?, ?, ?, ?, ?)";
		
		try {
			
			PreparedStatement stmt = this.connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			stmt.setString(1, pes.getNome());
			stmt.setString(2, pes.getCpf());
			stmt.setString(3, pes.getRg());
			
		}catch(SQLException e) {
			
			throw new RuntimeException(e);
		}
		
		return 0;
	}
}

package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Statement;

import classes.Especialidade;
import classes.Pessoa;

public class EspecialidadeDao extends DaoCore{

	public EspecialidadeDao() {
		super();
	}
	
	public void adiciona(Especialidade esp) {
		
		String sql =
				   "insert into especialidades" +
				   "(descricao)" +
				   " values (?)";
		
		try {
			
			PreparedStatement stmt = this.connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			stmt.setString(1, esp.getDescricao());
			
			stmt.execute();
			stmt.close();
			
		}catch(SQLException e) {
			
			throw new RuntimeException(e);
		}
		
	}
	
	public List<Especialidade> getLista(){
		
		try {
			
			List<Especialidade> especialiades = new ArrayList<Especialidade>();
			
			PreparedStatement stmt = connection.prepareStatement("SELECT *" + 
					"FROM especialidades\n" + 
					"ORDER BY descricao");
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				
				Especialidade esp = new Especialidade();
				
				esp.setDescricao(rs.getString("descricao"));
				
				especialiades.add(esp);
			}
			
			rs.close();
			stmt.close();
			
			return especialiades;
		}catch(SQLException e) {
			
			throw new RuntimeException(e);
		}
	}
}

package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import classes.Cliente;
import classes.Pessoa;

public class ClienteDao extends DaoCore {

	public ClienteDao() {

		super();
	}

	public void adiciona(Cliente cli) {

		String sql = "insert into clientes (idpessoa) values (?)";

		try {

			// prepared statement para inserção
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setInt(1, cli.getPessoa().getId());
			// executa
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {

			throw new RuntimeException(e);
		}
	}
	
	public List<Cliente> getLista(){
		
		try {
			
			List<Cliente> clientes = new ArrayList<Cliente>();
			PreparedStatement stmt = connection.prepareStatement("SELECT *" + 
					"FROM clientes cli\n" + 
					"JOIN pessoas pes ON pes.idpessoa = cli.idpessoa");
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				
				Pessoa p = new Pessoa();
				Cliente c = new Cliente();
				
				p.setNome(rs.getString("nome"));
				p.setRg(rs.getString("rg"));
				p.setCpf(rs.getString("cpf"));
				p.setId(rs.getInt("idpessoa"));
				
				c.setPessoa(p);
				
				clientes.add(c);
			}
			
			rs.close();
			stmt.close();
			
			return clientes;
		}catch(SQLException e) {
			
			throw new RuntimeException(e);
		}
	}
}

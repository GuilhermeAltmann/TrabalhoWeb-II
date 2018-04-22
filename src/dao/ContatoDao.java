package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import classes.Contato;
import classes.Pessoa;

public class ContatoDao extends DaoCore{

	public ContatoDao() {
		
		super();
	}
	
	public void adiciona(Contato con) {
		
		String sql = "insert into "
				+ "contatos (parentesco, telefone, endereco, email, idpessoa) "
				+ "values (?,?,?,?,?)";
		
		try {
			
			// prepared statement para inserção
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, con.getParentesco());
			stmt.setString(2, con.getTelefone());
			stmt.setString(3, con.getEndereco());
			stmt.setString(4, con.getEmail());
			stmt.setInt(5, con.getPessoa().getId());
			
			// executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {

			throw new RuntimeException(e);
		}
	}
	
	public List<Contato> getLista(){
		
		try {
			
			List<Contato> contatos = new ArrayList<Contato>();
			
			PreparedStatement stmt = connection.prepareStatement("SELECT *" + 
					"FROM contatos con\n" + 
					"JOIN pessoas pes ON pes.idpessoa = con.idpessoa\n"
					+ "ORDER BY pes.nome");
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				
				Pessoa p = new Pessoa();
				Contato c = new Contato();
				
				p.setNome(rs.getString("nome"));
				p.setRg(rs.getString("rg"));
				p.setCpf(rs.getString("cpf"));
				p.setId(rs.getInt("idpessoa"));
				
				c.setPessoa(p);
				c.setEmail(rs.getString("email"));
				c.setEndereco(rs.getString("endereco"));
				c.setParentesco(rs.getString("parentesco"));
				c.setTelefone(rs.getString("telefone"));
				c.setId(rs.getInt("idcontato"));
				
				contatos.add(c);
			}
			
			rs.close();
			stmt.close();
			
			return contatos;
		}catch(SQLException e) {
			
			throw new RuntimeException(e);
		}
	}
}

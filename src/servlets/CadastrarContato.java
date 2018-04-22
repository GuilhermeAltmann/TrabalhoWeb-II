package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.Cliente;
import classes.Contato;
import classes.Pessoa;
import dao.ClienteDao;
import dao.ContatoDao;


@WebServlet("/cadastrarcontato")
public class CadastrarContato extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Pessoa pes = new Pessoa();
		
		pes.setId(Integer.parseInt(req.getParameter("idpessoa")));
		
		Contato con = new Contato();
		con.setPessoa(pes);
		con.setEmail(req.getParameter("email"));
		con.setEndereco(req.getParameter("endereco"));
		con.setParentesco(req.getParameter("parentesco"));
		con.setTelefone(req.getParameter("telefone"));
		
		ContatoDao daoc = new ContatoDao();
		daoc.adiciona(con);
		
		resp.sendRedirect("listaContatos.jsp");
	}
}

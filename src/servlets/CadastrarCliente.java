package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.Cliente;
import classes.Pessoa;
import dao.PessoaDao;

@WebServlet("/cadastrarcliente")
public class CadastrarCliente extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Pessoa pes = new Pessoa();
		pes.setNome(req.getParameter("nome"));
		pes.setCpf(req.getParameter("cpf"));
		pes.setRg(req.getParameter("rg"));
		
		PessoaDao daop = new PessoaDao();
		
		pes.setId(daop.adiciona(pes));
		
		Cliente cli = new Cliente();
		cli.setPessoa(pes);
		
	}
}

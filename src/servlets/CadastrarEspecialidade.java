package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.Cliente;
import classes.Contato;
import classes.Especialidade;
import classes.Pessoa;
import dao.ClienteDao;
import dao.ContatoDao;
import dao.EspecialidadeDao;


@WebServlet("/cadastrarespecialidade")
public class CadastrarEspecialidade extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Especialidade esp = new Especialidade();
		
		esp.setDescricao(req.getParameter("descricao"));
		
		EspecialidadeDao daoc = new EspecialidadeDao();
		daoc.adiciona(esp);
		
		resp.sendRedirect("listaEspecialidades.jsp");
	}
}

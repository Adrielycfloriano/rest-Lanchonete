package br.com.lanchonete.projeto.PaginaInicial;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class lanchonetePaginaPrincipal
 */
@WebServlet("/paginaInicial")
public class PaginaInicial extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

				RequestDispatcher rd = request.getRequestDispatcher("/cardapio.jsp");
		rd.forward(request, response);
	}

}

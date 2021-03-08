package br.com.lanchonete.projeto.Cardapio;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.parser.Scanner;

/**
 * Servlet implementation class AdicionarCesta
 */
@WebServlet("/cardapio")
public class Cardapio extends HttpServlet {

	static Scanner escolhido = new Scanner();
	private static final long serialVersionUID = 1L;

	/**
	 * @throws ServletException
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		String[] arrayCardapio = new String[10];
		List<String> adicionarCardapio = new ArrayList<>();

		arrayCardapio = request.getParameterValues("cardapio");
		adicionarCardapio = Arrays.asList(arrayCardapio);
		request.setAttribute("cardapio", adicionarCardapio);

		RequestDispatcher rd = request.getRequestDispatcher("/carrinho.jsp");
		rd.forward(request, response);

	}

}

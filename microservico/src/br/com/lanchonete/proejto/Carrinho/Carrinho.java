package br.com.lanchonete.proejto.Carrinho;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.lanchonete.projeto.Cardapio.CardapioModel;
import br.com.lanchonete.projeto.Cardapio.ListaCardapio;

@WebServlet("/carrinho")
public class Carrinho extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		System.out.println("Lanche adicionado");


	
	
		/*
		 * AdicionarDescricao verdescricao = new AdicionarDescricao(); List<String>
		 * lista = verdescricao.getDescricao();
		 * 
		 * req.setAttribute("cesta", lista); RequestDispatcher rd =
		 * req.getRequestDispatcher("/cesta.jsp"); rd.forward(req, resp);
		 */
	}

}
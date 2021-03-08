package br.com.lanchonete.proejto.Carrinho;

import java.util.ArrayList;
import java.util.List;

public class AdicionarDescricao {
	
	 String quantidades;
	
	private static List<Double> cardapio = new ArrayList<>();
	private static List<String> descricao = new ArrayList<>();

	public List<String> getDescricao() {
		return AdicionarDescricao.descricao;
	}
	
	public String getQuantidades() {
		return quantidades;
	}

	public void adicionar(String cardapio) {
		descricao.add(cardapio);
	}

	public boolean montarDescricao(String produto) {
		return descricao.add(getQuantidades() + "x" + produto);
	}
	
	@Override
	public String toString() {
		return "Seu carrinho [quantidade=" + quantidades + ", descricao=" + descricao + "]";
	}
}

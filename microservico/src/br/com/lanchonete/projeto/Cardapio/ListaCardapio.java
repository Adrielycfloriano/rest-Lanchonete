package br.com.lanchonete.projeto.Cardapio;

import java.util.ArrayList;
import java.util.List;

public class ListaCardapio {

	private List<CardapioModel> listaCardapio = new ArrayList<>();

	public void setListaCardapio(List<CardapioModel> listaCardapio) {
		this.listaCardapio = listaCardapio;
	}

	public void adiciona(CardapioModel cardapioModel) {

		ListaCardapio.this.listaCardapio.add(cardapioModel);

	}

	public List<CardapioModel> getListaCardapio() {
		return listaCardapio;
	}
}

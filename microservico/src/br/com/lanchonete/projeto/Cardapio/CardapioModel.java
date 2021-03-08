package br.com.lanchonete.projeto.Cardapio;

public class CardapioModel {

	private String item;
	private String quantidade;
	private double preco;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produtos [Item=" + item + ", Quantidade=" + quantidade + "]";

	}

	public double valorTotal( double quantidades) {
		return preco * quantidades;
	}
}

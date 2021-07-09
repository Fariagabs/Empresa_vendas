package modelo;

import java.text.DecimalFormat;

public class Produto {
	private String nome;
	private double percentual_lucro;
	private double preco_custo;
	private int quant_estoque;
	private int quant_min_estoque;
	private Fornecedor fornecedor;
	private static int idProduto = 1;
	private int codProduto = 0;
	
	public String toString() {
		return "Nome: " + nome + "; Percentual de Lucro: " + percentual_lucro + "%" + "; Preço De Custo: R$" + preco_custo + "; Quant em Estoque: " + quant_estoque + "; Quant Min em Estoque: " + quant_min_estoque;
 	}
	
	public String identificador(){
		String id;
		id = "P" + this.codProduto;
		return id;
	}
	
	public Produto (String nome, double percentual_lucro, double preco_custo, int quant_estoque, int quant_min_estoque, Fornecedor fornecedor) {
		this.nome = nome;
		this.percentual_lucro = percentual_lucro;
		this.preco_custo = preco_custo;
		this.quant_estoque = quant_estoque;
		this.quant_min_estoque = quant_min_estoque;
		this.fornecedor = fornecedor;
		this.codProduto = idProduto++;
 	}
	
	public Produto(Produto produto) {
		this.nome = produto.nome;
		this.percentual_lucro = produto.percentual_lucro;
		this.preco_custo = produto.preco_custo;
		this.quant_estoque = produto.quant_estoque;
		this.quant_min_estoque = produto.quant_min_estoque;
		this.fornecedor = produto.fornecedor;
		this.codProduto = produto.codProduto;
	}

	public String precoVenda() {
		double percentualLucro = (percentual_lucro * 0.01);
		double lucro = preco_custo * percentualLucro;
		double precoVenda = preco_custo + lucro;
		float preco = (float)precoVenda;
		DecimalFormat f = new DecimalFormat("#.##");
		return f.format(preco);
	}
	
	public Produto getProduto() {
		return new Produto(nome, percentual_lucro, preco_custo, quant_estoque, quant_min_estoque, this.fornecedor);
	}
	
}

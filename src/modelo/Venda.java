package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Venda {
	private static int idVenda = 0;
	private String dataVenda;
	private Produto produto;
	private double valor;
	private Cliente cliente;
	private Fornecedor fornecedor;
	
	public String toString() {
		return dataVenda + " - " + getProduto() + " - " + " R$" + valor + " - Cliente:" + getCliente() + "- Fornecedor:" + getFornecedor();
	}

	
	public String Id (){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ano = LocalDate.parse(dataVenda, formatter);
		String id = ano.getYear() + " - " + Venda.idVenda;
		return id;
	}
	
	
	public Venda (String dataVenda, Produto produto, double valor, Cliente cliente, Fornecedor fornecedor) {
		Venda.idVenda = idVenda + 1;
		this.dataVenda = dataVenda;
		this.setProduto(produto);
		this.valor = valor;
		this.setCliente(cliente);
		this.setFornecedor(fornecedor);
	}
	


	public String DataVenda() {
		return this.dataVenda;
	}
	
	public double Valor(){
		return this.valor;
	}


	public Fornecedor getFornecedor() {
		return new Fornecedor(this.fornecedor);
	}


	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}


	public Produto getProduto() {
		return new Produto(this.produto);
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public Cliente getCliente() {
		return new Cliente(this.cliente);
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
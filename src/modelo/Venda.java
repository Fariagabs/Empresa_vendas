package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Venda {
	private static int idVenda = 1;
	private int codVenda = 0;
	private String dtVenda;
	private Produto produto;
	private double valor;
	private Cliente cliente;
	private Fornecedor fornecedor;
	private Pagamento pagamento;
	
	
	public String toString() {
		return dtVenda + " - PRODUTO: " + this.produto.getProduto() + " - " + " R$" + valor + " - CLIENTE:" + this.cliente.getCliente() + "- FORNECEDOR:" + this.fornecedor.getFornecedor() + " - PAGAMENTO: " + IdentificadorDePagamento.getTipo(pagamento);
	}

	
	public String Id (String dtVenda){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataVenda = LocalDate.parse(dtVenda,formatter);
		String identificador = dataVenda.getYear() + " - " + this.codVenda;
		return identificador;
	}

	
	public Venda (String dtVenda, Produto produto, double valor, Cliente cliente, Fornecedor fornecedor, Pagamento pagamento) {
		this.codVenda = idVenda++;
		this.dtVenda = dtVenda;
		this.produto = produto;
		this.valor = valor;
		this.cliente = cliente;
		this.fornecedor = fornecedor;
		this.pagamento = pagamento;
	}
	

	public String DataVenda() {
		return this.dtVenda;
	}

	public double getValor(){
		return this.valor;
	}
	
	public String getNomeProduto() {
		return produto.getNome();
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
}
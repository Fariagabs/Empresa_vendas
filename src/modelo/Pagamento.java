package modelo;

public abstract class Pagamento {
	
	protected double valorVenda;
	protected double valorAPagar;
	
	public Pagamento(double valorVenda) {
		super();
		this.valorVenda = valorVenda;
	}
	
	abstract public String descricaoPagamento();
	
}

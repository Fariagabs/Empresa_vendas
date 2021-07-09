package modelo;


public class PagVista extends Pagamento{
	
	private double desconto;

	public PagVista(double valorVenda, double desconto) {
		super(valorVenda);
		this.desconto = desconto;
	}
	
	public double valorPag(double valorVenda, double desconto) {
		desconto = desconto / 100;
		double desc = valorVenda * desconto;
		valorAPagar = valorVenda - desc;
		return valorAPagar;
	}
	
	@Override
	public String descricaoPagamento(){
		String descricao = "Pagamento a vista no valor de: R$" + valorVenda + " ,com desconto de: R$" + desconto;
		return descricao;
	}
	
}

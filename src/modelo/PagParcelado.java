package modelo;

import java.text.DecimalFormat;

public class PagParcelado extends Pagamento{
	
	private double juros;
	private int parcelas;

	public PagParcelado(double valorVenda, double juros, int parcelas) throws MuitasParcelasException {
		super(valorVenda);
		this.juros = juros;
		this.setParcelas(parcelas);
	}
	
	public double jurosSobreParcelas() {
		double j = juros / 100;
		double jurosReal = 1;
		jurosReal = jurosReal + j;
		double jurosParcelas = Math.pow(jurosReal, parcelas);
		return jurosParcelas;
	}
	
	
	public void setParcelas(int parcelas) throws MuitasParcelasException {
		if (parcelas > 6) {
			throw new MuitasParcelasException("Pagamento maior que 6 parcelas não é permitido!");
		}
		this.parcelas = parcelas;
	}

	private double ValorPagamento() {
		double valorPagamento = valorVenda * jurosSobreParcelas();
		return valorPagamento;
	}
	
	private String mostraPagamento() {
		float valor = (float) ValorPagamento();
		DecimalFormat f = new DecimalFormat("#.##");
		return f.format(valor);
	}
	
	public double calculoParcela() {
		double valorParcela = ValorPagamento() * jurosSobreParcelas();
		return valorParcela;
	}
	
	private String mostraParcela() {
		float valor = (float) calculoParcela();
		DecimalFormat f = new DecimalFormat("#.##");
		return f.format(valor);
	}
	
	
	@Override
	public String descricaoPagamento() {
		String descricao = "Pagamento em " + parcelas + " parcelas de R$" + mostraParcela() + " com juros mensais de " + juros + "%, totalizando: R$" + mostraPagamento();
		return descricao;
	}
}

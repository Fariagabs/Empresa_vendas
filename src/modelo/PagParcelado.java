package modelo;

import java.text.DecimalFormat;

public class PagParcelado extends Pagamento{
	
	private double juros;
	private int parcelas;
	private double valorPagamento;
	private double calcJurosParcelas;
	private double valorParcela;


	public PagParcelado(double valorVenda, double juros, int parcelas) {
		super(valorVenda);
		this.juros = juros;
		this.parcelas = parcelas;
	}
	
	public double calcValorPagamento() {
		double j = juros / 100;
		double jurosReal = 1;
		jurosReal = jurosReal + j;
		calcJurosParcelas = Math.pow(jurosReal, parcelas);
		valorPagamento = valorVenda * calcJurosParcelas;
		return valorPagamento;
	}
	
	private String mostraPagamento() {
		float valor = (float) calcValorPagamento();
		DecimalFormat f = new DecimalFormat("#.##");
		return f.format(valor);
	}
	
	public double calculoParcela() {
		valorParcela = calcValorPagamento() * calcJurosParcelas;
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

package modelo;


public class IdentificadorDePagamento {

	
	public static String getTipo(Pagamento pagamento){
		return pagamento.descricaoPagamento();
	}
}
	
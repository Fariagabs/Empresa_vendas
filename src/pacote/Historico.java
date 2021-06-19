package pacote;

import modelo.Venda;
import java.util.ArrayList;

public class Historico {
	private static ArrayList<Venda> listaVendas = new ArrayList<Venda>();
	
	
	public static String infoVenda(Venda a) {
		return "Fornecedor: " + a.getFornecedor() + " \nCliente: " + a.getCliente() + " \nProduto: " + a.getProduto() + "\nData da Venda: " + a.DataVenda() + " ; Preço: R$" + a.Valor();
	}
	
	public static void adicionar(Venda a) {
		listaVendas.add(a);
	}
	
	public static void excluir(Venda a) {
		listaVendas.remove(a);
	}
	
	public void verificaExistencia(Venda a) {
		if (listaVendas.contains(a)) {
			System.out.println("Elemento existente.");
		}
		else {
			System.out.println("Elemento inexistente.");
		}
	}
	
	public static float lucroTotal(ArrayList<Venda> listaVendas) {
		float lucro = 0;
		for (Venda lista : listaVendas) {
			lucro = (float) (lucro + lista.Valor());
		}
		return lucro;
	}

	public static Object getListaVendas() {
		return listaVendas.clone();
	}

	
	
}

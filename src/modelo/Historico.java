package modelo;

import java.util.ArrayList;

public class Historico {
	
		private static ArrayList<Venda> listaVendas = new ArrayList<Venda>();
		
		
		public static String infoVenda(Venda a) {
			return a.toString();
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
		
		public static float lucroTotal() {
			float lucro = 0;
			for (Venda lista : listaVendas) {
				lucro = (float) (lucro + lista.getValor());
			}
			return lucro;
		}

		public static Object getListaVendas() {
			return listaVendas.clone();
		}

		
		
	}


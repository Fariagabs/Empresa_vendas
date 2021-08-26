package teste;

import java.util.Set;

import modelo.Cliente;
import modelo.Fornecedor;
import modelo.MuitasParcelasException;
import modelo.Produto;
import modelo.Venda;
import modelo.Pagamento;
import modelo.PagVista;
import modelo.PagParcelado;
import modelo.DivisaoCategorias;
import modelo.CategoriasDeCompras;

public class Teste {

	private static Venda venda4;
	private static Venda venda7;

	public static void main(String[] args) {
		Fornecedor fornecedor1 = new Fornecedor("Gabriel", "Diretor", "eu.eu@gmail.com", "Masculino", "Concessionaria");
		Fornecedor fornecedor2 = new Fornecedor("Joao", "gerente", "joao.gerente@gmail.com", "Masculino", "Loja de venda de placas de video");
		Fornecedor fornecedor3 = new Fornecedor("Carlos", "supervisor", "carlos.carlos@gmail.com", "Masculino", "otica");
		
		Produto produto1 = new Produto("Hilux", 30, 199999.90, 50, 15, fornecedor1);
		Produto produto2 = new Produto("Corolla", 30, 149998.90, 80, 16, fornecedor1);
		Produto produto3 = new Produto("Placa de video Geforce RTX 2060Ti", 29, 3999.99, 35, 5, fornecedor2);
		Produto produto4 = new Produto("Placa de video Geforce RTX 3080Ti", 27, 10540.90, 36, 11, fornecedor2);
		Produto produto5 = new Produto("oculos de grau", 26, 425, 49, 20, fornecedor3);
		Produto produto6 = new Produto("oculos de sol", 25, 280, 100, 19, fornecedor3);
		
		Cliente cliente1 = new Cliente("Ze", "ze@gmail.com", "Masculino", 0);
		Cliente cliente2 = new Cliente("Maria", "maria@gmail.com", "Feminino", 0);
		Cliente cliente3 = new Cliente("Roberto", "robert@gmail.com", "Masculino", 0);
		Cliente cliente4 = new Cliente("Rafaela", "rafaela@gmail.com", "Feminino", 0);

		
		Pagamento pagamento1 = new PagVista(149998.90, 9000);
		Venda venda1 = new Venda("05/02/2019", produto2, 140998.90, cliente1, fornecedor1, pagamento1);
		cliente1.setGastos(venda1);
		Pagamento pagamento2 = new PagVista(3999.99, 400);
		Venda venda2 = new Venda("07/03/2021", produto3, 3599.99, cliente2, fornecedor2, pagamento2);
		cliente2.setGastos(venda2);
		Pagamento pagamento3 = new PagVista(280, 30);
		Venda venda3 = new Venda("08/03/2021", produto6, 250, cliente2, fornecedor3, pagamento3);
		cliente2.setGastos(venda3);
		
		try {
			Pagamento pagamento4 = new PagParcelado(10540.90, 6, 5);
			venda4 = new Venda("10/03/2021", produto4, 10540.90, cliente4, fornecedor2, pagamento4);
			cliente4.setGastos(venda4);
		} catch (MuitasParcelasException e) {
			e.printStackTrace();
		}
		
		Pagamento pagamento6 = new PagVista(199999.90, 10000);
		Venda venda6 = new Venda("25/03/2021", produto1, 189999.90, cliente3, fornecedor1, pagamento6);
		cliente3.setGastos(venda6);
		
		try {
			Pagamento pagamento7 = new PagParcelado(300, 10, 3);
			venda7 = new Venda("01/04/2021", produto6, 300, cliente3, fornecedor3, pagamento7);
			cliente3.setGastos(venda7);
		} catch (MuitasParcelasException e) {
			e.printStackTrace();
		}
		
		Pagamento pagamento7 = new PagVista(350, 30);
		Venda venda8 = new Venda("25/03/2021", produto5, 320, cliente4, fornecedor3, pagamento7);
		cliente4.setGastos(venda8);
	
		
		DivisaoCategorias ranking = new DivisaoCategorias();
		
		CategoriasDeCompras A = new CategoriasDeCompras ("Compras acima de R$30.000,00");
		CategoriasDeCompras B = new CategoriasDeCompras ("Compras acima de R$ 10.000,00 e abaixo de R$30.000,00");
		CategoriasDeCompras C = new CategoriasDeCompras ("Compras abaixo de R$ 10.000,00");
		
		ranking.categoriza(cliente1, A);
		ranking.categoriza(cliente2, C);
		ranking.categoriza(cliente3, A);
		ranking.categoriza(cliente4, B);
		
		Set<Cliente> listaClientes = ranking.getLista();
		
		System.out.println("\n" + "\n" + "Clientes e seus respectivos totais em vendas: " + "\n");
		for (Cliente c : listaClientes) {
			System.out.println(ranking.gastosTotalCliente(c));
		}
		
		System.out.println("\n" + "Consulta a um cliente especifico: " + "\n" + ranking.gastosTotalCliente(cliente2));
		
		System.out.println("\n" + "Consulta a categoria de um cliente: ");
		System.out.println("Cliente: " + cliente1.getNome() + " - Categoria: " + ranking.getCategoriasDeCompras(cliente1).getDescricao());

	}

}


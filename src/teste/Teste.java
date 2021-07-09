package teste;


import modelo.Cliente;
import modelo.Fornecedor;
import modelo.IdentificadorDePagamento;
import modelo.Produto;
import modelo.Venda;
import modelo.Pagamento;
import modelo.PagVista;
import modelo.PagParcelado;



public class Teste {

	public static void main(String[] args) {
		Fornecedor fornecedor1 = new Fornecedor("Gabriel", "diretor", "eu.eu@gmail.com", "Masculino", "Pizzaria");
		Fornecedor fornecedor2 = new Fornecedor("Jo�o", "gerente", "jo�o.gerente@gmail.com", "Masculino", "Loja de pe�as para computador");
		Fornecedor fornecedor3 = new Fornecedor("Carlos", "supervisor", "carlos.carlos@gmail.com", "Masculino", "�tica");
		
		Produto produto1 = new Produto("Pizza de calabresa", 30, 19.90, 10, 4, fornecedor1);
		Produto produto2 = new Produto("Pizza de mussarela", 30, 19.90, 10, 4, fornecedor1);
		Produto produto3 = new Produto("SSD 480gb", 29, 330, 16, 3, fornecedor2);
		Produto produto4 = new Produto("HD 1tb", 27, 350, 10, 3, fornecedor2);
		Produto produto5 = new Produto("�culos de grau", 26, 425, 7, 2, fornecedor3);
		Produto produto6 = new Produto("�culos de sol", 25, 280, 8, 2, fornecedor3);
		
		Cliente cliente1 = new Cliente("Z�", "z�@gmail.com", "Masculino");
		Cliente cliente2 = new Cliente("Maria", "maria@gmail.com", "Feminino");
		Cliente cliente3 = new Cliente("Roberto", "robert@gmail.com", "Masculino");
		Cliente cliente4 = new Cliente("Rafaela", "rafaela@gmail.com", "Feminino");

		
		Pagamento pagamento1 = new PagVista(30, 5);
		Venda venda1 = new Venda("05/02/1999", produto1, 30, cliente1, fornecedor1, pagamento1);
		Venda venda2 = new Venda("07/03/2021", produto2, 30, cliente2, fornecedor1, pagamento1);
		Pagamento pagamento2 = new PagVista(400, 30);
		Venda venda3 = new Venda("08/03/2021", produto3, 400, cliente2, fornecedor2, pagamento2);
		Pagamento pagamento3 = new PagParcelado(412, 5, 4);
		Venda venda4 = new Venda("10/03/2021", produto4, 412, cliente4, fornecedor2, pagamento3);
		Pagamento pagamento4 = new PagParcelado(350, 3, 6);
		Venda venda5 = new Venda("25/03/2021", produto5, 350, cliente4, fornecedor3, pagamento4);
		Venda venda6 = new Venda("25/03/2021", produto1, 30, cliente3, fornecedor1, pagamento1);
		Pagamento pagamento5 = new PagParcelado(300, 10, 3);
		Venda venda7 = new Venda("01/04/2021", produto6, 300, cliente3, fornecedor3, pagamento5);
		
		System.out.println(IdentificadorDePagamento.getTipo(pagamento1));
		System.out.println(IdentificadorDePagamento.getTipo(pagamento2));
	
		System.out.println(venda1);
		
	}

}


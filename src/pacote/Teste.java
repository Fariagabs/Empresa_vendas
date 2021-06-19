package pacote;


import modelo.Cliente;
import modelo.Fornecedor;
import modelo.Produto;
import modelo.Venda;



public class Teste {

	public static void main(String[] args) {
		Fornecedor fornecedor1 = new Fornecedor("Gabriel", "diretor", "eu.eu@gmail.com", "Masculino", "Pizzaria");
		Fornecedor fornecedor2 = new Fornecedor("João", "gerente", "joão.gerente@gmail.com", "Masculino", "Loja de peças para computador");
		Fornecedor fornecedor3 = new Fornecedor("Carlos", "supervisor", "carlos.carlos@gmail.com", "Masculino", "Ótica");
		
		Produto produto1 = new Produto("Pizza de calabresa", 30, 19.90, 10, 4, fornecedor1);
		Produto produto2 = new Produto("Pizza de mussarela", 30, 19.90, 10, 4, fornecedor1);
		Produto produto3 = new Produto("SSD 480gb", 29, 330, 16, 3, fornecedor2);
		Produto produto4 = new Produto("HD 1tb", 27, 350, 10, 3, fornecedor2);
		Produto produto5 = new Produto("Óculos de grau", 26, 425, 7, 2, fornecedor3);
		//Produto produto6 = new Produto("Óculos de sol", 25, 280, 8, 2, fornecedor3);
		
		Cliente cliente1 = new Cliente("Zé", "zé@gmail.com", "Masculino");
		Cliente cliente2 = new Cliente("Maria", "maria@gmail.com", "Feminino");
		Cliente cliente3 = new Cliente("Roberto", "robert@gmail.com", "Masculino");
		Cliente cliente4 = new Cliente("Rafaela", "rafaela@gmail.com", "Feminino");
		
		
		Venda venda1 = new Venda("05/02/2021", produto1, 29.90, cliente1, fornecedor1);
		Venda venda2 = new Venda("07/03/2021", produto1, 29.90, cliente2, fornecedor1);
		Venda venda3 = new Venda("08/03/2021", produto2, 400, cliente2, fornecedor2);
		Venda venda4 = new Venda("10/03/2021", produto4, 412, cliente4, fornecedor2);
		Venda venda5 = new Venda("07/03/2021", produto1, 29.90, cliente4, fornecedor1);
		Venda venda6 = new Venda("07/03/2021", produto1, 29.90, cliente3, fornecedor1);
		Venda venda7 = new Venda("07/03/2021", produto1, 29.90, cliente3, fornecedor1);

		System.out.println(venda1.Id());
	
		
		
		Historico.adicionar(venda1);
		Historico.adicionar(venda2);
		Historico.adicionar(venda3);
		
		System.out.println(venda1.getProduto().codigoProduto());
		System.out.println(venda2.getProduto().codigoProduto());
		System.out.println(venda5.getProduto().codigoProduto());
		System.out.println(venda6.getProduto().codigoProduto());
		
		
		System.out.println(Historico.infoVenda(venda1));
		System.out.println(venda1.getCliente().codigoCliente());
		

	}

}


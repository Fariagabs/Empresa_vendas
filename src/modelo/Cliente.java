package modelo;

public class Cliente {
	private String nome;
	private String email;
	private String sexo;
	private static int codCliente = 0;

	public String toString() {
		return "Nome: " + nome + "; Email: " + email + "; Sexo: " + sexo;
	}
	
	public String codigoCliente(){
		return "C" + Cliente.codCliente;
	}
	
	public Cliente(String nome, String email, String sexo) {
		Cliente.codCliente = Cliente.codCliente + 1;
		this.nome = nome;
		this.email = email;
		this.sexo = sexo;
	}

	public Cliente(Cliente cliente) {
		this.nome = cliente.nome;
		this.email = cliente.email;
		this.sexo = cliente.sexo;
	}
}

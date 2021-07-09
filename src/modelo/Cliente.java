package modelo;

public class Cliente extends Pessoa{

	private static int idCliente = 1;

	public String toString() {
		return "Nome: " + nome + "; Email: " + email + "; Sexo: " + sexo;
	}
	
	@Override
	public String identificador(){
		String id;
		id = "C" + this.cod;
		return id;
	}
	
	public Cliente(String nome, String email, String sexo) {
		super(nome, email, sexo);
		this.cod = idCliente++;
	}

	public Cliente(Cliente cliente, String nome, String email, String sexo) {
		super(nome, email, sexo);
		this.cod = cliente.cod;
	}
	
	public Cliente getCliente() {
		return new Cliente(nome, email, sexo);
	}

	public String tratamento() {
		if(sexo.equals("Masculino") || sexo.equals("masculino")) {
			return "Prezado Senhor " + nome;
		}else {
			return "Prezada Senhora " + nome;
		}
		
	}

}

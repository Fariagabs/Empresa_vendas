package modelo;

public class Cliente extends Pessoa{

	
	private double gastos;

	public String toString() {
		return "Nome: " + nome + "; Email: " + email + "; Sexo: " + sexo;
	}
	
	@Override
	public String identificador(){
		String id;
		id = "C" + this.cod;
		return id;
	}
	
	public Cliente(String nome, String email, String sexo, double gastos) {
		super(nome, email, sexo);
		this.cod = id;
	}

	public Cliente(Cliente cliente, String nome, String email, String sexo, double gastos) {
		super(nome, email, sexo);
		this.cod = cliente.cod;
		this.gastos = gastos;
	}
	
	public Cliente getCliente() {
		return new Cliente(nome, email, sexo, gastos);
	}
	

	public String getNome() {
		return nome;
	}
	
	
	public double getGastos() {
		return gastos;
	}

	public double setGastos(Venda venda) {
		this.gastos = this.gastos + venda.getValor();
		return gastos;
	}

	public String tratamento() {
		if(sexo.equals("Masculino") || sexo.equals("masculino")) {
			return "Prezado Senhor " + nome;
		}else {
			return "Prezada Senhora " + nome;
		}
		
	}

}

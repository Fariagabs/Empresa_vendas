package modelo;

public class Fornecedor extends Pessoa {
	private String cargo;
	private String descricao_empresa;
	private static int idFornecedor = 1;
	
	public String toString() {
		return "Nome: " + nome + "; Cargo: " + cargo + "; Email: " + email + "; Sexo: " + sexo + "; Descrição da empresa: "  + descricao_empresa;
	}
	
	@Override
	public String identificador(){
		String id;
		id = "F" + this.cod;
		return id;
	}
	
	
	public Fornecedor(String nome, String cargo, String email, String sexo, String descricao_empresa){
		super(nome, email, sexo);
		this.cod = idFornecedor++;
		this.cargo = cargo;
		this.descricao_empresa = descricao_empresa;
	}

	public Fornecedor(Fornecedor fornecedor, String nome, String email, String sexo) {
		super(nome, email, sexo);
		this.cod = fornecedor.cod;
		this.cargo = fornecedor.cargo;
		this.descricao_empresa = fornecedor.descricao_empresa;
	}
	
	public Fornecedor getFornecedor() {
		return new Fornecedor(nome, email, sexo, cargo, descricao_empresa);
	}
	
	public String tratamento() {
		if(sexo.equals("Masculino") || sexo.equals("masculino")) {
			return "Prezado Colaboradora " + nome;
		}else {
			return "Prezada Colaboradora " + nome;
		}
	}
}




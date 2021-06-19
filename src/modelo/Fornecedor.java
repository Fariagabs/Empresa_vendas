package modelo;

public class Fornecedor {
	private String nome;
	private String cargo;
	private String email;
	private String sexo;
	private String descricao_empresa;
	private static int codFornecedor = 0;
	
	public String toString() {
		return "Nome: " + nome + "; Cargo: " + cargo + "; Email: " + email + "; Sexo: " + sexo + "; Descrição da empresa: "  + descricao_empresa;
	}
	
	public String codigoFornecedor(){
		return "F" + codFornecedor;
	}
	
	public Fornecedor(String nome, String cargo, String email, String sexo, String descricao_empresa){
		Fornecedor.codFornecedor = codFornecedor + 1;
		this.nome = nome;
		this.cargo = cargo;
		this.email = email;
		this.sexo = sexo;
		this.descricao_empresa = descricao_empresa;
	}

	public Fornecedor(Fornecedor fornecedor) {
		this.nome = fornecedor.nome;
		this.cargo = fornecedor.cargo;
		this.email = fornecedor.email;
		this.sexo = fornecedor.sexo;
		this.descricao_empresa = fornecedor.descricao_empresa;
	}

}	


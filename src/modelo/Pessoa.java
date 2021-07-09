package modelo;


public  class Pessoa {
	protected String nome;
	protected String sexo;
	protected String email;
	protected int cod;
	
	public Pessoa (String nome, String email, String sexo) {
		super();
		this.nome = nome;
		this.email = email;
		this.sexo = sexo;
	}
	
	public String identificador() {
		String id = "0";
		return id;
	}

}

	
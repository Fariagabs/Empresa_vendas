package modelo;


public abstract class Pessoa {
	protected String nome;
	protected String sexo;
	protected String email;
	protected int cod = 0;
	protected static int id = 1;
	
	public Pessoa (String nome, String email, String sexo) {
		super();
		this.nome = nome;
		this.email = email;
		this.sexo = sexo;
	}
	
	public abstract String identificador();
	
	public abstract String tratamento();
}

	
package br.com.fiap.models	;

public class Mecanico {
	private String nome;
	private Localizacao localizacao;
	private int id;
	
	
	
	public Mecanico() {
		super();
	}
	
	
	public Mecanico(String nome, int id) {
		super();
		this.nome = nome;
		this.id = id;
	}


	public Mecanico(String nome, String localizacao, int id) {
		super();
		this.nome = nome;
		this.id = id;
	}
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	public Localizacao getLocalizacao() {
		return localizacao;
	}


	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}
	
	
}

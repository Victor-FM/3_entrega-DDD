package br.com.fiap.models;

public class Usuario {
	private String nome;
	private String cpf;
	private Apolice numeroApolice;
	private int id;	
	private String login;
	private String senha;
	private Localizacao localizacao;
	
	public Usuario() {
		super();
	}
	
	
	public Usuario(String nome, String cpf, int id, String login, String senha) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.id = id;
		this.login = login;
		this.senha = senha;
	}


	public Usuario(String nome, String cpf, Apolice numeroApolice, int id, String login, String senha, Localizacao localizacao) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.numeroApolice = numeroApolice;
		this.id = id;
		this.login = login;
		this.senha = senha;
		this.localizacao = localizacao;
	}
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Apolice getNumeroApolice() {
		return numeroApolice;
	}
	public void setNumeroApolice(Apolice numeroApolice) {
		this.numeroApolice = numeroApolice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Localizacao getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}
	
	
	
	
	
}

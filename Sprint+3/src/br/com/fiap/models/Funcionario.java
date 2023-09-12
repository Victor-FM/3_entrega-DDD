package br.com.fiap.models;

import java.util.HashSet;

public class Funcionario extends Formulario{
	private String login;
	private String senha;
	private String nome;
	private int id;
	private HashSet<String> logins = new HashSet<String>();
	private HashSet<String> senhas = new HashSet<String>();
	
	public Funcionario() {
		super();
	}
	


	public Funcionario(String login, String senha, String nome, int id) {
		super();
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.id = id;
	}

	
	public void cadastrarFuncionario(String login, String senha) {
		logins.add(login);
		senhas.add(senha);
	}
	
	public String logarFuncionario(String login, String senha) {
		if(logins.contains(login) && senhas.contains(senha)) {
			return "Login realizado com sucesso!";
		}else {
			return "Login e/ou senha incorretos!";
		}
		
	}
	
	public String solicitarMecanico(Localizacao localizacao) {
		return "Mecanico solicitado ao devido local";
	}
	
	
	

	@Override
	public String preencherFormulario(String nome, String data, float peso, float altura, float largura,
			String informacaoAdicional) {
		// TODO Auto-generated method stub
		return super.preencherFormulario(nome, data, peso, altura, largura, informacaoAdicional);
	}



	@Override
	public int getIdAtendente() {
		// TODO Auto-generated method stub
		return super.getIdAtendente();
	}



	@Override
	public void setIdAtendente(int idAtendente) {
		// TODO Auto-generated method stub
		super.setIdAtendente(idAtendente);
	}



	@Override
	public int getNumeroApolice() {
		// TODO Auto-generated method stub
		return super.getNumeroApolice();
	}



	@Override
	public void setNumeroApolice(int numeroApolice) {
		// TODO Auto-generated method stub
		super.setNumeroApolice(numeroApolice);
	}



	@Override
	public String getData() {
		// TODO Auto-generated method stub
		return super.getData();
	}



	@Override
	public void setData(String data) {
		// TODO Auto-generated method stub
		super.setData(data);
	}



	@Override
	public int getIdVeiculo() {
		// TODO Auto-generated method stub
		return super.getIdVeiculo();
	}



	@Override
	public void setIdVeiculo(int idVeiculo) {
		// TODO Auto-generated method stub
		super.setIdVeiculo(idVeiculo);
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
	public HashSet getLogins() {
		return logins;
	}

	public void setLogins(HashSet logins) {
		this.logins = logins;
	}

	public HashSet getSenhas() {
		return senhas;
	}

	public void setSenhas(HashSet senhas) {
		this.senhas = senhas;
	}
	
	
}

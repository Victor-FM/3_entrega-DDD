package br.com.fiap.models;

public class Solicitacao {
	private int id;
	private Guinchos guincho;
	private Mecanico mecanico;
	private Localizacao localizacao;
	
	
	
	
	public Solicitacao() {
		super();
	}
	
	
	
	
	public Solicitacao(int id) {
		super();
		this.id = id;
	}



	public Solicitacao(int id, Guinchos guincho, Mecanico mecanico, Localizacao localizacao) {
		super();
		this.id = id;
		this.guincho = guincho;
		this.mecanico = mecanico;
		this.localizacao = localizacao;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Guinchos getGuincho() {
		return guincho;
	}
	public void setGuincho(Guinchos guincho) {
		this.guincho = guincho;
	}
	public Mecanico getMecanico() {
		return mecanico;
	}
	public void setMecanico(Mecanico mecanico) {
		this.mecanico = mecanico;
	}
	public Localizacao getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}
	
	
	
}

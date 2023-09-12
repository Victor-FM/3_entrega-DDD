package br.com.fiap.models;

public class Localizacao {
	private String logradouro;
	private String cidade;
	private String bairro;
	private String complemento;
	
	
	public Localizacao() {
		super();
	}
	
	public Localizacao(String logradouro, String cidade, String bairro, String complemento) {
		super();
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.bairro = bairro;
		this.complemento = complemento;
	}

	public String rastrearLocalizacao(int id) {
		return "Logradouro : " + logradouro + "\n" + "Cidade : " + cidade + "\n" + "Bairro : " + bairro + "\n" + "Complemento : " + complemento;
	}
	
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
}

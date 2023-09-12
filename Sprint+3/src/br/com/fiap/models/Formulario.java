package br.com.fiap.models;

public class Formulario extends Veiculo{
	private int idAtendente;
	private String nome;
	private int numeroApolice;
	private String data;
	private int idVeiculo;
	
	
	public Formulario() {
		super();
	}
	
	
	
	public Formulario(float peso, float altura, float largura, String informacaoAdicional) {
		super(peso, altura, largura, informacaoAdicional);
		// TODO Auto-generated constructor stub
	}



	public Formulario(int idAtendente, String nome, int numeroApolice, String data, int idVeiculo) {
		super();
		this.idAtendente = idAtendente;
		this.nome = nome;
		this.numeroApolice = numeroApolice;
		this.data = data;
		this.idVeiculo = idVeiculo;
	}
	
	public String preencherFormulario(String nome, String data, float peso, float altura, float largura, String informacaoAdicional) {
		return "Formulário preenchido!";
	}
	
	public int getIdAtendente() {
		return idAtendente;
	}
	public void setIdAtendente(int idAtendente) {
		this.idAtendente = idAtendente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroApolice() {
		return numeroApolice;
	}
	public void setNumeroApolice(int numeroApolice) {
		this.numeroApolice = numeroApolice;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getIdVeiculo() {
		return idVeiculo;
	}
	public void setIdVeiculo(int idVeiculo) {
		this.idVeiculo = idVeiculo;
	}
	
	
	
}

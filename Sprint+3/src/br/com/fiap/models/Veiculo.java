package br.com.fiap.models	;

public class Veiculo {
	private String marca;
	private String modelo;
	private short anoFabricacao;
	protected String placa;
	private String categoriaTarifaria;
	protected float peso;
	protected float altura;
	protected float largura;
	protected String informacaoAdicional; 
	
	
	
	
	public Veiculo() {
		super();
	}
	
	public Veiculo(String placa) {
		super();
		this.placa = placa;
	}
	

	public Veiculo(float peso, float altura, float largura, String informacaoAdicional) {
		super();
		this.peso = peso;
		this.altura = altura;
		this.largura = largura;
		this.informacaoAdicional = informacaoAdicional;
	}

	public Veiculo(String marca, String modelo, short anoFabricacao, String placa, String categoriaTarifaria) {
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.placa = placa;
		this.categoriaTarifaria = categoriaTarifaria;
	}
	
	
	public Veiculo(String marca, String modelo, short anoFabricacao, String placa, String categoriaTarifaria,
			float peso, float altura, float largura, String informacaoAdicional) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.placa = placa;
		this.categoriaTarifaria = categoriaTarifaria;
		this.peso = peso;
		this.altura = altura;
		this.largura = largura;
		this.informacaoAdicional = informacaoAdicional;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public short getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(short anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCategoriaTarifaria() {
		return categoriaTarifaria;
	}
	public void setCategoriaTarifaria(String categoriaTarifaria) {
		this.categoriaTarifaria = categoriaTarifaria;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getLargura() {
		return largura;
	}
	public void setLargura(float largura) {
		this.largura = largura;
	}
	public String getInformacaoAdicional() {
		return informacaoAdicional;
	}
	public void setInformacaoAdicional(String informacaoAdicional) {
		this.informacaoAdicional = informacaoAdicional;
	}
	
}

package br.com.fiap.models;

public class Apolice {
	private int numero;
	private Veiculo veiculo;
	
	
	
	public Apolice() {
		super();
	}
	
	
	public Apolice(int numero) {
		super();
		this.numero = numero;
	}


	public Apolice(int numero, Veiculo veiculo) {
		super();
		this.numero = numero;
		this.veiculo = veiculo;
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}


	public Veiculo getVeiculo() {
		return veiculo;
	}


	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	
	
	
	
}

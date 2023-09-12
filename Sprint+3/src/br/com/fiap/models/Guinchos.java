package br.com.fiap.models;

public class Guinchos extends Veiculo {
	private String tipoGuincho;
	private int id;
	
	
	
	public Guinchos() {
		super();
	}
	public Guinchos(String tipoGuincho, int id) {
		super();
		this.tipoGuincho = tipoGuincho;
		this.id = id;
	}
	
	public Guinchos(String placa) {
		super(placa);
		// TODO Auto-generated constructor stub
	}
	
	
	public Guinchos(String placa, String tipoGuincho, int id) {
		super(placa);
		this.tipoGuincho = tipoGuincho;
		this.id = id;
	}
	public String getTipoGuincho() {
		return tipoGuincho;
	}
	public void setTipoGuincho(String tipoGuincho) {
		this.tipoGuincho = tipoGuincho;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}

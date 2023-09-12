	package br.com.fiap.models;

	public class Chamado {
		private int id;
		private Usuario usuario;
		private Apolice apolice;
		
		
		
		
		public Chamado() {
			super();
		}
		
		
		
		public Chamado(int id) {
			super();
			this.id = id;
		}


		public Chamado(int id, Usuario usuario, Apolice apolice) {
			super();
			this.id = id;
			this.usuario = usuario;
			this.apolice = apolice;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public Usuario getUsuario() {
			return usuario;
		}
		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}
		public Apolice getApolice() {
			return apolice;
		}
		public void setApolice(Apolice apolice) {
			this.apolice = apolice;
		}
	}	

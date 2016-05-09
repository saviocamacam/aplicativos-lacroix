package model;

public class Materia {

		private int idMateria;
		private int idEstado;
		private String nomeMateria;
		private int periodoAssociado;
		
		public int getIdMateria() {
			return idMateria;
		}
		public void setIdMateria(int idMateria) {
			this.idMateria = idMateria;
		}
		public int getIdEstado() {
			return idEstado;
		}
		public void setIdEstado(int idEstado) {
			this.idEstado = idEstado;
		}
		public String getNomeMateria() {
			return nomeMateria;
		}
		public void setNomeMateria(String nomeMateria) {
			this.nomeMateria = nomeMateria;
		}
		public int getPeriodoAssociado() {
			return periodoAssociado;
		}
		public void setPeriodoAssociado(int periodoAssociado) {
			this.periodoAssociado = periodoAssociado;
		}
}

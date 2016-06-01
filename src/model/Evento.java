package model;

import java.sql.Date;

public class Evento {
	private int idEvento;
	private int idMateria;
	private TipoEvento tipoEvento;
	private Date dataEvento;
	private String descricao;
	private String detalhes;
	private float valorNota;
	private float notaRecebida;
	private String localEvento;
	
	public Evento(int idMateria, TipoEvento tipo, Date data, String descricao, String detalhes, float valorNota, String local) {
		this.idMateria = idMateria;
		this.tipoEvento = tipo;
		this.dataEvento = data;
		this.descricao = descricao;
		this.detalhes = detalhes;
		this.valorNota = valorNota;
		this.localEvento = local;
	}
	public int getIdEvento() {
		return idEvento;
	}
	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}
	public String getTipoEvento() {
		return this.tipoEvento.getNomeTipoEvento();
	}
	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
	public int getIdMateria() {
		return idMateria;
	}
	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}
	public Date getDataEvento() {
		return dataEvento;
	}
	public void setDataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDetalhes() {
		return detalhes;
	}
	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}
	public float getValorNota() {
		return valorNota;
	}
	public void setValorNota(float valorNota) {
		this.valorNota = valorNota;
	}
	public float getNotaRecebida() {
		return notaRecebida;
	}
	public void setNotaRecebida(float notaRecebida) {
		this.notaRecebida = notaRecebida;
	}
	public String getLocalEvento() {
		return localEvento;
	}
	public void setLocalEvento(String localEvento) {
		this.localEvento = localEvento;
	}
	
	
}

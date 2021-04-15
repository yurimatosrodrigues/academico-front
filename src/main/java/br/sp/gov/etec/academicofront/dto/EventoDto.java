package br.sp.gov.etec.academicofront.dto;

import java.time.LocalDate;

public class EventoDto {
	
	private String nomeEvento;
	private String descricao;
	private LocalDate dataInicio;
	private LocalDate dataFim;
	private String imagemEvento;
	
	public String getNomeEvento() {
		return nomeEvento;
	}
	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getImagemEvento() {
		return imagemEvento;
	}
	public void setImagemEvento(String imagemEvento) {
		this.imagemEvento = imagemEvento;
	}
	public LocalDate getDataFim() {
		return dataFim;
	}
	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}

}

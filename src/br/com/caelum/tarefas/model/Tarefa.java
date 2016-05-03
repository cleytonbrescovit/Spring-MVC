package br.com.caelum.tarefas.model;

import java.util.Calendar;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Tarefa {
	private Long id;
	
	@NotNull(message="A descrição deve ser preenchida")
	@Size(min=5, message="Descrição deve ter pelo menos 5 caracteres")
	private String descricao;
	
	private int finalizado;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Calendar dataFinalizacao;	
	
	public Tarefa() {
	}	
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}	
	public Calendar getDataFinalizacao() {
		return this.dataFinalizacao;
	}
	public void setDataFinalizacao(Calendar dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}
	public String getDescricao() {
		return this.descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getFinalizado() {
		return this.finalizado;
	}
	public void setFinalizado(int finalizado) {
		this.finalizado = finalizado;
	}
}

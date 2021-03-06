package br.com.caelum.tarefas.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Tarefa {

	@Id
	@GeneratedValue
	private Long id;

	@NotNull(message = "A descrição deve ser preenchida")
	@Size(min = 5, message = "Descrição deve ter pelo menos 5 caracteres")
	private String descricao;

	private boolean finalizado;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Calendar dataFinalizacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

	public Calendar getDataFinalizacao() {
		return dataFinalizacao;
	}

//	public void setDataFinalizacao(Calendar dataFinalizacao) {
//		this.dataFinalizacao = dataFinalizacao;
//	}
	
	public void setDataFinalizacao(String dataFinalizacao)
	{	
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
		
		Calendar c = Calendar.getInstance();
		 
		try {
			c.setTime(formatoData.parse(dataFinalizacao));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		this.dataFinalizacao = c;
	}
}
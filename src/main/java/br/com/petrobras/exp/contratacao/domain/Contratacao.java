package br.com.petrobras.exp.contratacao.domain;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import br.com.petrobras.exp.contratacao.domain.enums.TipoContratacao;

@Entity
public class Contratacao implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String objeto;
	
	@DateTimeFormat
	//@DateTimeFormat(pattern="dd/MM/yyyy")
	private Calendar dataInicio;
	
	//@DateTimeFormat(pattern="dd/MM/yyyy")
	private Calendar dataTermino;
	
	private Integer tipo;
	
	/*
	 * @Enumerated(EnumType.STRING) private TipoContratacao tipo;
	 */	
	public Contratacao() {
		
	}

	public Contratacao(Integer id, String objeto, Calendar dataInicio, Calendar dataTermino, TipoContratacao tipo) {
		super();
		this.id = id;
		this.objeto = objeto;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.tipo = (tipo == null) ? null : tipo.getCod();
		System.out.println(tipo);
		/* this.tipo = tipo; */
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getObjeto() {
		return objeto;
	}

	public void setObjeto(String objeto) {
		this.objeto = objeto;
	}

	public Calendar getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Calendar getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(Calendar dataTermino) {
		this.dataTermino = dataTermino;
	}

	/*
	 * public TipoContratacao getTipo() { return tipo; }
	 * 
	 * public void setTipo(TipoContratacao tipo) { this.tipo = tipo; }
	 * 
	 * 
	 * @Override public String toString() { return "Contratacao [objeto=" + objeto +
	 * ", data de início=" + dataInicio + ", data de término =" + dataTermino
	 * +", tipo=" + tipo + "]"; }
	 */

	
	
	  public TipoContratacao getTipo() { return TipoContratacao.toEnum(this.tipo);
	  }
	  
	  public void setTipo(TipoContratacao tipo) { this.tipo = tipo.getCod(); }
	 
	
	

}

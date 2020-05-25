package br.com.petrobras.exp.contratacao.domain.enums;

import javax.persistence.Embeddable;

public enum TipoContratacao {
	
	/*
	 * CONTRATACAO_DIRETA, LICITACAO;
	 */
	
	CONTRATACAO_DIRETA(1, "Contratação direta"), LICITACAO(2, "Licitação");

	private int cod;
	private String descricao;
	
	private TipoContratacao(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public static TipoContratacao toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		for (TipoContratacao tp : TipoContratacao.values()) {
			if (cod.equals(tp.getCod())) {
				return tp;
			}
		}
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}

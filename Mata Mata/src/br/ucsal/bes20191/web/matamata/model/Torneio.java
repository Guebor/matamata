package br.ucsal.bes20191.web.matamata.model;

import java.util.ArrayList;
import java.util.List;

public class Torneio {
	private String nome;

	private TipoTorneioEnum tipo;

	private Integer numeroParticipantes;
	
	private List<String> nomesParticipantes = new ArrayList<String>();

	private TipoChaveamentoEnum chaveamento;

	private Integer codigo;
	
	
	public Torneio(String nome, TipoTorneioEnum tipo, Integer numeroParticipantes, List<String> nomesParticipantes,
			TipoChaveamentoEnum chaveamento, Integer codigo) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.numeroParticipantes = numeroParticipantes;
		this.nomesParticipantes = nomesParticipantes;
		this.chaveamento = chaveamento;
		this.codigo = codigo;
	}

	public List<String> getNomesParticipantes() {
		return nomesParticipantes;
	}

	public void setNomesParticipantes(List<String> nomesParticipantes) {
		this.nomesParticipantes = nomesParticipantes;
	}




	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoTorneioEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoTorneioEnum tipo) {
		this.tipo = tipo;
	}

	public Integer getNumeroParticipantes() {
		return numeroParticipantes;
	}

	public void setNumeroParticipantes(Integer numeroParticipantes) {
		this.numeroParticipantes = numeroParticipantes;
	}

	public TipoChaveamentoEnum getChaveamento() {
		return chaveamento;
	}

	public void setChaveamento(TipoChaveamentoEnum chaveamento) {
		this.chaveamento = chaveamento;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

}

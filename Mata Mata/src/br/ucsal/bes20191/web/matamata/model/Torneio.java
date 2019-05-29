package br.ucsal.bes20191.web.matamata.model;

public class Torneio {
	private String nome;

	private TipoTorneioEnum tipo;

	private Integer numeroParticipantes;

	private TipoChaveamentoEnum chaveamento;

	private Integer codigo;

	public Torneio(String nome, TipoTorneioEnum tipo, Integer numeroParticipantes, TipoChaveamentoEnum chaveamento,
			Integer codigo) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.numeroParticipantes = numeroParticipantes;
		this.chaveamento = chaveamento;
		this.codigo = codigo;
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

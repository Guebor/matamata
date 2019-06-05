package br.ucsal.bes20191.web.matamata.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String nome;
	
	private String email;
	
	private String senha;
	
	private List<Torneio> torneios = new ArrayList<Torneio>();
	
	
	
	public Usuario(String nome, String email, String senha, List<Torneio> torneios) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.torneios = torneios;
	}

	public List<Torneio> getTorneios() {
		return torneios;
	}

	public void setTorneios(List<Torneio> torneios) {
		this.torneios = torneios;
	}



	
	
	

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getSenha() {
		return senha;
	}



	public void setSenha(String senha) {
		this.senha = senha;
	}



	
	
	
	
}

package br.ucsal.bes20191.web.servelet;

import br.ucsal.bes20191.web.matamata.model.Torneio;
import br.ucsal.bes20191.web.matamata.model.Usuario;

public class UsuarioServelet {

	public void removerTorneio(Usuario usuario, Torneio torneio) {
		
		usuario.getTorneios().remove(torneio);
	}
}

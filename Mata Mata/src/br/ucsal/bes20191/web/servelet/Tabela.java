package br.ucsal.bes20191.web.servelet;

import br.ucsal.bes20191.web.matamata.model.Torneio;

public class Tabela {
	
	
	public String[][] criarTabelaPontosCorridos(Torneio torneio) {
		String[][] tabela = new String[2][torneio.getNumeroParticipantes()];
		
		tabela[0][1] = "Nomes";
		tabela[1][1] = "Pontos";
		
			for (int j = 0; j < torneio.getNumeroParticipantes(); j++) {
				tabela[j][2]=torneio.getNomesParticipantes().get(j);
		}
			return tabela;
	}
	public String[][] criarTabelaMataMata(Torneio torneio){
		int a = torneio.getNumeroParticipantes();
		int cont=0;
		//Pega a altura da tabela
		while(a!=0) {
			a=a/2;
			cont++;
		}
		//Cria a Tabela
		String[][] tabela = new String[torneio.getNumeroParticipantes()][cont];
		 for (int i = 0; i < tabela.length; i++) {
			tabela[i][0] =torneio.getNomesParticipantes().get(i);
		}
		
		return tabela;
		
	}
	
	
	
}

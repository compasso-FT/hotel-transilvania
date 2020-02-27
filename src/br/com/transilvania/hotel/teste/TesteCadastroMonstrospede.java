package br.com.transilvania.hotel.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.transilvania.hotel.modelo.Cadastro;
import br.com.transilvania.hotel.modelo.Monstro;
import br.com.transilvania.hotel.modelo.Monstrospede;

public class TesteCadastroMonstrospede {

	public static void main(String[] args) {

		Cadastro monstrospede = new Monstrospede("Vivian sem cabeça", "123456", 654321);
		monstrospede.setCep(11223344);
		monstrospede.setEndereco("Rua dos Morros Uivantes");
		monstrospede.setNumero(666);
		monstrospede.setComplemento("91");
		monstrospede.setBairro("Assombrações");
		monstrospede.setCidade("Silent Hill");
		monstrospede.setUf("RS");
		((Monstro) monstrospede).setDataNascimento("24/07/1320");
		((Monstro) monstrospede).setEmail("vivisemcabeca@monstermail.com");
		
		Cadastro monstrospede2 = new Monstrospede("Pedro curupira", "234.241.234-32", 12342);
		monstrospede2.setCep(24524-100);
		monstrospede2.setEndereco("Travessa dos mortos");
		monstrospede2.setNumero(323);
		monstrospede2.setComplemento("42");
		monstrospede2.setBairro("Beco do sacrifício");
		monstrospede2.setCidade("Varginha");
		monstrospede2.setUf("Estado Islâmico");
		((Monstro) monstrospede2).setDataNascimento("04/02/430");
		((Monstro) monstrospede2).setEmail("curupedro@monstromail.com");
		
		//Adicionada a lista de monstrospedes
		List<Monstrospede> monstrospedes = new ArrayList<Monstrospede>();
		monstrospedes.add((Monstrospede) monstrospede);
		monstrospedes.add((Monstrospede) monstrospede2);
		
		for (Monstrospede listaMonstrospedes : monstrospedes) {
			System.out.println(listaMonstrospedes);
			System.out.println("------------------------");
		}
		
	}
}

package br.com.transilvania.hotel.teste;

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
		System.out.println(monstrospede);
	}
}

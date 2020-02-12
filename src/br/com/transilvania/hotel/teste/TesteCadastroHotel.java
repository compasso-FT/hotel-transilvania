package br.com.transilvania.hotel.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.transilvania.hotel.modelo.Cadastro;
import br.com.transilvania.hotel.modelo.Hotel;

public class TesteCadastroHotel {

	public static void main(String[] args) {
		
		Cadastro hotel = new Hotel("Transilvania 1", "20940192039");
		hotel.setTelefone(34350924);
		hotel.setCep(90345200);
		hotel.setEndereco("Rua dos Monstros");
		hotel.setNumero(666);
		hotel.setComplemento("Próximo ao desfiladeiro");
		hotel.setBairro("Catacumbas");
		hotel.setCidade("Monstrópolis");
		hotel.setUf("RS");
		((Hotel) hotel).setAndares(2);
		((Hotel) hotel).setQuantidadeQuartos(200);
//		System.out.println(hotel);
		
		Cadastro hotel2 = new Hotel("Transilvania 2", "231532406039");
		hotel2.setTelefone(34236495);
		hotel2.setCep(92235681);
		hotel2.setEndereco("Rua das Bruxas");
		hotel2.setNumero(666);
		hotel2.setComplemento("Próximo ao Caldeirão Fervente");
		hotel2.setBairro("Vassouras Voadoras");
		hotel2.setCidade("Monstrópolis");
		hotel2.setUf("RS");
		((Hotel) hotel2).setAndares(3);
		((Hotel) hotel2).setQuantidadeQuartos(300);
		
		
		List<Cadastro> hoteis = new ArrayList<>();
		hoteis.add(hotel);
		hoteis.add(hotel2);
		
		
		
		for (Cadastro cadastro : hoteis) {
			System.out.println(cadastro);
			System.out.println("----------------------------");
		}
	}

}

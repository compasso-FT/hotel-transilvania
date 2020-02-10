package br.com.transilvania.hotel.teste;

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
		System.out.println(hotel);
		
	}

}

package br.com.transilvania.hotel.teste;

import java.math.BigDecimal;

import br.com.transilvania.hotel.modelo.Cadastro;
import br.com.transilvania.hotel.modelo.Monstro;
import br.com.transilvania.hotel.modelo.Monstronario;

public class TesteCadastroMonstronario {

	public static void main(String[] args) {

		Cadastro monstronario = new Monstronario("Felipe Sauro", "789", 987);
		monstronario.setCep(55667788);
		monstronario.setEndereco("Avenida Zona Sul Não é Porto Alegre");
		monstronario.setNumero(1);
		monstronario.setComplemento("1A1");
		monstronario.setBairro("Zona Rural");
		monstronario.setCidade("Zona Sul é Praia");
		monstronario.setUf("AC");
		((Monstro) monstronario).setDataNascimento("25/12/250");
		((Monstro) monstronario).setEmail("felipesauro@montromail.mm.ac");
		((Monstronario) monstronario).setSetor("Java >>>>>> JavaScript");
		((Monstronario) monstronario).setCargo("Nodero");
		((Monstronario) monstronario).setDataAdmissao("08/01/2020");
		((Monstronario) monstronario).setSalario(new BigDecimal(1500.50));

		System.out.println(monstronario);
	}
}

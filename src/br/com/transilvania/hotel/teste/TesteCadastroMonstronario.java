package br.com.transilvania.hotel.teste;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

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
		
		Cadastro monstronario2 = new Monstronario("Karen Fantasma", "12334523445", 35632453);
		monstronario2.setCep(99440225);
		monstronario2.setEndereco("Rua Defuntos");
		monstronario2.setNumero(234);
		monstronario2.setComplemento("3B2");
		monstronario2.setBairro("Zona morta");
		monstronario2.setCidade("Monstrópolis");
		monstronario2.setUf("MG");
		((Monstro) monstronario2).setDataNascimento("24/10/1962");
		((Monstro) monstronario2).setEmail("karenfantasma@montromail.com.br");
		((Monstronario) monstronario2).setSetor("Recursos Fantasmas");
		((Monstronario) monstronario2).setCargo("Assustador");
		((Monstronario) monstronario2).setDataAdmissao("02/12/1989");
		((Monstronario) monstronario2).setSalario(new BigDecimal(3000.50));
		
		//Adicionada a lista de monstronarios
		List<Monstronario> monstronarios = new ArrayList();
		monstronarios.add((Monstronario) monstronario);
		monstronarios.add((Monstronario) monstronario2);

		for (Monstronario listaMonstronarios : monstronarios) {
			System.out.println(listaMonstronarios);
			System.out.println("----------------------------");
		}
	}
}

package br.com.transilvania.hotel.teste;

import java.math.BigDecimal;

import br.com.transilvania.hotel.modelo.Quarto;
import br.com.transilvania.hotel.modelo.Reserva;

public class TesteReserva {

	public static void main(String[] args) {

		Reserva reserva = new Reserva("10/01/2020", "10/02/2020", 200);
		
		System.out.println(reserva);
		
		System.out.println("-----------------------------");

		Quarto quarto = new Quarto("Suite magestike master hiper luxo", 20, new BigDecimal(400.75), "azul neon", 10, 3,
				0);
		
		System.out.println(quarto);

	}

}

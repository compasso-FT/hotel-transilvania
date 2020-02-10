package br.com.transilvania.hotel.modelo;

public class Reserva {

	private String dataEntrada;
	private String dataSaida;
	private int numeroQuarto;

	public Reserva(String dataEntrada, String dataSaida, int numeroQuarto) {
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.numeroQuarto = numeroQuarto;
	}

	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}

	public int getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	@Override
	public String toString() {
		return "Numero do quarto: " + this.numeroQuarto + "\nData de entrada: " + this.dataEntrada + "\nData de saída: "
				+ this.dataSaida;
	}

}

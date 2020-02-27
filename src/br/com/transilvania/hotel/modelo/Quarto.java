package br.com.transilvania.hotel.modelo;

import java.math.BigDecimal;

public class Quarto {

	private String tipo;
	private int numeroQuarto;
	private String dataEntrada;
	private String dataSaida;
	private BigDecimal precoDiaria;
	private String cor;
	private int quantidadeBanheiros;
	private int quantidadeCamaCasal;
	private int quantidadeCamaSolteiro;
	private boolean fumante;

	public Quarto(String tipo, int numeroQuarto, BigDecimal precoDiaria, String cor, int quantidadeBanheiros,
			int quantidadeCamaCasal, int quantidadeCamaSolteiro) {
		this.tipo = tipo;
		this.numeroQuarto = numeroQuarto;
		this.precoDiaria = precoDiaria;
		this.cor = cor;
		this.quantidadeBanheiros = quantidadeBanheiros;
		this.quantidadeCamaCasal = quantidadeCamaCasal;
		this.quantidadeCamaSolteiro = quantidadeCamaSolteiro;
		this.quartoParaFumante();
	}
	
	public Quarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public boolean isEstaOcupado() {
		return false;
	}

	public BigDecimal getPrecoDiaria() {
		return precoDiaria;
	}

	public void setPrecoDiaria(BigDecimal precoDiaria) {
		this.precoDiaria = precoDiaria;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void quartoParaFumante() {
		if (this.numeroQuarto % 2 == 0) {
			this.fumante = false;
		} else {
			this.fumante = true;
		}
	}
	
	public String mensagemFumante(boolean fumante){
		return (fumante) ? "quarto para fumantes" : "quarto para não fumantes";
	}
	
	public int getQuantidadeBanheiros() {
		return quantidadeBanheiros;
	}

	public void setQuantidadeBanheiros(int quantidadeBanheiros) {
		this.quantidadeBanheiros = quantidadeBanheiros;
	}

	public int getQuantidadeCamaCasal() {
		return quantidadeCamaCasal;
	}

	public void setQuantidadeCamaCasal(int quantidadeCamaCasal) {
		this.quantidadeCamaCasal = quantidadeCamaCasal;
	}

	public int getQuantidadeCamaSolteiro() {
		return quantidadeCamaSolteiro;
	}

	public void setQuantidadeCamaSolteiro(int quantidadeCamaSolteiro) {
		this.quantidadeCamaSolteiro = quantidadeCamaSolteiro;
	}

	@Override
	public String toString() {
		return "Classificação do quarto: " + this.tipo + "\nNumero do quarto: " + this.numeroQuarto
				+ "\nPreço da diária: " + this.precoDiaria + "\nCor: " + this.cor + "\nQuantidade de banheiros: "
				+ this.quantidadeBanheiros + "\nQuantidade de camas de casal: " + this.quantidadeCamaCasal
				+ "\nQuantidade de camas de solteiro: " + this.quantidadeCamaSolteiro + "\nFumante: " + mensagemFumante(fumante);
	}
}

package br.com.transilvania.hotel.modelo;

import java.math.BigDecimal;

public class Hotel extends Cadastro {

	private String cnpj;
	private int andares;
	private int quantidadeQuartos;
	private BigDecimal lucroMensal;
	private BigDecimal lucroAnual;

	public Hotel(String nome, String cnpj) {
		super.setNome(nome);
		this.cnpj = cnpj;
	}

	public String getCpnj() {
		return cnpj;
	}

	public void setCpnj(String cpnj) {
		this.cnpj = cpnj;
	}

	public int getAndares() {
		return andares;
	}

	public void setAndares(int andares) {
		this.andares = andares;
	}

	public int getQuantidadeQuartos() {
		return quantidadeQuartos;
	}

	public void setQuantidadeQuartos(int quantidadeQuartos) {
		this.quantidadeQuartos = quantidadeQuartos;
	}

	@Override
	public String toString() {
		return "Nome do hotel: " + super.getNome() + "\nCNPJ: " + this.cnpj + "\nTelefone: " + super.getTelefone()
				+ "\nEndereco: " + super.getEndereco() + ", " + super.getNumero() + ", " + super.getComplemento() + ", "
				+ super.getBairro() + "\nCEP: " + super.getCep() + ", " + super.getCidade() + ", " + super.getUf()
				+ "\nAndares: " + this.andares + "\nQuantidade de quartos: " + this.quantidadeQuartos;
	}
}
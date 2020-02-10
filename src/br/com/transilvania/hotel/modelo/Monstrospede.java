package br.com.transilvania.hotel.modelo;

import java.math.BigDecimal;

public class Monstrospede extends Monstro {

	private String quarto;
	private BigDecimal valorDespesa;

	public Monstrospede(String nome, String cpf, long telefone) {
		super.setNome(nome);
		super.setCpf(cpf);
		super.setTelefone(telefone);
	}

	public String getQuarto() {
		return quarto;
	}

	public void setQuarto(String quarto) {
		this.quarto = quarto;
	}

	@Override
	public String toString() {
		return "Nome do monstróspede: " + super.getNome() + "\nCPF: " + super.getCpf() + "\nTelefone: "
				+ super.getTelefone() + "\nEndereco: " + super.getEndereco() + ", " + super.getNumero() + ", "
				+ super.getComplemento() + ", " + super.getBairro() + "\nCEP: " + super.getCep() + ", "
				+ super.getCidade() + ", " + super.getUf() + "\nData de Nascimento: " + super.getDataNascimento()
				+ "\nEmails: " + super.getEmail() + "\nQuarto em que está hospedado: " + this.quarto;
	}

}

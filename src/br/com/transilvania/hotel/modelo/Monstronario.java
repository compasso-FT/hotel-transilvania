package br.com.transilvania.hotel.modelo;

import java.math.BigDecimal;

public class Monstronario extends Monstro {

	private String setor;
	private String cargo;
	private String dataAdmissao;
	private BigDecimal salario;

	public Monstronario(String nome, String cpf, long telefone) {
		super.setNome(nome);
		super.setCpf(cpf);
		super.setTelefone(telefone);
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Nome do monstronario: " + super.getNome() + "\nCPF: " + super.getCpf() + "\nTelefone: "
				+ super.getTelefone() + "\nEndereco: " + super.getEndereco() + ", " + super.getNumero() + ", "
				+ super.getComplemento() + ", " + super.getBairro() + "\nCEP: " + super.getCep() + ", "
				+ super.getCidade() + ", " + super.getUf() + "\nData de Nascimento: " + super.getDataNascimento()
				+ "\nEmails: " + super.getEmail() + "\nSetor: " + this.setor + "\nCargo: " + this.cargo + "\nSalário: " + this.salario;
	}

}

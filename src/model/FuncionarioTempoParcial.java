package model;

public class FuncionarioTempoParcial extends Funcionario {
	private double horaEntrada;
	private double horaSaida;

	public double getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(double horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public double getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(double horaSaida) {
		this.horaSaida = horaSaida;
	}

	public String toString() {
		return "Funcionario [ID: " + getId() + " Nome: " + getNome() + " Salario: " + getSalario()
				+ "Hora Entrada: " + this.horaEntrada + "Hora Saida: " + this.horaSaida + "]";
	}
}

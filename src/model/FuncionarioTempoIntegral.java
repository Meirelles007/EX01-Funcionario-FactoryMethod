package model;

public class FuncionarioTempoIntegral extends Funcionario {
	private double bancoHoras;

	public double getBancoHoras() {
		return bancoHoras;
	}

	public void setBancoHoras(double bancoHoras) {
		this.bancoHoras = bancoHoras;
	}

	public String toString() {
		return "Funcionario [ID: " + getId() + " Nome: " + getNome() + " Salario: " + getSalario() + " Banco de Horas: "
				+ this.bancoHoras + "]";
	}
}

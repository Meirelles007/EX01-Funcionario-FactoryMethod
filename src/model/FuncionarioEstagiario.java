package model;

public class FuncionarioEstagiario extends Funcionario {
	private String instituicao_parceira;

	public String getInstituicao_parceira() {
		return instituicao_parceira;
	}

	public void setInstituicao_parceira(String instituicao_parceira) {
		this.instituicao_parceira = instituicao_parceira;
	}

	public String toString() {
		return "Estagiario [ID: " + getId() + " Nome: " + getNome() + " Salario: " + getSalario() + " Instituicao: "
				+ this.instituicao_parceira + "]";
	}
}

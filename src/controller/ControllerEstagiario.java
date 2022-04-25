package controller;

import java.util.Scanner;

import model.Funcionario;
import model.FuncionarioEstagiario;

public class ControllerEstagiario extends FactoryFuncionario {

	@Override
	public Funcionario contratacao(Funcionario f) {
		FuncionarioEstagiario funcionario = new FuncionarioEstagiario();
		int id = (int) ((Math.random() * 101) + 1);
		funcionario.setId(id);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o nome do Funcionario: ");
		funcionario.setNome(input.nextLine());

		System.out.println("Digite o Salario do Funcionario: ");
		funcionario.setSalario(Double.parseDouble(input.nextLine()));
		
		System.out.println("Digite a Instituicao Parceira: ");
		funcionario.setInstituicao_parceira(input.nextLine());
		return funcionario;
	}
}

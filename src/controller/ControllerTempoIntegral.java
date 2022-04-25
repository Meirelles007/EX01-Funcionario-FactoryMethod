package controller;

import java.util.Scanner;
import model.Funcionario;
import model.FuncionarioTempoIntegral;

public class ControllerTempoIntegral extends FactoryFuncionario{

	@Override
	public Funcionario contratacao(Funcionario f) {
		FuncionarioTempoIntegral funcionario = new FuncionarioTempoIntegral();
		int id = (int)((Math.random() * 101) + 1);
		funcionario.setId(id);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o nome do Funcionario: ");
		funcionario.setNome(input.nextLine());
		
		System.out.println("Digite o Salario do Funcionario: ");
		funcionario.setSalario(Double.parseDouble(input.nextLine()));
		
		System.out.println("Digite o Banco de Horas: ");
		funcionario.setBancoHoras(Double.parseDouble(input.nextLine()));
		
		return funcionario;
	}

}

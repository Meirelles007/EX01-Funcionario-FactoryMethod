package controller;

import java.util.Scanner;

import model.Funcionario;
import model.FuncionarioTemporario;

public class ControllerTemporaio extends FactoryFuncionario {

	@Override
	public Funcionario contratacao(Funcionario f) {
		FuncionarioTemporario funcionario = new FuncionarioTemporario();
		int id = (int)((Math.random() * 101) + 1);
		funcionario.setId(id);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o nome do Funcionario: ");
		funcionario.setNome(input.nextLine());
		
		System.out.println("Digite o Salario do Funcionario: ");
		funcionario.setSalario(Double.parseDouble(input.nextLine()));
		
		System.out.println("Digite o Ano");
		funcionario.setAno(Integer.parseInt(input.nextLine()));
		
		System.out.println("Digite o Mes");
		funcionario.setMes(Integer.parseInt(input.nextLine()));
		
		System.out.println("Digite o Dia");
		funcionario.setDia(Integer.parseInt(input.nextLine()));
		
		return funcionario;
	}

}

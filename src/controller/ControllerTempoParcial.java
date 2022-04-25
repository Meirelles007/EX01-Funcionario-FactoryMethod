package controller;

import java.util.Scanner;

import model.Funcionario;
import model.FuncionarioTempoParcial;

public class ControllerTempoParcial extends FactoryFuncionario{

	@Override
	public Funcionario contratacao(Funcionario f) {
		FuncionarioTempoParcial funcionario = new FuncionarioTempoParcial();
		int id = (int)((Math.random() * 101) + 1);
		funcionario.setId(id);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o nome do Funcionario: ");
		funcionario.setNome(input.nextLine());
		
		System.out.println("Digite o Salario do Funcionario: ");
		funcionario.setSalario(Double.parseDouble(input.nextLine()));
		
		System.out.println("Digite o Horario de Entrada");
		funcionario.setHoraEntrada(Double.parseDouble(input.nextLine()));
		
		System.out.println("Digite o Horario de Saida");
		funcionario.setHoraSaida(Double.parseDouble(input.nextLine()));
		
		return funcionario;
	}

}

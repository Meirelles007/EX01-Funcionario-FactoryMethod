package view;
import controller.ControllerEstagiario;
import controller.ControllerTempoIntegral;
import controller.ControllerTempoParcial;
import controller.ControllerTemporaio;
import controller.FactoryFuncionario;
import model.Funcionario;

public class Principal {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();
		Funcionario funcionario3 = new Funcionario();
		Funcionario funcionario4 = new Funcionario();
		
		FactoryFuncionario funcionario_integral = new ControllerTempoIntegral();
		FactoryFuncionario funcionario_temporario = new ControllerTemporaio();
		FactoryFuncionario funcionario_parcial = new ControllerTempoParcial();
		FactoryFuncionario funcionario_estagiario = new ControllerEstagiario();
		
		funcionario1 = funcionario_integral.contratacao(funcionario1);
		funcionario2 = funcionario_parcial.contratacao(funcionario2);
		funcionario3 = funcionario_temporario.contratacao(funcionario3);
		funcionario4 = funcionario_estagiario.contratacao(funcionario4);
				
		System.out.println(funcionario1.toString() + "\n");
		System.out.println(funcionario2.toString() + "\n");
		System.out.println(funcionario3.toString() + "\n");
	    System.out.println(funcionario4.toString() + "\n");

		
	}

}

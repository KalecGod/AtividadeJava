package calculadoretabuada;

import java.util.Scanner;

public class Calculadora {

	
	public void calculador() {

		var input = new Scanner(System.in);
		var escolha = "";
		var calculo = new baseCalculo();

		System.out.println("Informe os 2 Números para iniciar o Calculo");

		System.out.println("Primeiro Número: ");
		var num1 = input.nextDouble();

		System.out.println("Segundo Número: ");
		var num2 = input.nextDouble();

		System.out.println("Desaja Escolher 'Soma,Subtração,Divisâo,Multiplicao e Resto'");
		
		escolha=input.next();

		if (escolha.equalsIgnoreCase("soma")) {

			var result =calculo.soma(num1, num2);

			
			System.out.printf("A Soma dos Números foi %.2f ", result);

		} else if (escolha.equalsIgnoreCase("subtracao")) {


			var result =calculo.subtracao(num1, num2);

			
			System.out.printf("A Subtração dos Números foi %.2f ", result);


		} else if (escolha.equalsIgnoreCase("Divisao")) {

			var result =calculo.divisao(num1, num2);

			
			System.out.printf("A Divisao dos Números foi %.2f ", result);


		} else if (escolha.equalsIgnoreCase("Multiplicacao")) {


			var result =calculo.multiplicacao(num1, num2);

			
			System.out.printf("A Multiplicacao dos Números foi %.2f ", result);


		} else if (escolha.equalsIgnoreCase("Resto")) {


			var result =calculo.resto(num1, num2);

			
			System.out.printf("A Resto dos Números foi %.2f ", result);


		}else {
			
			System.out.println("Opção nao Encontrado");
		}

		input.close();
	}
	
}

package calculadoretabuada;

import java.util.Locale;
import java.util.Scanner;

public class BaseTextoDados {
	
	public void calculo() {
		Locale.setDefault(Locale.US);

		var input = new Scanner(System.in);
		var escolha = "";
		
		System.out.println("Escolha se Deseja Calculo ou Tabuada");
		
		escolha = input.next();

		if (escolha.equalsIgnoreCase("calculo")) {

			var calculo = new Calculadora();

			calculo.calculador();

		} else if (escolha.equalsIgnoreCase("Tabuada")) {
			var tabu = new Tabuada();
			
			tabu.tabuSimples();

		}else {
			System.out.println("Opções Invalidas");
		}
		input.close();
	}

	
	

}

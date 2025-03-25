package calculadoretabuada;

import java.util.Scanner;

public class Tabuada {
	
	public void tabuSimples() {

		var input = new Scanner(System.in);

		System.out.println("Informe o Número para efetuar a tabuada ate 10");
		var num = input.nextInt();
		for (int i = 1; i <= 10; i++) {

			System.out.println(num + " x " + i + " = " + (num * i));

		}
		
		input.close();

	}

}

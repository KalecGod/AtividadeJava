package atividadeObesidade;

import java.util.Locale;
import java.util.Scanner;

public class aplicacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		var input = new Scanner(System.in);

		var p = new IMC();
		System.out.println("Informe Altura: ");
		p.setAltura(input.nextDouble());

		System.out.println("informe o seu Peso: ");
		p.setPeso(input.nextDouble());

		var result = p.calculo(p.getPeso(), p.getAltura());

		if (result < 18.5) {
			System.out.println("Abaixo do peso");

		} else if (result >= 18.6 && result <= 24.9) {

			System.out.println("Peso ideal");

		} else if (result >= 25 && result <= 29.9) {

			System.out.println("Levemente acima do peso");
		}

		else if (result >= 30 && result <= 34.9) {

			System.out.println("Obesidade Grau I");
		}

		else if (result >= 35 && result <= 39.9) {

			System.out.println("Obesidade Grau II");

		} else {
			System.out.println("Obesidade III (Mórbida)");
		}

		
		
		
	input.close();

	}

}

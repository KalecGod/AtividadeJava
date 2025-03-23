package atividadeBest;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class UtilizacaoPrintf {

	public static void main(String[] args) {

		var input = new Scanner(System.in);

		System.out.println(
				"Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: \"Olá 'Fulano' você tem 'X' anos\"");

		System.out.println("Digite seu nome: ");

		var name = input.next();

		System.out.println("Informe o ano que nasceu: ");

		var age = input.nextInt();

		var years = OffsetDateTime.now().getYear();

		var birthday = years - age;

		System.out.println("Já fez aniversario esse ano ?");
		var HaveVouHadABirthdayYet = input.next();

		if (HaveVouHadABirthdayYet.equalsIgnoreCase("sim")) {

			System.out.printf("Olá %s você tem %d anos de Vida ", name, birthday);

		}else if(HaveVouHadABirthdayYet.equalsIgnoreCase("nao")) {
			System.out.printf("Olá %s você tem %d anos de Vida ", name, birthday - 1);

		}else {
			System.out.println("Opção Invalida");
		}

	}

}

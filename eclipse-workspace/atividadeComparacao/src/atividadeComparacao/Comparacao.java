package atividadeComparacao;

import java.util.Scanner;

public class Comparacao {

	public static void main(String[] args) {

		var input = new Scanner(System.in);

		System.out.println(
				"Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas");

		System.out.println("Informe o Primeiro Nome e Idade: ");

		var name = input.next();
		int age = input.nextInt();
		var person1 = new Pessoa(name, age);

		System.out.println("Informe o Seguno Nome e Idade: ");

		name = input.next();
		age = input.nextInt();
		var person2 = new Pessoa(name, age);

		if (person1.getAge() > person2.getAge()) {

			var diferenca = person1.getAge() - person2.getAge();

			System.out.printf("%s é mais velho que %s por %d anos ", person1.getName(), person2.getName(), diferenca);

		} else if (person1.getAge() < person2.getAge()) {

			var diferenca = person2.getAge() - person1.getAge();

			System.out.printf("%s é mais velho que %s por %d anos ", person2.getName(), person1.getName(), diferenca);

		} else {

			var diferenca = person2.getAge() - person1.getAge();

			System.out.printf("%s e %s tem a mesma Idada ", person1.getName(), person2.getName());

		}

		input.close();
	}

}

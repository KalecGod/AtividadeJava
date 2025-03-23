package areaRetangulo;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		System.out.println(
				"Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela");

		var input = new Scanner(System.in);

		System.out.println("Informe a Base: ");

		var base = input.nextDouble();

		System.out.println("Informe a altura: ");

		var altura = input.nextDouble();

		var area = base * altura;

		System.out.printf("Os dados da Area foi %.2f", area);

	}

}

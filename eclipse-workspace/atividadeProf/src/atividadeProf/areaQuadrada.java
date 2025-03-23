package atividadeProf;

import java.util.Scanner;

public class areaQuadrada {

	public static void main(String[] args) {
		
		var input = new Scanner(System.in);
		
		System.out.println("Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela");
		
		System.out.println("Lado 1:");
		var lado = input.nextInt();
		
		var area =  lado * lado;
		
		
		System.out.printf("Valor da Area é %d",area);
		
		
		input.close();

	}

}

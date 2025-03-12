package projetoDio;

import java.util.Scanner;

public class subClass {

	public void calculosSaldo() {

		Scanner input = new Scanner(System.in);

		double saldo;
		double bonus;

		// Saldo
		System.out.println("Salario Bruto");
		saldo = input.nextDouble();
		// Bonus
		System.out.println("Bônus");
		bonus = input.nextDouble();

		if (saldo >= 0 && saldo <= 1100) {

			double desc = saldo * 5 / 100;

			double saldoFinal = (saldo - desc) + bonus;

			System.out.printf("Salário Líquido:1 R$ %.2f", saldoFinal);

		} else if (saldo > 1100 && saldo <= 2500) {

			double desc = saldo * 10 / 100;

			double saldoFinal = (saldo - desc) + bonus;

			System.out.printf("Salário Líquido:2 R$ %.2f", saldoFinal);

		} else {

			double desc = saldo * 15 / 100;

			double saldoFinal = (saldo - desc) + bonus;

			System.out.printf("Salário Líquido:3 R$ %.2f", saldoFinal);

		}
		
		input.close();

	}

}

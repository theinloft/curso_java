package curso_java;

import java.util.Scanner;

public class exerc_03_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a
		 * preferência de seus clientes. Escreva um algoritmo para ler o tipo de
		 * combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
		 * 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de
		 * 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa
		 * será encerrado quando o código informado for o número 4. Deve ser escrito a
		 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
		 * tipo de combustível , conforme exemplo.
		 */

		int tipoCombustivel = 0;
		int contadorGasolina = 0;
		int contadorAlcool = 0;
		int contadorDiesel = 0;
		Scanner sc = new Scanner(System.in);

		while (tipoCombustivel != 4) {
			System.out.println("Digite:\n1-Alcool\n 2-Gasolina\n 3-Diesel\n 4-Fim\n");
			tipoCombustivel = sc.nextInt();

			switch (tipoCombustivel) {
			case 1:
				contadorAlcool++;
				break;

			case 2:
				contadorGasolina++;
				break;

			case 3:
				contadorDiesel++;
				break;

			}

		}
		System.out.println("Muito Obrigado");
		System.out.println(
				"\nAlcool:" + contadorAlcool + "\nGasolina:" + contadorGasolina + "\nDiesel:" + contadorDiesel);

	}

}

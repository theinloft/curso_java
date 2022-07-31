package Prova_LogicaProgramacao;

import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int codigoPeca1;
		int codigoPeca2;
		double valorPeca1;
		double valorPeca2;
		int quantidadepeca1, quantidadepeca2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do código da peca 1:");
		codigoPeca1 = sc.nextInt();
		System.out.println("Digite o valor unitário da peca 1:");
		valorPeca1 = sc.nextDouble();
		System.out.println("Digite a quantidade de peca 1:");
		quantidadepeca1 = sc.nextInt();
		System.out.println("Digite o valor do código da peca 2:");
		codigoPeca2 = sc.nextInt();
		System.out.println("Digite o valor unitário da peca 2:");
		valorPeca2 = sc.nextDouble();
		System.out.println("Digite a quantidade de peca 2:");
		quantidadepeca2 = sc.nextInt();		
		
		double valorTotal = quantidadepeca1 * valorPeca1;
		valorTotal += quantidadepeca2 * valorPeca2;
		
		System.out.println("VALOR TOTAL A PAGAR:"+valorTotal);

	}

}

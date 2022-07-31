package Prova_LogicaProgramacao;

import java.util.Scanner;
 import java.lang.Math;


public class exercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double area;
		double raio;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a raio:");
		raio = sc.nextDouble();
		
		area = 3.14159 * Math.pow(raio,2);
		
		System.out.println(area);
		
		
	}

}

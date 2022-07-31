package curso_java;

import java.util.Scanner;

public class exercicio_senha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.*/

		int senha = 0;
		int senha_correta =2002;
		Scanner sc = new Scanner(System.in);
		
		while(senha != senha_correta) {
			System.out.println("Digite a senha:\n");
			senha = sc.nextInt();
			
			
			if(senha == senha_correta) {
				System.out.println("Senha correta! Acesso permitido!");
				sc.close();
			}
			else
				System.out.println("Senha invalida");
			
		}
		
		
	}

}

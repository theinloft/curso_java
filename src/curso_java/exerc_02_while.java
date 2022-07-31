package curso_java;

import java.util.Scanner;

public class exerc_02_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x=1;
		int y=1;
		
		while(x!=0 && y != 0) {
			x = sc.nextInt();
			y = sc.nextInt();
			
			if(x >0 && y>0)
				System.out.println("Primeiro");
				
			else if(x < 0 && y>0)
				System.out.println("Segundo");
			else if(x <0 && y<0)
				System.out.println("Terceiro");
			else
				System.out.println("Quarto");
			
			
		}
		
		
	}

}

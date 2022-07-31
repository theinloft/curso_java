package application;

import java.util.Scanner;

import entities.Triangle;

public class ProgramTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
	Triangle x = new Triangle();	
	Triangle y = new Triangle();
	
	System.out.println("Digite as medidas do triangulo X:");
	x.x = sc.nextDouble();
	x.y = sc.nextDouble();
	x.z = sc.nextDouble();
	
	System.out.println("Digite as medidas do triangulo Y:");
	y.x = sc.nextDouble();
	y.y = sc.nextDouble();
	y.z = sc.nextDouble();
	
	double areaX = x.calculaArea();
	double areaY = y.calculaArea();
	
	System.out.printf("Area do Triangulo X: %.4f%n",areaX);
	System.out.printf("Area do Triangulo Y:%.4f%n",areaY);
	
		
	}

}

package application;

import java.util.Scanner;

import entities.Product;

public class ProgramStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		
		System.out.println("Enter Product Data:");
		System.out.println("Name:");
		product.name = sc.nextLine();
		System.out.println("Price:");
		product.price = sc.nextDouble();
		System.out.println("Quantity:");
		product.quantity = sc.nextInt();
		
		System.out.println("Name:"+product.name+","+"Price:"+product.price+","+"Quantidade:"+product.quantity);
		
		
		sc.close();

	}

}

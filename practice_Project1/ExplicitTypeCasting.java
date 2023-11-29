package practice_Project1;

import java.util.Scanner;

public class ExplicitTypeCasting {
	public void convert(double var) {
		int explicit= (int) var;
		
		System.out.println("Conversion of Double to Integer (Narrowing)-->"+explicit);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExplicitTypeCasting exp=new ExplicitTypeCasting();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Double Value: ");
		double variable=sc.nextDouble();
		exp.convert(variable);
	}



}

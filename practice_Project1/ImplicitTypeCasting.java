package practice_Project1;

import java.util.Scanner;

public class ImplicitTypeCasting {

	
	public void convert(int var) {
		double implicit= var;
		
		System.out.println("Conversion of Integer to Double (Widening)-->"+implicit);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImplicitTypeCasting imp=new ImplicitTypeCasting();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Integer Value: ");
		int variable=sc.nextInt();
		imp.convert(variable);
	}

}

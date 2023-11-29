package practice_project8;


class amount{
	int amount=5000;
}


class bank extends amount{

	void calculateAmountWithROI(int amount,double roi) {

		double finalAmount=amount+amount*(roi/100);
		System.out.println(finalAmount);
	}

}

class hdfc extends bank {
	void calculateROI() {

		double roi=7.5;
		super.calculateAmountWithROI(amount,roi);
	}

}

class icici extends bank{
	void calculateROI() {

		double roi=8.5;
		super.calculateAmountWithROI(amount,roi);
	}
}



public class InheritanceImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		icici bank1=new icici();
		System.out.println("Icici final amount is:");
		bank1.calculateROI();


		hdfc bank2=new hdfc();
		System.out.println("Hdfc final amount is:");
		bank2.calculateROI();
	}



}

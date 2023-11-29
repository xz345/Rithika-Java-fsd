package practice_Project2;

class privateModifier{
	private void display() {
		System.out.println("Hello i am private");
	}
}



public class PrivateAccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		privateModifier a=new privateModifier();
		a.display();
		

	}

}

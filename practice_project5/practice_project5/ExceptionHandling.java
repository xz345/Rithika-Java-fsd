package practice_project5;


class CustomException extends Exception{
	public CustomException(String Message) {
		super(Message);
	}
}




public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//throw class
		try {
			int dividend=10;
			int divisor=0;
			
			if(divisor==0) {
				throw new ArithmeticException(" Cannot divide by zero");
			}
			divideNumbers(dividend,divisor);
			
		//CustomException call
			int age=17;
			if(age<18) {
				throw new CustomException("You are not eligible for driving license");
			}
			
			
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException" +e.getMessage());
		}
		
		catch(CustomException e) {
			System.out.println("CustomException"+e.getMessage());
		}
		finally {
			System.out.println("Finally block is executed");
		}
	}

	private static void divideNumbers(int dividend, int divisor) {
		// TODO Auto-generated method stub
		if(divisor==0) {
			throw new ArithmeticException("Cannot divide by zero");
		}
		int answer=dividend/divisor;
		System.out.println("Result of divide:"+answer);
	}

	
}

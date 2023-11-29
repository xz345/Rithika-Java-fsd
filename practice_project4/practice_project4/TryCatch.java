package practice_project4;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int num=10;
			int div=num/0;
			
			System.out.println("Result is:"+div);
		}
		
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Any number divide by zero throws ArithmeticException");
		}
		
		System.out.println("Due to Try-Catch block, I am running after Exception");
	}

}

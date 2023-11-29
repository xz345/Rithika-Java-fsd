package practice_project8;
// Over Loading
class Ride1{
	void primitivePreference (int a) {
		System.out.println("int");

	}

	void primitivePreference (boolean a) {
		System.out.println("boolean");
	}

	void primitivePreference (byte a) {
		System.out.println("byte");
	}

	void primitivePreference (long a) {
		System.out.println("long");
	}

	void primitivePreference (float a) {
		System.out.println("float");
	}


	void primitivePreference (double a) {
		System.out.println("double");
	}

	void primitivePreference (short a) {
		System.out.println("short");
	}

	void primitivePreference (char a) {

		System.out.println("char");
	}

}

//Over-riding 
class Ride2{
	
//	Over-riding
	void primitivePreference (int a) {
		System.out.println("int");

	}

}

public class PolyMorphism {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ride1 ride=new Ride1();

		Ride2 ride1=new Ride2();
		
		ride1.primitivePreference(1);
		ride.primitivePreference(8);

	}

}



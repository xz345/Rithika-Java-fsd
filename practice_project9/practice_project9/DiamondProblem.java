package practice_project9;

interface A{
	default void sun() {

		System.out.println("I am sun");
	}
}


interface B{
	default void sun() {

		System.out.println("The Sun is the star at the center of the Solar System");

	}
}

class C implements A,B{
	public void sun() {
		A.super.sun();
	}

}

public class DiamondProblem {

	public static void main(String[] args) {

		C obj=new C();
		obj.sun();
	}

}



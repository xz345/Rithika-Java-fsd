package practice_project9;

public class ArrayImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//multi dimensional
		int[][] multi = {
				{2, 4, 6, 8}, 
				{3, 6, 9} };

		System.out.println("\nLength of row 1: " + multi[0].length);

		System.out.println("************************");
		//Single dimensional

		int arrayImp[];
		arrayImp=new int[10];

		arrayImp[0]=12;
		arrayImp[1]=17;
		arrayImp[2]=25;
		arrayImp[3]=29;
		arrayImp[4]=34;
		arrayImp[0]=41;
		arrayImp[6]=45;
		System.out.println("newly added elements: "+arrayImp[5]);

		System.out.println("************************");

		int len=arrayImp.length;
		System.out.println("The length of the array"+len);

		System.out.println("************************");

		int first=arrayImp[0];
		System.out.println("The first element of an array is:"+first);
		System.out.println("************************");

		int last=arrayImp[arrayImp.length-1];
		System.out.println("The last element of an array is:"+last);

		System.out.println("************************");
		//print each array element
		System.out.println("Print each elements in array");
		for(int i=0;i<arrayImp.length;i++) {
			System.out.println(arrayImp[i]);
		}

		System.out.println("************************");
		//Modify array element

		System.out.println("Print modified array elements=>");
		arrayImp[1]=14;
		System.out.println(arrayImp[1]);

		System.out.println("************************");

		System.out.println("to show array index out of bound:=>"+arrayImp[20]);

		System.out.println("Updated element in index-1 of an array: "+arrayImp[1]);

		System.out.println("************************");
		System.out.println("to verify a value is present in array");

		System.out.println("");


		int searchValue = 4;
		boolean found = false;
		for (int number : arrayImp) {
			if (number == searchValue) {
				found = true;
				break;
			}
		}
		System.out.println("Element " + searchValue + " found: " + found);















		int expectedLength=5;
		int actualLength=arrayImp.length;

		assert actualLength== expectedLength:"Array Length not matches";

	}

}

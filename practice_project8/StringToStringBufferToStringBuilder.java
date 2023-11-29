package practice_project8;

public class StringToStringBufferToStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String str1="Hello! Hi";
		System.out.println(str1);

		/* String is immutable
		str1.append("i am");
		System.out.println(str1);
		 */
		
		StringBuffer str2=new StringBuffer(str1);
		str2.append(" i am abishek ");
		System.out.println(str2);
		
		StringBuilder str3=new StringBuilder(str2);
		str3.append(", I am a Java developer.");
		System.out.println(str3);
	}

}

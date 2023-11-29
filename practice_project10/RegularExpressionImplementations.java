package practice_project10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionImplementations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="king virat kohli scores more than sachin.";
		
        String rg = "\\b\\w*scores\\w*\\b";
        
        Pattern pt=Pattern.compile(rg);
        
        Matcher mt=pt.matcher(name);
        
        
        System.out.println("Words in the text Containing 'scores':");

        while(mt.find()) {
        	System.out.println(mt.group());
        }
		
	boolean matchesEntireText=mt.matches();
	System.out.println("Entire text matches: "+matchesEntireText);
	}

}

package practice_project2;

import java.util.Arrays;

public class FourthSmallestElement 
{
public static void main(String[] args)
{
int[] unsortedList= {3,28,9,29,5,10,20};
int fourthSmallest=findFourthSmallest(unsortedList);
System.out.println("The fourth smallest element is: "+fourthSmallest);
}

public static int findFourthSmallest(int[] arr) 
{
if(arr.length<4)	
{
	return -1;
}
Arrays.sort(arr);
return arr[3];
}
}

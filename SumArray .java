/* Sum Of Array Element */


import java.util.*;

public class SumArray {

	public static void main(String[] args) {
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter the array element");
	
	int[]array= {10,20,30};
	int sum=0;
	for(int i=0;i<array.length;i++)
	{
		sum +=array[i];
	}
	System.out.println("Sum of array elemnt:"+sum);
	}
}
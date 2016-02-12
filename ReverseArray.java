package Session4;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		
		int a[] = new int[5],i;
		
		@SuppressWarnings({ "resource" })
		Scanner inputarray= new Scanner(System.in);
		System.out.println("Enter elements to the array");
		
		for(i=0;i<5;i++)
		{
			a[i]=inputarray.nextInt();
		}
		
		System.out.println("Array in the reverse order is");
		
		for(i=4;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		

	}

}

package Session4;

import java.util.Scanner;

public class SortInsert {

	public static void main(String[] args) {
		
		int temp,i;
		
		//@SuppressWarnings("resource")
		//Scanner in=new Scanner(System.in);
		
		//System.out.println("Enter the no of elements in the array");
		
		//int n=in.nextInt();
		
		System.out.println("Enter the array");
		
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		
		int a[]= new int[5];
				
		for(i=0;i<5;i++)
		{
		 a[i]=input.nextInt();// to take elements into the array
		 
		}
		
		for(i=0;i<5;i++)// to sort the elements in the array
		{
			for(int j=i+1;j<5;j++)
			{
			if (a[i]>a[j])
			{
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
							
			}
				
			}
		}	
		
		System.out.println("Sorted array is");// to print the array in sorted order
		
		for(i=0;i<5;i++)
		{
			System.out.println(a[i]);
			
		}
		
		System.out.println("Element to be inserted");
		@SuppressWarnings("resource")
		Scanner insert=new Scanner(System.in);
		int b=insert.nextInt();
		
		a[5]=b;
		 
		 for(i=0;i<6;i++)// to sort the elements in the array after element insertion
			{
				for(int j=i+1;j<6;j++)
				{
				if (a[i]>a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
								
				}
					
				}
			}	
			
			System.out.println("Sorted array after insertion of new element is");// to print the array in sorted order after new element insertion
			
			for(i=0;i<6;i++)
			{
				System.out.println(a[i]);
				
			}
		
		
	}

	
}
	

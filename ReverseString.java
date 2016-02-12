package Session4;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
			Scanner in= new Scanner (System.in);
			
			//System.out.println("Enter the number of letters");
			
			//int noofLetters=in.nextInt();

		
			System.out.println("Enter the word to be reversed");
			/*@SuppressWarnings({ "resource", "unused" })
		  	Scanner input= new Scanner (System.in);*/
			String []word=new String[5];
			
			for(int i=0;i<word.length;i++)
			{	
			
				word[i]=in.nextLine();
			}
			
		System.out.println("The array in reverse order is");
		
		for(int j=word.length-1;j>=0;j--)
		{
			System.out.print(word[j]);
		}
		
		}

}

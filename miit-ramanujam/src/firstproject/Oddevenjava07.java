package firstproject;

import java.util.Scanner;

public class Oddevenjava07 {
	public static void main(String[] args) {
		int num;
		System.out.println("Enter an integer number:");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		if (num % 2 == 0 )
			System.out.println("Enterred number is even");
		else
			System.out.println("Enterred number is odd");
		
	} 

}

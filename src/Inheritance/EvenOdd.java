package Inheritance;
import java.util.Scanner;

public class EvenOdd {
	public static void main(String args[]) {
		
		int a;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		a=sc.nextInt();
		sc.close();
		
		if(a%2==0) {
			System.out.println("Number is Even.");
		}
		else {
			System.out.println("Number is Odd.");
		}
	
		
	}

}

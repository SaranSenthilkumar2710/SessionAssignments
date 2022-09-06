package session.assignments;

import java.util.Scanner;

public class OddOrEvenArithmeticOperator {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value of a :");
	int a = sc.nextInt();
	System.out.println("Given Number : " + a);
	
	int x = a%2;
	if(x==0) {
		System.out.println("Given number is "+a+ " Even!");
	}else {
		System.out.println("Given number is "+a+ "Odd!");
	}
}
}

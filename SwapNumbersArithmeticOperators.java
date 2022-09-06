package session.assignments;

import java.util.Scanner;

public class SwapNumbersArithmeticOperators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a :");
		int a = sc.nextInt();
		System.out.println("Enter value of b :");
		int b = sc.nextInt();
		System.out.println("Given Numbers : a=" + a + " and b=" + b);
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("Numbers after swapping : a=" + a + " and b=" + b);
	}
}

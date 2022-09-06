package session.assignments;

import java.util.Scanner;

public class OddOrEvenXOR {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value of a :");
	int a = sc.nextInt();
	System.out.println("Given Number : a = " + a);
	int nextNum = a+1;
	int x = a^1;
	if(x==nextNum) {
		System.out.println("Given number is Even!");
	}else {
		System.out.println("Given number is Odd!");
	}
}
}

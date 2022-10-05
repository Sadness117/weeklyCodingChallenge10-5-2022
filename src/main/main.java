package main;

import problems.Problem1;
import problems.Problem2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem1 problem1 = new Problem1();
		System.out.println("Java problems");
		System.out.println("first coding problem: Create a function that will test if a string is a valid PIN or not via a regular expression");
		System.out.println("input 121317 = " + problem1.validate("121317"));
		System.out.println("input 1234 = " +problem1.validate("1234"));
		System.out.println("input 45135 = " +problem1.validate("45135"));
		System.out.println("input 89abc1 = " +problem1.validate("89abc1"));
		System.out.println("input 900876 = " +problem1.validate("900876"));
		System.out.println("input 4983 = " +problem1.validate(" 4983"));
		System.out.println("---------------------");
		System.out.println("second coding problem: Create a function that checks if a given integer is exactly the factorial of an integer or not. true if it is, false otherwise.");
		Problem2 problem2 = new Problem2();
		System.out.println("input 2 = "+problem2.isFactorial(2));
		System.out.println("input 27 = "+problem2.isFactorial(27));
		System.out.println("input 24 = "+problem2.isFactorial(24));
		
	
		
		
		
		
		
	}

}

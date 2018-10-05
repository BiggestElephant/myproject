package test;

import java.util.Scanner;

public class TestReverseNumber {

	public static void main(String[] args) {
		System.out.println(reverseNum(new Scanner(System.in).nextInt()));
	}
	public static int reverseNum(int num) {
		int num1=0;
		while(num%10!=0) {
			//System.out.println(num%10);
			int t = num%10;
			num1 = num1*10 + t;
			System.out.println(num1);
			num=num/10;
			
		}
		
		return num1;
		
	}
	
}

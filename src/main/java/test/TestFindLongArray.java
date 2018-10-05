package test;

import java.util.Scanner;

public class TestFindLongArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("输入数字1<num>101");
		int num1=scan.nextInt();
		System.out.println("输入数字1<num>101");
		int num2=scan.nextInt();
		
		
		int arr1[]=new int[50];
		int arr2[]=new int[50];
		for(int i=1;i<101;i++) {
			
			if(i%2==0) {
				arr2[i/2-1]=i;
			}else {
				arr1[i/2]=i;
			}
		}
		
		
	for(int i=0;i<arr1.length;i++) {
		System.out.print(arr1[i]+" ");
		
	}
	System.out.println();
	for(int i=0;i<arr1.length;i++) {

		System.out.print(arr2[i]+" ");
	}System.out.println();
	//两个偶数
	if(num1%2==0&&num2%2==0) {
		System.out.println("首数："+arr2[0]+" 长度："+arr2.length);
	}else if(num1%2==1&&num2%2==1){//两个基数
		System.out.println("首数："+arr1[0]+" 长度："+arr1.length);
	}else {//一基数一偶数
		int number1=0;//代表距离数组50下标的距离；number1存奇数数组
		int number2=0;
		//基数
		if(num1%2==1) {
			number1=(num1+1)/2;
		}
		if(num2%2==1) {
			number1=(num2+1)/2;
		}
		//偶数
		if(num1%2==0) {
			number2=num1/2;
		}
		if(num2%2==0) {
			number2=num2/2;
		}
		System.out.println("number1:"+number1+"  number2:"+number2);
		if(number1>number2) {
			
		}
		if(number1==number2) {
			
		}
	}
	
	
	
	
		
	}
}

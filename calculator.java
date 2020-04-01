package com.jse.app;
import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
	//첫번째 수 입력
	//두번째 수 입력
	//두수의 합은?
	
		Scanner scanner =  new Scanner(System.in);
		System.out.println("첫번째 수 입력");
		int a = scanner.nextInt();
		
		System.out.println("두번째 수 입력");
		int b = scanner.nextInt();
		
		System.out.println("세번째 수 입력");
		int c = scanner.nextInt();
		
		System.out.println("네번째 수 입력");
		int d = scanner.nextInt();
		int e = a + b + c +d;
		System.out.println("합은"+ e);
		
		
	
	
	
	
	
}
}

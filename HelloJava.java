package com.jse.app;
	import java.util.Scanner;
public class HelloJava {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
         System.out.println("이름이 뭐에요?");
         String name = scanner.next();
         System.out.println("안녕하세요." +name +" 씨.");
         
         System.out.println("어디사세요?");
         String live = scanner.next();
         System.out.println("아 " + live + " 거기 좋은 곳이죠.");
         
         System.out.println("몇살이에요?");
         int age = scanner.nextInt();
         
         System.out.println(age + "살이네요.");
         System.out.println("키는 몇이고, 몸무게는 몇 kg이세요?");
         float height = scanner.nextFloat();
         double weight = scanner.nextDouble();
         
         System.out.println("혈액형이 뭐에요?");
         char bloodtype = scanner.next().charAt(0);
         
	} 
}



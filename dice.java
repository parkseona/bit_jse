package com.jse.app;
import java.util.Scanner;
import java.util.Random;
//시나리오
public class dice {

	public static void main(String[] args) {
		switchdice();
	
	}
	static void switchdice() {
		System.out.println("주사위 짝/홀 맞추기");
		System.out.println("예상 홀짝 값을 입력");
		Scanner scanner = new Scanner(System.in);
		String expect = scanner.next();
		System.out.println(String.format("사용자가 입력한 값: %s", expect));

		Random random = new Random();
		int dice = random.nextInt(4);
		System.out.println(String.format("사용자가 입력한 값: %d", dice));
		String result = "";
		switch(dice) {
		 case 1:case 3:case 5: result = "홀"; break;
		 case 2:case 4:case 6: result = "짝"; break;
		  
		}
		System.out.println("컴퓨터 홀/짝 결과"+ result);
		String result2 = "틀림";
		if(expect.equals(result)) {
				result2 = "맞음";
		}
		System.out.println(String.format("결과: %s", result2));
}
}
		
		
		//왜 if쓰나 부등호 써야할 때.......
	
		
//		 
//	 
//				
//		
//		
//		
//		
//		System.out.println("랜덤 값 결과 홀/짝" + result);
//	if(expect.equals(result)) 
//		System.out.println("결과: 맞음");
//	else {
//		System.out.println("결과: 틀림");
//	}
//		
//				
//				
//				
//				
//				
//		
//	}
//
//	static void dice() {
//
//	System.out.println("주사위 홀짝 맞추기 게임");	
//	System.out.println("기대하는 값 홀짝을 입력해주세요");
//	Scanner scanner = new Scanner(System.in);
//	String expect =  scanner.next();
//	System.out.println("사용자 예상값 : "+ expect);
//
//	
//	Random random = new Random();
//	int dice = random.nextInt(6) + 1;
//	System.out.println("컴퓨터가 생성한 값 "+ dice);
//	String result = "";
//    
//	if(dice == 1) {
//         result = "홀";
//         
//    }else if(dice == 2) {
//         result = "짝";
//         
//    }else if(dice == 3) {
//         result = "홀";
//         
//    }else if(dice == 4) {
//         result = "짝";
//    
//    }else if(dice == 5) {
//         result = "홀";
//         
//    }else {
//         result = "짝";
//        
//	} 
//	
//    System.out.println("컴퓨터 홀짝 결과" + result);
//    if(expect.equals(result)) {//object type operation 의 method로 처리한다악.
//
//    	System.out.println("결과: 맞");
//	}else {
//		System.out.println("결과: 틀");
//		}	
//	
//	}	
//	
//	
//}
//	
	






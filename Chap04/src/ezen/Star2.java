package ezen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Star2 {

	public static void main(String[] args) {
		System.out.println("\n-별다섯개 5줄 출력------------");
		//다중 for 반복
		for(int j=1;j<=5;j++) {
			for(int i=1;i<=5;i++)
				System.out.print("*");
			System.out.println();//줄바꾸기
		}//end for
		System.out.println("\n-Star2 출력------------");
		//다중 for 반복
		for(int j=1;j<=4;j++) {
			//공백출력					
			for(int i=1;i<=j*2-1;i++)
				System.out.print("*");
			System.out.println();//줄바꾸기
		}//end for	
		
		
		System.out.println("\n-Star2 2출력------------");
		//다중 for 반복
		for(int j=1;j<=4;j++) {
			for(int i=1;i<=4-j;i++)
				System.out.print(" ");	
			for(int i=1;i<j*2;i++)
				System.out.print("*");
			System.out.println();//줄바꾸기
		}//end for

		System.out.println("\n-Star3 줄 입력(2~30) ------------");
		// 변수 선언
		int line=0;
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("줄 수 입력(2~30)>>");// 메시지출력	
			// 잘못된 입력 (try~catch)
			try {
				line=sc.nextInt();// 입력
			}catch(InputMismatchException e) {
				System.out.println("입력값은(2~30) 문자값은 앙되요!!");
				sc.nextLine();//입력버퍼비우기
				continue;
			}			
			// 잘못된 숫자 (if)
			if(line<2 || line>30) {
				System.out.println("입력값은 2~30사이입니다. 확인하세요!");
				continue;
			}
			for(int j=1;j<=line;j++) {
				for(int i=1;i<=line-j;i++)
					System.out.print(" ");	
				for(int i=1;i<j*2;i++)
					System.out.print("*");
				System.out.println();//줄바꾸기
			}//end for
			break;
		}//end while
		sc.close();
	}//end main

}//end class

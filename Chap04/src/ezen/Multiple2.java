package ezen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiple2 {

	public static void main(String[] args) {
		// 변수선언
		int n=0;//기본형 변수(리터럴 저장)
		Scanner sc;//참조형 변수:객체,클래스변수(객체의 주소 저장)
		//Scanner 객체 생성
		sc=new Scanner(System.in);//System.in:표준입력keyboard
		
		while(true) {
			// 메시지출력 - syso+컨트롤+스패이스
			System.out.print("정수 1개 입력 >>");
			try {
				n=sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("입력값은 정수 입니다.");
				//버퍼 비우기
				sc.nextLine();
				continue;
			}
			
			if(n<1) {
				System.out.println(n+"는 잘못된 입력 값입니다.");
				continue;//반복문의 조건으로 간다				
			}
			if(n%3==0 || n%5==0)
				System.out.println(n+"는 3또는 5의 배수 입니다.");
			else 
				System.out.println(n+"는 3또는 5의 배수가 아닙니다.");
			break;
		}//end while
		sc.close();
	}

}

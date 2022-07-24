package ezen;

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		// 변수선언
		int n;//기본형 변수(리터럴 저장)
		Scanner sc;//참조형 변수:객체,클래스변수(객체의 주소 저장)
		//Scanner 객체 생성
		sc=new Scanner(System.in);//System.in:표준입력keyboard
		
		while(true) {
			// 메시지출력 - syso+컨트롤+스패이스
			System.out.print("정수 1개 입력 >>");
			// 입력
			//n=n+1;
			n=sc.nextInt();
			// 처리->출력
			//연산자 우선순위 : 산술-관계-논리-대입
			//중첩 if
			if(n<1)System.out.println(n+"는 잘못된 입력 값입니다.");
			else {
				if(n%3==0 || n%5==0)
					System.out.println(n+"는 3또는 5의 배수 입니다.");
				else 
					System.out.println(n+"는 3또는 5의 배수가 아닙니다.");
			}
			//2 
			if(n<1) {
				System.out.println(n+"는 잘못된 입력 값입니다.");
				sc.close();
				return;//복귀, 이 메소드를 호출 했던 곳으로 되돌아 간다.
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

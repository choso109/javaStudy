package ezen;

import java.util.Scanner;

public class FtoC_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수선언 실수형
		int menu;//메뉴
		double t;//온도저장할 변수
		//Scanner 클래스 입력 Scanner 객체 생성
		Scanner sc=new Scanner(System.in);
		//메시지출력
		while(true) {//참일동안 반복
			System.out.println("-------------------");
			System.out.println(" 1. 화씨온도->섭씨온도");
			System.out.println(" 2. 섭씨온도->화씨온도");
			System.out.println("-------------------");
			System.out.print("변환 방식 선택(1,2) >>");
			menu=sc.nextInt();
			if(menu<1 || menu>2) {
				System.out.println("잘못된 메뉴 선택입니다.");
				continue;//반복문의 조건으로 분기
			}			
			System.out.print("온도를 입력하세요>>");
			//입력
			t=sc.nextDouble();
			//처리	
			if(menu==1) {//화씨온도->섭씨
				double temp=(t-32)*5/9;
				System.out.println("화씨온도 : "+t+"는 섭씨온도 "+temp);
				break;//반복문 탈출
			}else{
				double temp=9/5.0*t+32;
				System.out.println("섭씨온도 : "+t+"는 화씨온도 "+temp);
				break;
			}
		}//while
		sc.close();
	}//main

}//end class

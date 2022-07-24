package ezen;

import java.util.Scanner;

public class FtoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수선언 실수형
		int menu;//메뉴
		double t;//온도저장할 변수
		//Scanner 클래스 입력 Scanner 객체 생성
		Scanner sc=new Scanner(System.in);
		//메시지출력
		System.out.println("-------------------");
		System.out.println(" 1. 화씨온도->섭씨온도");
		System.out.println(" 2. 섭씨온도->화씨온도");
		System.out.println("-------------------");
		System.out.print("변환 방식 선택(1,2) >>");
		menu=sc.nextInt();
		System.out.print("온도를 입력하세요>>");
		//입력
		t=sc.nextDouble();
		//처리
		String result=menu==1?"화씨온도 : "+t+"는 섭씨온도 "+((t-32)*5/9)
				:"섭씨온도 : "+t+"는 화씨온도 "+((double)9/5*t+32);
		System.out.println(result);
		//System.out.println("화씨온도 : "+t+"는 섭씨온도 "+((t-32)*5/9));
		//System.out.println("섭씨온도 : "+t+"는 화씨온도 "+(9/5*t+32));		
		sc.close();
	}

}

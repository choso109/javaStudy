package ezen;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수 선언
		double h,w,bmi;
		Scanner sc=new Scanner(System.in);
		//메시지출력
		System.out.print("키(cm)와 몸무게(kg)를 입력하세요 >>");
		//데이터 입력
		h=sc.nextDouble();w=sc.nextDouble();
		//처리 -신체비만지수 구하기 -출력
		bmi=w/Math.pow(h/100,2);
		System.out.println("bmi="+bmi);
		if(bmi<18.5)System.out.println("저 체중입니다.");
		else if(bmi<23)System.out.println("정상체중입니다.");
		else if(bmi<25)System.out.println("비만 전 단계 입니다.");
		else if(bmi<30)System.out.println("비만1단계 입니다.");
		else if(bmi<40)System.out.println("비만2단계 입니다.");
		else System.out.println("비만3단계 입니다.");
		//
		if(bmi>=40) System.out.println("비만3단계 입니다.");
		else if(bmi>=30)System.out.println("비만2단계 입니다.");
		else if(bmi>=25)System.out.println("비만1단계 입니다.");
		else if(bmi>=23)System.out.println("비만전 단계 입니다.");
		else if(bmi>=18.5)System.out.println("정상체중입니다.");
		else System.out.println("저 체중입니다.");
		
		sc.close();
	}

}

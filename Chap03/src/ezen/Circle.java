package ezen;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner 클래스 입력 Scanner 객체 생성
		Scanner sc=new Scanner(System.in);
		//변수선언
		int radius;
		double circum, area;
		//메시지출력
		System.out.print("원의 반지름 입력(자연수)>>");
		//입력
		radius=sc.nextInt();
		//처리:계산, 출력....
		// java.lang.Math 클래스 안에 정의되어 있다 상수값 저장 PI
		circum=2*radius*Math.PI;
		//area = Math.PI * radius*radius;
		area = Math.PI * Math.pow(radius, 2);
		System.out.println("반지름 "+ radius + "인 원의 둘레는 "+circum
				+ "이고 면적은 "+area);
	}

}

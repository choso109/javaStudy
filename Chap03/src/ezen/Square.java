package ezen;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner 클래스 입력 Scanner 객체 생성
		Scanner sc=new Scanner(System.in);

		//변수선언
		int w,h;
		//메시지출력
		System.out.print("가로,세로값 입력>>");
		w=sc.nextInt();//입력
		h=sc.nextInt();		
		//처리(계산,출력...
		System.out.println("가로 세로("+w+","+h+") 면적:"+(w*h)+", 둘레:"+(2*w+2*h));
		sc.close();
	}

}

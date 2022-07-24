package ezen;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//변수 선언
		double w,h,c;//w 밑변,h:높이, c:둘레
		//메시지출력
		System.out.print("직각삼각형의 밑변과 높이 입력하세요>>");
		//입력
		w=sc.nextDouble();
		h=sc.nextDouble();
		//처리
//		c=w+h+Math.sqrt(w*w+h*h);
		c=w+h+Math.sqrt(Math.pow(w,2)+Math.pow(h, 2));
		System.out.println("밑변("+w+"),높이("+h+")의 면적은 "+w*h/2
				+", 둘레는 "+c);
		sc.close();
		
	}

}

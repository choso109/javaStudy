package ezen;

import java.util.Random;
import java.util.Scanner;

public class LottoDoWhile2 {

	public static void main(String[] args) {
		//변수 선언
		int n1,n2,n3,n4,n5,n6;
		// 난수 만들기 java.utill Random 클래스
		// Random 클래스 : nextInt(int bound) 사용
		// public int nextInt(int bound) : static x : 객체. 메소드명
		//=> Random 클래스 객체를 생성
		// Random 클래스 객체 변수 선언
		Random ra;
		// Random 클래스 객체 생성 new 생성자();
		ra=new Random();
		// public static double random() : Math 클래스 Math.random()
		// 변수 선언
		int money,cnt = 0;//하나는 금액 변수, 하나는 게임수
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.print("금액 입력 >>");//메시지 출력
		money=sc.nextInt();//입력
		if(money<1000) {
			System.out.println("금액 오류 : 금액은 1000원 이상!");
			continue;//반복문의 조건이 있는 곳으로 분기
		}
		System.out.print("게임수 입력 >>");
		if(cnt<1 || money <cnt*1000) {
			System.out.println("금액오류 : 게임수나 금액에 오류가 있습니다.");
			continue;
}
		
		sc.close();
		 for(int i = 1;i<=cnt;i++){
			n1=ra.nextInt(45)+1;
			do {
				n2=ra.nextInt(45)+1;
			}while(n1==n2);
			do {
				n3=ra.nextInt(45)+1;
			}while(n3==n1 || n3==n2);
			do {	
				n4=ra.nextInt(45)+1;
			}while(n4==n1 || n4==n2 || n4==n3);
			do {
				n5=ra.nextInt(45)+1;
			}while(n5==n1 || n5==n2 || n5==n3 ||n5==n4);
			do {
				n6=ra.nextInt(45)+1;
			}while(n6==n1 || n6==n2 || n6==n3 ||n6==n4 || n6==n5);
				System.out.printf("로또 번호%3d : %2d,%2d,%2d,%2d,%2d,%2d\n",i,n1,n2,n3,n4,n5,n6);
				
		}//end for
		 System.out.println("잔액 : "+(money-cnt*1000)+"원");
		 	
	}

}
}
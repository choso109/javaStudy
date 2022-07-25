package ezen;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class LottoBubbleSort {

	public static void main(String[] args) {
		// 변수선언
		//int n[0],n[1],n[2],n[3],n[4],n[5];
		int[]n=new int[6];
		// 난수만들기 java.util Random 클래스
		// Random 클래스 : nextInt​(int bound) 사용
		// public int nextInt​(int bound) : static x : 객체.메소드명 
		//=> Random 클래스 객체를 생성
		// Random 클래스 객체변수 선언
		Random ra;
		//Random 클래스 객체 생성 : new 생성자();
		ra=new Random();
		// public static double random() : Math 클래스 Math.random()
		// 변수선언
		int money,cnt;//금액,게임수
		Scanner sc=new Scanner(System.in);	
		while(true) {
			try {
				System.out.print("금액입력>>");//메시지출력	
				money=sc.nextInt();//입력 
				if(money<1000) {
					System.out.println("금액오류 :금액은 1000원 이상!");
					continue;//반복문의 조건이 있은 곳으로 분기
				}
				System.out.print("게임수 입력>>");//메시지출력		
				cnt=sc.nextInt();//입력 
				if(cnt<1 || money<cnt*1000) {
					System.out.println("금액오류 :게임수나 금액에 오류가 있습니다.");
					continue;//반복문의 조건이 있은 곳으로 분기
				}
				break;//반복문 탈출
			}catch(InputMismatchException e) {
				System.out.println("게임수나 금액에 오류가 있습니다.(정수값이 아님)");
				sc.nextLine();//버퍼 클리어
				continue;//계속
			}
			
		}
		
		sc.close();
		for(int i=1;i<=cnt;i++) {
			n[0]=ra.nextInt(45)+1;
			do {
				n[1]=ra.nextInt(45)+1;
			}while(n[0]==n[1]);			
			do{
				n[2]=ra.nextInt(45)+1;		
			}while(n[2]==n[0] || n[2]==n[1]);
			do {
				n[3]=ra.nextInt(45)+1;
			}while(n[3]==n[0] || n[3]==n[1]|| n[3]==n[2]);
			do {
				n[4]=ra.nextInt(45)+1;
			}while(n[4]==n[0] || n[4]==n[1]|| n[4]==n[2]||n[4]==n[3]);
			do {
				n[5]=ra.nextInt(45)+1;
			}while(n[5]==n[0] || n[5]==n[1]|| n[5]==n[2]||n[5]==n[3]||n[5]==n[4]);
			//System.out.printf("로또 번호%3d : %2d,%2d,%2d,%2d,%2d,%2d\n"
			//		,i,n[0],n[1],n[2],n[3],n[4],n[5]);		
			arrayPrint("로또 번호"+i,n);
			
		}//end for
		System.out.println("잔액 : "+(money-cnt*1000)+"원");
	}//main
	//버블정렬 메소드로
	//매개변수 파라메타 아규먼트 : 배열 주소만 넘어오면 오름차순
	//매개변수 파라메타 아규먼트 : 배열주소, boolean 넘오오면 /내림차순
	static void arrayPrint(String tittle, int []a) {
		System.out.print(tittle+":");
		for(int i=0;i<a.length;i++)
			if(i==a.length-1)
				System.out.printf("%2d\n",a[i]);
			else 
				System.out.printf("%2d,",a[i]);
	}
}

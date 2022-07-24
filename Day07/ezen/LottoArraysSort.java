package ezen;

import java.util.Arrays;
import java.util.Random;

public class LottoArraysSort {

	public static void main(String[] args) {
		// 변수선언
		int n1=0,n2=0,n3=0,n4=0,n5=0,n6=0;
		// 난수만들기 java.util Random 클래스
		// Random 클래스 : nextInt​(int bound) 사용
		// public int nextInt​(int bound) : static x : 객체.메소드명 
		//=> Random 클래스 객체를 생성
		// Random 클래스 객체변수 선언
		Random ra;
		//Random 클래스 객체 생성 : new 생성자();
		ra=new Random();
		// public static double random() : Math 클래스 Math.random()
		for(int i=1;i<=100;i++) {
			n1=ra.nextInt(45)+1;
			do {
				n2=ra.nextInt(45)+1;
			}while(n1==n2);			
			do{
				n3=ra.nextInt(45)+1;		
			}while(n3==n1 || n3==n2);
			do {
				n4=ra.nextInt(45)+1;
			}while(n4==n1 || n4==n2|| n4==n3);
			do {
				n5=ra.nextInt(45)+1;
			}while(n5==n1 || n5==n2|| n5==n3||n5==n4);
			do {
				n6=ra.nextInt(45)+1;
			}while(n6==n1 || n6==n2|| n6==n3||n6==n4||n6==n5);
			System.out.printf("이번주 로또 : %2d,%2d,%2d,%2d,%2d,%2d\n"
					,n1,n2,n3,n4,n5,n6);
			
		}//end for
		//정렬
		int []a= {n1,n2,n3,n4,n5,n6};
		Arrays.sort(a);//오름차순 정렬
		for(int i:a)
			System.out.print(i+",");
	}

}

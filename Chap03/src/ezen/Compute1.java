package ezen;

import java.util.Scanner;

public class Compute1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;//정수형 변수 선언
		Scanner sc=new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		a=sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		b=sc.nextInt();
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		try {//try 블럭 ; 에러유발문장
			System.out.println("a/b="+(a/b));//에러유발문장
			System.out.println("a%b="+(a%b));//에러유발문장
		}catch(ArithmeticException e) {//캐치블럭:에러발생시 할일
			System.out.println("0으로 나눌 수 없습니다(infinity)");
			System.out.println("0으로 나머지를 구할 수 없습니다(NaN)");
		}		
		sc.close();
	}

}

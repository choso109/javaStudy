package ezen;

import java.util.Scanner;

public class Compute {

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
		String result= b==0?"0으로 나눌 수 없습니다(infinity)"
				:"a/b="+(a/b);
		System.out.println(result);
		result= b==0?"0으로 나머지 구할 수 없습니다(NaN)"
				:"a%b="+(a%b);
		System.out.println(result);
		
		sc.close();
	}

}

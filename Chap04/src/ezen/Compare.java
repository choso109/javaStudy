package ezen;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수선언: 정수 2개(a,b), Scanner 객체 생성(sc)
		int a,b;
		Scanner sc=new Scanner(System.in);
		//입력메시지 출력 : 두개의 정수를 입력하세요 >>
		//sc 통해서 입력:첫번째a저장,두번째 b저장 sc.nextInt 2번
		System.out.print("두개의 정수를 입력하세요>>");
		a=sc.nextInt();b=sc.nextInt();
		//다중 if문 사용해서 처리 ->출력
		if(a>b)
			System.out.println("입력값1("+a+")은 입력값2("+b+") 보다 큽니다.");
		else if(a<b)
			System.out.println("입력값1("+a+")은 입력값2("+b+") 보다 작습니다.");
		else System.out.println("입력값1("+a+")은 입력값2("+b+") 은 동일합니다.");
		
		// a 값 양수 음수 0 
		if(a>0)System.out.println(a+"는 양수");
		else if(a<0)System.out.println(a+"는 음수");
		else System.out.println("0");
		sc.close();
	}

}

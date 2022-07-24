package ezen;

import java.util.Scanner;

public class CurrencyCount1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수선언
		int money;
		Scanner sc=new Scanner(System.in);
		System.out.print("금액을 입력하세요>>");
		money=sc.nextInt();//입력
		System.out.println("50000원 : "+money/50000);//몫
		money%=50000;//money=money%50000;//나머지 구하기
		System.out.println("10000원 : "+money/10000);
		money%=10000;//money=money%50000;
		System.out.println("5000원 : "+money/5000);
		money%=5000;//money=money%50000;
		System.out.println("1000원 : "+money/1000);
		money%=1000;//money=money%50000;
		System.out.println("500원 : "+money/500);
		money%=500;//money=money%50000;
		System.out.println("100원 : "+money/100);
		money%=100;//money=money%50000;
		System.out.println("50원 : "+money/50);
		money%=50;//money=money%50000;
		System.out.println("10원 : "+money/10);
		money%=10;//money=money%50000;
		System.out.println("50원 : "+money/50);
		money%=50;//money=money%50000;
		System.out.println("1원 : "+money);
		
				
		/*int a=money/50000;
		money=money-a*50000;*/
		sc.close();
	}

}

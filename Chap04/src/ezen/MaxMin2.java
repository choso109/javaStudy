package ezen;

import java.util.Scanner;

public class MaxMin2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,c,max,min;
		System.out.print("세개의 정수를 입력하세요>>");
		a=sc.nextInt();b=sc.nextInt();c=sc.nextInt();
		System.out.println("-----삼항연산자 사용--------");
		max=(a>b)?((a>c)?a:c):((b>c)?b:c);
		min=(a<b)?((a<c)?a:c):((b<c)?b:c);
		System.out.println("최대값 : "+max+", "+"최소값 : "+ min );
		max=(a>b && a>c)?a:(b>c?b:c);
		min=(a<b && a<c)?a:(b<c?b:c);
		System.out.println("최대값 : "+max+", "+"최소값 : "+ min );
		sc.close();
	}
}

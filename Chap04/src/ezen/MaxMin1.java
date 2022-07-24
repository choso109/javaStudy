package ezen;

import java.util.Scanner;

public class MaxMin1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수선언
		Scanner sc=new Scanner(System.in);
		int a,b,c,max,min;
		//메시지출력
		System.out.print("세개의 정수를 입력하세요>>");
		//입력
		a=sc.nextInt();b=sc.nextInt();c=sc.nextInt();
		//중첩if 작게 : 2번 최대 : 2번, 대입 1번
		if(a>b) {
			if(a>c)max=a;else max=c;			
		}else {
			if(b>c)max=b;else max=c;
		}
		if(a<b) {
			if(a<c)min=a;else min=c;			
		}else {
			if(b<c)min=b;else min=c;
		}	
		System.out.println("최대값 : "+max+", "+"최소값 : "+ min );
		System.out.println("---------------");
		//작게 : 2번q 최대 : 2번 비교, 대입 최소 1번, 최대 3번
		max=a;
		if(b>max)max=b;
		if(c>max)max=c;
		min=a;
		if(b<min)max=b;
		if(c<min)max=c;
		System.out.println("최대값 : "+max+", "+"최소값 : "+ min );
		System.out.println("---------------");
		//최소 : 4번 최대 : 4번 , 대입1번
		if(a>b && a>c)max=a;
		if(a<b && b>c)max=b;
		if(b<c && a<c)max=c;
		System.out.println("최대값 : "+max+", "+"최소값 : "+ min );
		System.out.println("---------------");
		//다중 if 최소 : 2번 최대 : 4번
		if(a>b && a>c)max=a;
		else if(b>a&&b>c)max=b;
		else max=c;
		System.out.println("최대값 : "+max+", "+"최소값 : "+ min );

		sc.close();
	}
}

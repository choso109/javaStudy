package ezen;

import java.util.Scanner;

public class OddSumDowhile1toN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//변수선언
		int n,sum=0,i=1;
		do {
			System.out.print("1~N까지 홀수합을 구할 N값 입력>>");//메시지출력
			n=sc.nextInt();//입력받고
			if(n<1) {
				//오류메시지출력,계속
				System.out.println("오류");
				//n=10;
				continue;
			}
			do {
				sum+=i;
				//증감식
				i+=2;//i=i+2;
			}while(i<=n);
			break;
		}while(true);//(i<=n);
		System.out.println("1~"+n+"까지 홀수합="+sum);
		sc.close();

	}

}

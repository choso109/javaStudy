package ezen;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		//변수 선언
		Scanner sc=new Scanner(System.in);
		int s=0;//점수 입력
		int p;
		int f[]=new int[10];//f[0] ~ f[9] : 초기치 0부여
		do {
			System.out.print("점수(0~100)>>");
			try {
				s=sc.nextInt();
			}catch(Exception e) {
				System.out.println("입력오류!");
				sc.nextLine();
				continue;
			}
		
			if(s==-1)break;
			if(s<0||s>100) {
				System.out.println("입력오류!");
				continue;
							}
			//index : 배열의 위치 구하기
			p=s/10;//몫이 들어간다
			if(p==10)p=9;
			f[p]++;
		}while(true);
		sc.close();
		for(int i=0;i<10;i++)
			if(i==9)
				System.out.println((i*10)+"~"+(i*10+10)+" : "+f[i]);
			else
				System.out.println((i*10)+"~"+(i*10+9)+" : "+f[i]);
	}

}

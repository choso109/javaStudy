package ezen;

import java.util.Scanner;

public class MaxMin3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double a,b,c;
		System.out.print("세개의 실수를 입력하세요>>");
		a=sc.nextDouble();b=sc.nextDouble();c=sc.nextDouble();
		System.out.println("-----메소드 사용--------");
		//System.out.println(a+","+b+","+c);
		//메소드 호출 데이터를 보내는 방법 : call by value(값을 전달)
		System.out.println("최대값 : "+max(a,b,c)
		+", "+"최소값 : "+ min(a,b,c) );	
		sc.close();
	}
	//최대값 구하는 method이름 max, 넘겨받은데이터 3개수(파라메타,아규먼트) 반환값 1개
	public static double max(double a,double b,double c) {
		double m=(a>b)?((a>c)?a:c):((b>c)?b:c);
		return m;
	}
	//최대값 구하는 method이름 min, 넘겨받은데이터 3개수(파라메타,아규먼트) 반환값 1개
	public static double min(double a,double b,double c) {
		double m=(a<b)?((a<c)?a:c):((b<c)?b:c);
		return m;
	}
}

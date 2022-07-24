package book;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sc Scanner클래스의 변수, 참조변수, 객체(Object)
		// new 키워드를 사용해서 객체를 생성한다.
		//Scanner(System.in) : 생성자 호출
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.print("정수 a값 입력>> ");
		a=sc.nextInt();//sc객체를 통해서 키보드로부터 정수값을 읽어서 a 저장
		System.out.print("정수 b값 입력>> ");
		b=sc.nextInt();
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		double result=(b!=0)?(double)a/b:0;		
		System.out.println("a/b="+result);
		int r=(b!=0)?a%b:0;
		System.out.println("a%b="+r);
	}

}

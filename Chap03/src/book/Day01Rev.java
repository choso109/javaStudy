package book;

import java.util.Scanner;

public class Day01Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수-데이터(리터럴) 저장위한 기억장소 이름
		//변수를 선언한 후 사용 가능
		//변수의 타입 : 기본형, 참조형
		/*기본형 : 정수(-100,25):byte,short,int,long 
		 *  문자('A' '한'):char-정수, 논리
		 *  실수(20.25,0.25*e13,):float,double
		 *  논리(true,false):boolean
		 */
		//기본형 변수 선언
		int num;
		//num=num+50;//error :초기화하지 않은 변수 사용 불가
		num=100;//초기화 100:리터럴
		num=num+50;
		System.out.println("num 값은 ="+num);
		double a,b=1.5,c=33.233434123,d;char ch='A';
		boolean married=true;
		//참조형변수 : 객체, 클래스변수
		String name="이수경";
		System.out.println(name.charAt(1));
		//객체지향언어 클래스내부의 함수=메소드method
		//형변환 기본형->기본형, 참조형->참조형:자동형변환,캐스팅(강제형변환)
		a=b+num;//실수+(정수->실수:자동형변환)
		System.out.println(a);
		num=(int)a;//(int)캐스트연산자
		// 정수와 정수의 연산->정수 
		System.out.println("5/2="+5/2);
		System.out.println("5/2="+(double)5/2);
		// String->int : 참조형->기본형:메소드 필요
		String no="12345";
		num=num+Integer.parseInt(no);//num+=no;
		//메소드를 사용하려면 클래스이름.메소드명 또는 객체명.메소드명
		//name.charAt(1),
		//static 메소드는 클래스이름으로사용가능Integer.parseInt(no)
		//키보드로 부터 입력 받기 - Scanner클래스 java.util패키지
		//모니터 출력 : 표준출력, 키보드로 부터 입력:표준입력
		//스캐너 객체 생성
		Scanner sc;//객체변수 선언
		//개체생성->생성자 호출
		//Scanner(System.in) : 생성자 메소드
		sc=new Scanner(System.in);
		System.out.print("정수 입력>>");
		num=sc.nextInt();
		System.out.println("입력값:"+num);
		//짝홀 판단 : 삼항연산자
		//num%2==0 :짝수니? num%2==1 :홀수니?
		String result=num%2==0?"짝수":"홀수";
		System.out.println(num+"는 "+result);
		sc.close();
		//산술->관계(비교)->논리->대입
		//관계연산자 : > < >= <= == !=
	}

}

package ezen.circle1;
//public class :일반적인 클래스 ->생성가능
public class Circle {
	//클래스의 구성요소 : 필드(클래스 변수,속성), 생성자, 메소드	
	//접근 지정자 : public(언제,어디서나 import 만하면 사용가능), 생략, protected, private
	//1. 필드(속성):데이터 저장 : 초기화하지 않아도 된다.
	public double r;
	String name;
	//2. 생성자 : 반환값이x, 이름이 클래스이름- 메소드 비슷
	//생성자 생략-> 컴파일시 디폴트생성자 추가 해 준다
	//매개변수 있는 생성자 1개 이상있으면 디폴트 생성자는 추가해주지 않는다.
	//매개변수 있는 생성자 1개 이상있을때 일반적으로 디폴트 생성자는 추가 해 준다
	// 생성자 overloading(중복) 중복시 매개변수 개수나 타입이 달라야 한다
	public Circle(){//디폴트 생성자
		//필드 초기화 한다.
		r=5;name="도넛";
	}
	public Circle(String name) {//this키워드 내객체
		this.name=name;
	}
	public Circle(double radius) {
		r=radius;
	}
	public Circle(String name,double r) {//this키워드 내객체
		this.name=name;this.r=r;
	}
	public Circle(double r,String irum) {//this키워드 내객체
		name=irum;//매개변수의 변수명이 다를 경우는 this생략가능
		this.r=r;
	}	//3. 메소드
	public double getArea() {
		return Math.PI*r*r;//원면적의 구해서 반환		
	}
	public double getCircum() {//원 둘레 계산
		return 2*Math.PI*r;
	}
	public void printCircle() {
		System.out.println("원이름 : "+name);
		System.out.println("반지름 : "+r);
		System.out.println("원둘레 : "+getCircum());
		System.out.println("원면적 : "+getArea());
		
	}
}

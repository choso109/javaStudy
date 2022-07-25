package ezen.circle3;
//클래스의 접근지정자 생략 : 이 클래스는 동일한 폴더(패키지)에서만 사용 가능하다.
class Circle {
	//필드 : private(은닉):캡슐화
		// private 선언된 필드 : 내클래스 내부에서만 접근 가능
		private double r;
		private String name;
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
		}	
		//3. 메소드
		//setter,getter 메소드(private 정의 된 필드 값 설정, 값 받환)
		public double getR() {
			return r;
		}
		public void setR(double r) {
			this.r = r;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
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

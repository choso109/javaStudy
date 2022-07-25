package ezen.circle1;

public class CircleMain {

	public static void main(String[] args) {
		//Circle 클래스의 객체 선언
		Circle c1;
		c1=new Circle();//디폴트생성자
		c1.printCircle();
		//외부클래스 내 멤버변수값을 설정 x
		c1.r=10;//반지름 설정
		c1.name="동전";
		c1.printCircle();
		System.out.println("-------------------");
		Circle c2=new Circle("훌라후프");
		c2.printCircle();
		System.out.println("-------------------");
		c1=new Circle(50,"지구본");
		c2.r=22;
		c1.printCircle();
	}

}

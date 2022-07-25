package ezen.circle2;

public class CircleMain {

	public static void main(String[] args) {
		Circle c1;
		c1=new Circle();//Circle() 생성자호출
		c1.printCircle();
		//c1.r=20.5;x r private 직접 접근 불가
		c1.setR(20.5);//set 메소드로 값을 설정
		System.out.println(c1.getName());//get 메소드로 값을 가져올수 있다.
		
	}

}

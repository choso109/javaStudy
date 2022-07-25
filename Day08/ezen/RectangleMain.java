package ezen;

public class RectangleMain {

	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		//r1.printRectangle();
		r1.setWidth(20.5);
		r1.setHeight(33.8);
		r1.setName("이것이자바다");
		r1.printRectangle();
		System.out.println("--------------------");
		Rectangle r2=new Rectangle("책상",1500,1000);
		r2.printRectangle();
		System.out.println("--------------------");
		r2.setHeight(1500);
		r2.printRectangle();
		if(r1.isSquare())
			System.out.println("정사각형");
		else System.out.println("정사각형 x");
	}

}

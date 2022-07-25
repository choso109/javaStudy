package ezen;

public class Rectangle {
	//필드
	private double width,height;
	private String name;
	//생성자 - 중복 필요 : 사용자의 다양한 생성 요구 만족
	public Rectangle() {}
	public Rectangle(double wh) {width=wh;height=wh;}
	public Rectangle(double w,double h) {width=w;height=h;}
//	public Rectangle(double h,double w) {width=w;height=h;}
	public Rectangle(String name,double wh) {
		width=wh;height=wh;this.name=name;
	}
	public Rectangle(String name,double w,double h) {
		width=w;height=h;this.name=name;
	}	//메소드	
	// setter,getter메소드
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// setter,getter메소드 끝----------
	public double getArea() {
		return width*height;
	}
	public double getCircum() {
		return 2*(width+height);
	}
	public boolean isSquare() {
		if(width==height)
			return true;
		else return false;
	}
	public void printRectangle(){
		System.out.println("사각형의 이름:"+name);
		System.out.println("사각형의 너비:"+width);
		System.out.println("사각형의 높이:"+height);
		System.out.println("사각형의 면적:"+getArea());
		System.out.println("사각형의 둘레:"+getCircum());
		if(isSquare())System.out.println("정사각형입니다.");
		else System.out.println("정사각형이 아닙니다.");
	}
}

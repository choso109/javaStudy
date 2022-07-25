package book;

public class EnumEx {

	public static void main(String[] args) {
		//Week 사용 -참조형
		Week w;//enum 참조형 변수 선언
		w=Week.SUNDAY;
		System.out.println(w.SUNDAY);
		System.out.println(w.SATRUDAY);
		System.out.println(w.name());
		System.out.println(w.ordinal());
	}

}

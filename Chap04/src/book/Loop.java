package book;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {//초기식;조건식;증감식
			System.out.println("안녕"+i);
		}
		int i=0;//초기식
		while(i<10) {
			i++;//증감식
			System.out.println("안녕"+i);
		}
		System.out.println("---------------");
		i=1;//초기식
		while(i<=10) {
			System.out.println("안녕"+i);
			i++;//증감식
		}
		System.out.println("---------------");
		i=11;//초기식
		while(i<=10) {
			System.out.println("while i=11 안녕"+i);
			i++;//증감식
		}
		System.out.println("---------------");
		i=1;
		do {
			System.out.println("do while i=11 안녕"+i);
			i++;//증감식
		}while(i<=10);
	}

}

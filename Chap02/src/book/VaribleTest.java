package book;

public class VaribleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// = 대입연산자
		// + 산술연산자,문자열연결연산자
		int age;//정수형 변수 선언 int 4byte
		age=33;
		double eye1=1.5;//실수형 변수 선언+초기치 부여
		double eye2;//선언만
		int a,b,c;//정수형 변수 3개 선언
		eye2=1.2;//변수를 사용하려면 초기화 해 준다.
		System.out.println("나이는 "+age);
		System.out.println("eye2 "+eye2);
		System.out.println("양쪽시력의 \t \'합은 \n"+(eye2+eye1));
		// 변수의 사용 범위
		int var1=10;//main메서드 지역변수 : main 메소드가 종료될때 까지 생존
		{
			//var2 는 싸고있는 블럭 지역변수:블럭탈출하면 사라진다
			int var2=var1+55;
			System.out.println("var2="+var2);
		}
		//var1+=var2;//+=
		var1+=100;//var1=var1+100;
		char ch;
		ch=65;//A의 아스키코드 값 65(십진수)
		System.out.println("ch="+ch);
		ch='한';
		System.out.println("ch="+ch);
		// 기본형 데이터 타입 정수형(int,char(문자)..), 실수형(float, double)
		// 논리형(boolean:true,false)
		boolean bb=true;
		System.out.println("bb="+bb);
		// 참조형 데이터 타입 : String
		// String 클래스명(java.base모듈->java.lang패키지안에
		String name="이수경";//클래스변수,객체:클래스를 이용해서 생성한 변수
		System.out.println("이름은 = "+name);
		System.out.println("성은 = "+name.charAt(0));
		//자동형변환
		int intValue=10;
		double doubleValue=5.5;
		double result=intValue+doubleValue;
		System.out.println("result="+result);
		//강제 형변환 :cast 연산자, (데이터타입)
		result=intValue+(int)doubleValue;
		System.out.println("result="+result);
		// 기본형->기본형, 참조형->참조형 : 자동형변환 또는 cast연산자
		// 기본형 -> 참조형, 참조형->기본형:참조형의 메서드 사용
		String width="12345";
		//"12345"->12345(String참조형->int 기본형) 메서드사용
		//result=width+100;
		result=Integer.parseInt(width)+100;
		System.out.println("result="+result);
		width="12345.6789102323";
		//String->double:메서드 사용 형변환
		System.out.println("result="+(result+Double.parseDouble(width)));
		int max=Integer.MAX_VALUE;
		System.out.println(max);
	}//end main

}//end class

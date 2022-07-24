package book;
//90페이지
public class StringEqualsExample {
	public static void main(String[] args) {
		//객체 strVar1,strVar2,strVar3
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		//new 생성하면 객체가 별도의 메모리에 할당
		String strVar3 = new String("신민철");
		String strVar4 = "신민철1";

		System.out.println( strVar1 == strVar2);//주소비교
		System.out.println( strVar1 == strVar4);//주소비교
		System.out.println( strVar1 == strVar3);//주소비교
		System.out.println();
		System.out.println( strVar1.equals(strVar2));
		System.out.println( strVar1.equals("신민철"));
		System.out.println( strVar1.equals(strVar3));
	}
}

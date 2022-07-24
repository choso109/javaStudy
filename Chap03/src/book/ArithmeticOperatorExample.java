package book;
public class ArithmeticOperatorExample {
	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 0;		
		int result1 = v1 + v2;
		System.out.println("result1=" + result1);
		
		int result2 = v1 - v2;
		System.out.println("result2=" + result2);
		
		int result3 = v1 * v2;
		System.out.println("result3=" + result3);
		try {
			int result4 = v1 / v2;//몫 정수 정수 연산->정수
			System.out.println("result4=" + result4);
			
			int result5 = v1 % v2;//나머지
			System.out.println("result5=" + result5);
			
			double result6 = (double) v1 / v2;//결과값 소수점이하가 있는
			System.out.println("result6=" + result6);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없어요!!");
			e.printStackTrace();
		}
			
	}
}

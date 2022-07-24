package book;

public class OperationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//산술연산자 + - */ %(나머지)
		int a=20,b=3;
		// 정수와 정수 -> 정수
		// 정수와 실수 -> 실수, 실수와 실수->실수
		//syso(컨트롤+스패이스바)
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("axb="+(a*b));
		System.out.println("a/b="+(a/b));
		//a를 실수로 캐스팅 
		//b는 실수로 자동형변환 실수와 실수->실수
		System.out.println("a/b="+((double)a/b));
		System.out.println("a%b="+(a%b));
		a++;//단항연산자 a값을 1증가 a=a+1;
		System.out.println("a="+a);
		System.out.println("a++"+(a++));//후위연산
		System.out.println("++a"+(++a));//전위연산
		//비교(관계)연산자 == != > < >= <=
		System.out.println(3>5);
		System.out.println(3<5);
		//&& :논리 and, 참,참->참
		System.out.println(3>5 && 3<5);
		//|| :논리 or, 둘중 하나이상만 참이면 참
		System.out.println(3>5 || 3<5);
		System.out.println(3!=3);
		//삼항연산자
		int score=82;
		char grade=score>90?'A':'B';
		System.out.println("grade="+grade);
		// 자격증 시험 : 과목2개 평균이 70 이상이고, 과락 40점
		int score1=32,score2=80;
		String result=(score1+score2)/2>=70 
						&& score1>=40 &&score2>=40 
						?"합격":"불합격";
		System.out.println("result="+result);
		
	}

}

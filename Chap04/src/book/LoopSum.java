package book;

public class LoopSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~100 합 구하기
		int sum=0;
		/*sum=sum+1;
		sum=sum+2;
		sum=sum+3;
		:
		sum=sum+100;*/	
		//for
		for(int i=1;i<=100;i++) {
			sum=sum+i;//sum+=i;
			System.out.println("1~"+i+"까지의 합 = "+sum);
		}
		System.out.println("for 1~100까지 합="+sum);
		//1~100까지의 홀수의 합
		sum=0;
		for(int i=1;i<=100;i=i+2) {
			sum=sum+i;//sum+=i;
			System.out.println("1~"+i+"까지의 홀수합 = "+sum);
		}
		System.out.println("for 1~100까지 홀수합="+sum);
		//1~100까지의 짝수의 합
		sum=0;
		for(int i=2;i<=100;i=i+2) {
			sum=sum+i;//sum+=i;
			System.out.println("1~"+i+"까지의 짝수합 = "+sum);
		}
		System.out.println("for 1~100까지 짝수합="+sum);
		// 홀수의 합
		for(int i=1;i<=100;i++) {
			if(i%2==0)continue;//반복문의 조건으로 분기
			sum=sum+i;//sum+=i;
			System.out.println("1~"+i+"까지의 홀수합 = "+sum);
		}
		System.out.println("for 1~100까지 홀수합="+sum);
		//1~100 까지 합-while
		int i=1;sum=0;
		while(i<=100) {
			sum+=i;//sum=sum+i;
			System.out.println("while 1~"+i+"까지의 합 = "+sum);
			i++;//증감식
		}///endwhile
		i=1;sum=0;
		do{
			sum+=i;//sum=sum+i;
			System.out.println("do while 1~"+i+"까지의 합 = "+sum);
			i++;//증감식
		}while(i<=100);///endwhile
		
	}//end main

}//end class

package ezen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sum1toN {

	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);//변수선언
		int n=0,sum=0;
		while(true) {
			System.out.print("1~N 까지 합을 구할 N 값 입력>>");//메시지출력
			try {
				n=sc.nextInt();//입력받고
			}catch(InputMismatchException e) {
				//메시지출력,버퍼비우기,계속
				System.out.println("1이상의 정수를 입력하세오");
				sc.nextLine();
				continue;
			}			
			if(n<1) {//메시지출력,계속
				System.out.println("1이상의 정수를 입력하세오");
				continue;
			}
			//처리-출력 for
			for(int i=1;i<=n;i++)//초기식;조건식;증감식
				sum=sum+i;
			System.out.println("for:1~"+n+"까지 합="+sum);
			//while
			//초기식
			int i=1;sum=0;
			while(i<=n){
				sum=sum+i;
				i++;//증감치
			}
			System.out.println("while:1~"+n+"까지 합="+sum);
			//do ~ while 무조건 1번은 수행한다.
			i=1;sum=0;
			do {
				sum=sum+i;
				i++;//증감치
			}while(i<=n);
			System.out.println("do while:1~"+n+"까지 합="+sum);
			break;
		}//end while
		/*sum=sum+1;
		sum=sum+2;
		sum=sum+3;
		:
		sum=sum+n;*/
		sc.close();
	}

}

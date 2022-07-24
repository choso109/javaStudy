package ezen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Gugudan2 {

	public static void main(String[] args) {
		int dan=0;
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("출력하고자 하는 구구단의 단 입력(2~18) >>");
			try {
				dan=sc.nextInt();
			}catch(InputMismatchException e) {
				//오류메시지출력,버퍼클리어,계속
				System.out.println("입력 오류:단은 정수 입니다.");
				sc.nextLine();
				continue;
			}			
			if(dan<2 || dan>18) {//오류메시지출력,계속
				System.out.println("단 값 입력 오류!!");continue;
			}
			System.out.println("** "+dan+"단 **");
			for(int i=1;i<10;i++)
				//System.out.println(dan +" x "+i+" = "+dan*i);
				//%d decimal(10진수) %3d 3칸 잡아서 오른쪽 정렬 숫자표시
				System.out.printf("%d x %d = %3d \n", dan,i,dan*i);
			break;
		}//end while
		sc.close();
	}//main

}//class

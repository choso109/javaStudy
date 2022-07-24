package book;

public class Exercise06 {

	public static void main(String[] args) {
		System.out.println("*****");
		System.out.println("-------------");
		//* 개씩를 출력해서  ***** 출력되도록 
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println("\n-------------");
		//for 반복
		for(int i=1;i<=5;i++)
			System.out.print("*");
		System.out.println();//줄바꾸기		
		System.out.println("\n-별다섯개 5줄 출력------------");
		//다중 for 반복
		for(int j=1;j<=5;j++) {
			for(int i=1;i<=5;i++)
				System.out.print("*");
			System.out.println();//줄바꾸기
		}//end for
		System.out.println("\n-교과서 출력------------");
		//다중 for 반복
		for(int j=1;j<=5;j++) {//줄
			for(int i=1;i<=j;i++)//칸
				System.out.print("*");
			System.out.println();//줄바꾸기
		}//end for
	}//main

}//class

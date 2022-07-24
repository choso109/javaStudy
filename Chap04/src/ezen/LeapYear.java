package ezen;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수선언
		Scanner sc=new Scanner(System.in);
		int year;
		//메시지출력
		System.out.print("년도를 입력하세요>>");
		year=sc.nextInt();//입력
		if(year % 4==0 && year%100 != 0 || year%400==0)
			System.out.println(year+"년은 윤년");
		else System.out.println(year+"년은 평년");
		sc.close();

	}

}

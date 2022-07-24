package ezen;

import java.util.Scanner;

public class Zodiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수선언
		Scanner sc=new Scanner(System.in);
		int year;
		//메시지출력
		System.out.print("태어난 년도를 입력하세요>>");
		year=sc.nextInt();//입력
		int a=year%12;
		if(a==0) 
			System.out.println(year+"년생 당신은 원숭이띠 입니다.");
		else if(a==1)System.out.println(year+"년생 당신은 닭띠 입니다.");
		else if(a==2)System.out.println(year+"년생 당신은 개띠 입니다.");
		else if(a==3)System.out.println(year+"년생 당신은 돼지띠 입니다.");
		else if(a==4)System.out.println(year+"년생 당신은 쥐띠 입니다.");
		else if(a==5)System.out.println(year+"년생 당신은 소띠 입니다.");
		else if(a==6)System.out.println(year+"년생 당신은 호랑이띠 입니다.");
		else if(a==7)System.out.println(year+"년생 당신은 토끼띠 입니다.");
		else if(a==8)System.out.println(year+"년생 당신은 용띠 입니다.");
		else if(a==9)System.out.println(year+"년생 당신은 뱀띠 입니다.");
		else if(a==10)System.out.println(year+"년생 당신은 말띠 입니다.");
		else System.out.println(year+"년생 당신은 양띠 입니다.");
		//switch문으로 변환
		switch(year%12) {
		case 0:System.out.println(year+"년생 당신은 원숭이띠 입니다.");break;
		case 1:System.out.println(year+"년생 당신은 닭띠 입니다.");break;
		case 2:System.out.println(year+"년생 당신은 개띠 입니다.");break;
		case 3:System.out.println(year+"년생 당신은 돼지띠 입니다.");break;
		case 4:System.out.println(year+"년생 당신은 쥐띠 입니다.");break;
		case 5:System.out.println(year+"년생 당신은 소띠 입니다.");break;
		case 6:System.out.println(year+"년생 당신은 호랑이띠 입니다.");break;
		case 7:System.out.println(year+"년생 당신은 토끼띠 입니다.");break;
		case 8:System.out.println(year+"년생 당신은 용띠 입니다.");break;
		case 9:System.out.println(year+"년생 당신은 뱀띠 입니다.");break;
		case 10:System.out.println(year+"년생 당신은 말띠 입니다.");break;
		default:System.out.println(year+"년생 당신은 양띠 입니다.");break;
		}
	}

}

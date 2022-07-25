package ezen;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class CalendarMake2 {

	public static void main(String[] args) {
		//변수선언
		int y,m;
		Scanner sc=new Scanner(System.in);
		LocalDate local;//객체 참조변수 선언
		//메시지 출력 년도 월 입력
		System.out.print("년도 월 입력>>");		
		y=sc.nextInt();m=sc.nextInt();
		local=LocalDate.of(y, m, 1);//달력 객체 생성
		//마지막날짜
		//System.out.println(local.lengthOfMonth());
		int lastDate=local.lengthOfMonth();
		//1일의 요일
		DayOfWeek dw=local.getDayOfWeek();
		//Calendar 일 ~토
		//LocalDate 월~토 일 1,2,3,4,5,6,7
		System.out.println(dw.getValue());
		int startDay=dw.getValue();
		//\t 반복 6->6, 1(월요일)->1,2(화요일)->2, 
		//타이틀 출력
		System.out.println("\n\n\t\t** "+y+"년 "+m+"월  **");
		System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――");		
		System.out.println("일\t월\t화\t수\t목\t금\t토");		
		System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――");		
		//반복문 건너뛰기 startDay 7:0,1:1,2:2..6:6 텝키 반복
		for(int i=1;i<=startDay%7;i++)System.out.print("\t");
		int lineSkip=startDay;//%7;//탭키 반복회수(0~6)
		//1~마지막까지 반복문 
		for(int i=1;i<=lastDate;i++) {
			System.out.print(i+"\t");
			//lineSkip++;
			//줄바꿈처리  lineSkip 1증가->7로나눈나머지구하기->0비교
			if(++lineSkip%7==0)System.out.println();//줄바꾸기
		}
		if(lineSkip%7!=0)System.out.println("\n――――――――――――――――――――――――――――――――――――――――――――――――――――");
		else System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――");					
		sc.close();
		
	}

}

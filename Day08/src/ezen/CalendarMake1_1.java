package ezen;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarMake1_1 {

	public static void main(String[] args) {
		//변수선언
		int y,m;//년도,월(y,m)
		Scanner sc=new Scanner(System.in);//스캐너객체
		Calendar cal;	//칼랜더객체
		System.out.print("년도 월 입력>>");//메시지출력
		y=sc.nextInt();m=sc.nextInt();//입력		
		//처리-출력
		cal=Calendar.getInstance();//현재의 달력
		//입력된 값으로 달력 셋팅
		cal.set(y, m-1,1);//m-1 : Calendar 0~11
		//이달의 마지말 날짜 lastDate
		//Calendar.DATE getActualMaximum 날짜중 가장 큰값
		int lastDate=cal.getActualMaximum(Calendar.DATE);
		//시작요일 startDay
		int startDay=cal.get(Calendar.DAY_OF_WEEK);
		//타이틀 출력
		System.out.println("\n\n\t\t** "+y+"년 "+m+"월  **");
		System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――");		
		System.out.println("일\t월\t화\t수\t목\t금\t토");		
		System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――");		
		//반복문 건너뛰기 startDay 7-> 6번반복, 6->5반복 : 텝키 반복
		for(int i=1;i<startDay;i++)System.out.print("\t");
		int lineSkip=startDay-1;//탭키 반복회수(0~6)
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

package ezen;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMake1 {

	public static void main(String[] args) {
		Calendar cal;//Calendar 객체 cal 선언
		//cal= new Calendar();//상속받아야만 생성할수 있다. protected	
		//Calendar 추상(abstract) 클래스 -> 객체 생성 불가
		// 1. Calendar 메소드중에서 Calendar 반환하면서 static 메소드 찾는다.
		cal=Calendar.getInstance();//현재시간,날짜로 달력 생성
		System.out.println("Calendar.YEAR년도는="+cal.get(Calendar.YEAR));
		System.out.println("Calendar.HOUR시는="+cal.get(Calendar.HOUR));
		System.out.println("Calendar.MONTH시는="+cal.get(Calendar.MONTH));
		//Calendar 월 0~11 : 0 -> 1월
		cal.set(Calendar.MONTH, 0);//1월로 설정
		System.out.println("Calendar.MONTH시는="+cal.get(Calendar.MONTH));
		int y,m,d;//년도,월,날짜 저장
		m=cal.get(Calendar.MONTH);//0
		if(m==Calendar.JANUARY)
			System.out.println("1월");
		else System.out.println("1월 x");
		System.out.println("Calendar.DATE는="+cal.get(Calendar.DATE));
		//2022.1.1설정
		cal.set(2022, 1, 1);
		System.out.println("이달의 마지막날은="+cal.getActualMaximum(Calendar.DATE));
		System.out.println("해당주에서 몇번째 날짜인지 ="+cal.get(Calendar.DAY_OF_WEEK));
		//달력 출력 
		// 1일의 요일
		// 그달의 마지막날짜 
		//System.out.println("cal.HOUR시는="+cal.get(cal.HOUR));
		//2. Calendar 상속받는 클래스로 객체를 생성
		//GregorianCalendar 생성해서 
		Calendar cal2;//객체변수 선언
		//Calendar 객체 cal2는 : 상위클래스의 객체는 하위클래스의 객체의 주소를 가질수 있다.
		cal2=new GregorianCalendar(2022,0,1);
		System.out.println("이달의 마지막날은="+cal2.getActualMaximum(Calendar.DATE));
		System.out.println("해당주에서 몇번째 날짜인지 ="+cal2.get(Calendar.DAY_OF_WEEK));
		
		GregorianCalendar gCal=new GregorianCalendar();//현재날짜 달력
		cal2=gCal;//참조형 자동형변환
		
		double dou=10;//기본형 자동형변환 작은것->큰것
		int i=(int)10.25;//강재형변환 :캐스팅
		gCal=(GregorianCalendar)cal2;//강재형변환 :캐스팅
				
	}

}

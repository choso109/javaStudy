package ezen;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수선언
		Scanner sc=new Scanner(System.in);
		int m;
		//메시지출력
		System.out.print("월을 입력하세요(1~12) >>");
		m=sc.nextInt();//입력
		// 다중 if 사용
		if(m>=3 && m<=5)
			System.out.println(m+"월은 봄 입니다.(if)");
		else if(m>=6 && m<=8)
			System.out.println(m+"월은 여름 입니다.(if)");
		else if(m>=9 && m<=11)
			System.out.println(m+"월은 가을 입니다.(if)");
		else if(m==12 || m==1 || m==2)
			System.out.println(m+"월은 겨울 입니다.(if)");
		else System.out.println(m+"월은 없습니다.(if)");
		// switch 사용
		switch(m) {
		case 3:
		case 4:
		case 5:System.out.println(m+"월은 봄 입니다.(switch)");break;
		case 6:case 7:case 8:
			System.out.println(m+"월은 여름 입니다.(switch)");break;
		case 9:case 10:case 11:
			System.out.println(m+"월은 가을 입니다.(switch)");break;
		case 12:case 1:case 2:
			System.out.println(m+"월은 겨울 입니다.(switch)");break;
		default: System.out.println(m+"월은 없습니다.(switch)");
		}
		
		sc.close();
	}

}

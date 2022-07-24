package ezen;

import java.util.Scanner;

public class Amout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int no,count;//품명번호 no, 수량:count
		System.out.println("---------------------------------");
		System.out.println("품명번호\t품명\t\t금액");
		System.out.println("---------------------------------");
		System.out.println(" 1\tMonitor\t\t192,000원");
		System.out.println(" 2\tHard Disk\t85,000원");
		System.out.println(" 3\tCPU\t\t156,000원");
		System.out.println(" 4\tMother Board\t206,000원");
		System.out.println(" 5\tKeyboard\t28,500원");
		System.out.println(" 6\tMouse\t\t14,000원");
		System.out.println("---------------------------------");		
		System.out.print("품명번호(1~6)와 수량을 입력하세요>>");
		no=sc.nextInt();count=sc.nextInt();
		System.out.println("\n\n\t** 구매 결과 **");
		System.out.println("==========================");		
		switch(no) {
		case 1:	
			System.out.println("품명 : Monitor\n수량 : "+count
					+"\n총 금액 : "+count*192000);break;				
		case 2:
			System.out.println("품명 : Hard Disk");
			System.out.println("수량 : "+count);
			System.out.println("총 금액 : "+count*85000);break;				
		case 3:
			System.out.println("품명 : CPU");
			System.out.println("수량 : "+count);
			System.out.println("총 금액 : "+count*156000);break;				
		case 4:
			System.out.println("품명 : Mother Board");
			System.out.println("수량 : "+count);
			System.out.println("총 금액 : "+count*206000);break;				
		case 5:
			System.out.println("품명 : Keyboard");
			System.out.println("수량 : "+count);
			System.out.println("총 금액 : "+count*28500);break;				
		case 6:
			System.out.println("품명 : mouse");
			System.out.println("수량 : "+count);
			System.out.println("총 금액 : "+count*1400);break;	
		default:
			System.out.println("잘못된 품명 코드 입이다.")	;		
		}
		System.out.println("==========================");		
		sc.close();
	}

}

package ezen;

import java.util.Scanner;

public class Pass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int grade,score;
		while(true) {//무한반복
			System.out.print("학년과 점수를 입력하세요 >>");
			grade=sc.nextInt();score=sc.nextInt();
			//중첩 if
			if(grade<1||grade>4) {
				System.out.println("학년 오류");
				continue;//반복문의 조건으로 간다
			}
			if(score<0 ||score >100) {
				System.out.println("점수 오류");continue;
			}
			if(grade==4) {
				if(score>=70)
					System.out.println(grade+"학년 "+score+"점 합격!");
				else System.out.println(grade+"학년 "+score+"점 불합격ㅠㅠ");
			}else {
				if(score>=60)
					System.out.println(grade+"학년 "+score+"점 합격!");
				else System.out.println(grade+"학년 "+score+"점 불합격ㅠㅠ");
			}
			break;//while문 탈출
		}//end while
		sc.close();
	}

}

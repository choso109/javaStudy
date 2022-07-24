package ezen;

public class Gugudan3 {

	public static void main(String[] args) {
		// 제목 출력하기for문1개 ** 2단 **   ** 3단 **... ** 9단 **
		for(int i=2;i<=9;i++)
			System.out.print(" ** "+i+"단 **  ");
		System.out.println();//줄바꿈
		// 2 x 1 = 2  3 x 1 = 3 ....  9 x 1 = 9
		// 2 x 2 = 2  3 x 2 = 3 ....  9 x 2 = 18
		// :
		// 2 x 9 = 18  3 x 9 = 27 ....  9 x 9 = 81
		for(int j=1;j<=9;j++) {
			for(int i=2;i<=9;i++)
				System.out.printf("%d x %d = %2d  ",i,j,i*j);		
			System.out.println();//줄바꿈
		}//end for j
	}

}

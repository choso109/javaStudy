package ezen;

public class Star1 {

	public static void main(String[] args) {
		System.out.println("\n-별다섯개 5줄 출력------------");
		//다중 for 반복
		for(int j=1;j<=5;j++) {
			for(int i=1;i<=5;i++)
				System.out.print("*");
			System.out.println();//줄바꾸기
		}//end for
		System.out.println("\n-Star1 1------------");
		//다중 for 반복 
		for(int j=5;j>=1;j--) {
			for(int i=1;i<=j;i++)
				System.out.print("*");
			System.out.println();//줄바꾸기
		}//end for
		System.out.println("\n-Star1 2------------");
		//다중 for 반복 
		for(int j=1;j<=5;j++) {
			for(int i=1;i<=6-j;i++)
				System.out.print("*");
			System.out.println();//줄바꾸기
		}//end for
	}

}

package ezen;

public class LottoWhile {

	public static void main(String[] args) {
		// 변수선언
		int n1,n2,n3,n4,n5,n6;
		// 난수만들기Math.random():0.0~0.999999
		for(int i=1;i<=100;i++) {
			n1=(int)(Math.random()*45)+1;
			n2=(int)(Math.random()*45)+1;
			while(n1==n2)
				n2=(int)(Math.random()*45)+1;
			n3=(int)(Math.random()*45)+1;
			while(n3==n1 || n3==n2)
				n3=(int)(Math.random()*45)+1;		
			n4=(int)(Math.random()*45)+1;
			while(n4==n1 || n4==n2|| n4==n3)
				n4=(int)(Math.random()*45)+1;
			n5=(int)(Math.random()*45)+1;
			while(n5==n1 || n5==n2|| n5==n3||n5==n4)
				n5=(int)(Math.random()*45)+1;
			n6=(int)(Math.random()*45)+1;
			while(n6==n1 || n6==n2|| n6==n3||n6==n4||n6==n5)
				n6=(int)(Math.random()*45)+1;
			System.out.printf("이번주 로또 : %d,%d,%d,%d,%d,%d\n"
					,n1,n2,n3,n4,n5,n6);
		}//end for
	}

}

package book;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2단~9단출력
		for(int k=2;k<10;k++) {
			System.out.println("** "+k+"단 **");
			for(int i=1;i<=9;i++)
				System.out.println(k+" x "+i+" = "+(k*i));
		}//end for k
		/*System.out.println("** 3단 **");
		for(int i=1;i<=9;i++)
			System.out.println("3 x "+i+" = "+(3*i));*/
		
		/*System.out.println("2x1=2");
		System.out.println("2x2=4");
		System.out.println("2x3=6");
		:
		System.out.println("2x9=18");*/	
	}

}

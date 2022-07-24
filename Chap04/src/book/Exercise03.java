package book;

public class Exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=3;i<=100;i+=3) {//i=i+3
			sum=sum+i;//sum+=i;
			//System.out.println("1~"+i+"까지의 3의 배수합 = "+sum);
		}
		System.out.println("1~100까지의 3의 배수합 = "+sum);
		sum=0;
		for(int i=1;i<=100;i++) 
			if(i%3==0)sum+=i;
		
		System.out.println("1~100까지의 3의 배수합 = "+sum);
	}

}

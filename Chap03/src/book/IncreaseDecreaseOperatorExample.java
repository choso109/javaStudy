package book;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-----------------------");
		x++;//1증가 11  증감연산자가 1개의 문장이면 1씩증감한다
		++x;//1증가 12
		System.out.println("x=" + x);		

		System.out.println("-----------------------");		
		y--;//1감소 9
		--y;//1감소 8
		System.out.println("y=" + y);		

		System.out.println("-----------------------");		
		z = x++;//후위연산자 z=x후에 1증가 
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("-----------------------");		
		z = ++x;//전위연산자:1증가한후 대입
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("-----------------------");				
		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}
}


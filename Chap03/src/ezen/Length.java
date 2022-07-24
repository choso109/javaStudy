package ezen;

public class Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double h1,h2=165.2,h3=135.9,h4=177.25;//변수선언		
		h1=182.5;
		double hap=h1+h2+h3+h4;//동일한 연산결과과 필요한 경우 저장 한 후 활용한다
		System.out.println("----------------------------------------------");
		System.out.println(" 키1\t키2\t키3\t키4\t합\t평균\t");
		System.out.println("----------------------------------------------");
		System.out.println(h1 + "\t"+h2 + "\t"+h3 + "\t"
				+h4 + "\t"+hap+"\t"+(hap/4));
		System.out.println("----------------------------------------------");

	}

}

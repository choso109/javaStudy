package book;

public class ArrayEx {

	public static void main(String[] args) {
		// 배열변수 참조형변수- 주소저장
		// 1차원 배열, 다차원배열
		// 배열 선언
		// 1차원 배열 선언 type [] 변수명;
		int [] a1;//주소1개 저장
		//배열의 생성
		//1. 선언하면서 초기치 부여
		//2. new 키워드 
		//참조형변수 초기치 null 값을 가질수 있다
		int [] a2= {10,20,30};//a2[0]~a2[2]
		for(int i=0;i<a2.length;i++)
			System.out.println(a2[i]);
		//for each문 : 배열을0번째 끝까지 반복
		for(int i:a2)//
			System.out.println(i);
		
		a1=new int[100];//0으로 초기화 되어있다.
		int n;//초기화x
		double d1[]=new double[] {3.0,2.0,5,5,6};
		System.out.println(d1.length);//length필드
		//2차원배열
		int[][] a3;//주소1개 저장
		a3=new int[3][5];//3행 5열 짜리의 배열 생성
		System.out.println("a3.length="+a3.length);//행의 길이
		System.out.println("a3[0].length="+a3[0].length);//0행의 열의 길이
		int[][] a4= {
				{10,20},
				{22,33,55,99,88},
				{1,2,3,5}};
		int[][] a5;//선언
		a5=new int[5][];//a5[0]~a[4] 저장 null로 초기화
		a5[0]=new int[3];
		a5[1]=new int[] {1,2,3,4,5};
		//객체 배열 : String 저장
		String str1[]= {"홍길동","세종대왕","공유"};
		String str2[];
		str2=new String[10];//str2[0]~str2[9]:null저장
		
	}

}

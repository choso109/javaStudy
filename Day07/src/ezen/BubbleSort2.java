package ezen;

public class BubbleSort2 {

	public static void main(String[] args) {
		int[]a= {30,20,11,55,88,12,3,6,59,29};
		arrayPrint("정렬전",a);
		int temp;
		//---------------------------------------------------
		for(int j=0;j<a.length-2;j++) {//0~7:8회
			for(int i=0;i<=(a.length-2)-j;i++)
				if(a[i]>a[i+1]) {//교환 //비교
					temp=a[i];a[i]=a[i+1];a[i+1]=temp;
				}
			arrayPrint((j+1)+" 단계",a);
				}
		
			}
	static void arrayPrint(String tittle, int []a) {
		System.out.print(tittle+":");
		for(int i=0;i<a.length;i++)
			if(i==a.length-1)
				System.out.printf("%2d\n",a[i]);
			else 
				System.out.printf("%2d,",a[i]);
	}
}

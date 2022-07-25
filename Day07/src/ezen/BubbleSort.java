package ezen;

public class BubbleSort {

	public static void main(String[] args) {
		int[]a= {30,20,11,55,88,12,3,6,59,29};
		arrayPrint("정렬전",a);
		int temp;
		//---------------------------------------------------
		for(int j=0;j<a.length;j++) {
			for(int i=0;i<a.length-1;i++)
				if(a[i]>a[i+1]) {//교환
					temp=a[i];a[i]=a[i+1];a[i+1]=temp;
				}
			arrayPrint((j+1)+" 단계",a);
				}
		arrayPrint("정렬 1단계",a);
		for(int i=0;i<a.length-1;i++)
			if(a[i]>a[i+1]) {//교환
				temp=a[i];a[i]=a[i+1];a[i+1]=temp;
			}
		arrayPrint("정렬 2단계",a);
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

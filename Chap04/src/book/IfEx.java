package book;

public class IfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// >= 이상 <=이하 ,>초과, <미만, == 같다,!=같지않다
		int score=90;
		//난수 사용
		//Math.random() 0.0~0.999999999999999
		score=(int)(Math.random()*101);
		//60이상이면 합격
		if(score>=60) {
			System.out.println("합격");
			System.out.println("축하합니다");
		}else {
			System.out.println("불합격");
			System.out.println("좀더 노력 하세요.");
		}
		//점수에 따른 평점 
		//90~100: A
		//80~89:B .....60점미만:F
		//최소 5번, 최대 8번
		char grade=' ';
		if(score>=90) {
			System.out.println("점수 : "+score);
			//System.out.println("평점 : A");
			grade='A';
		}
		if(score>=80 && score<90) {
			System.out.println("점수 : "+score);
			//System.out.println("평점 : B");
			grade='B';
		}
		if(score>=70 && score<80) {
			System.out.println("점수 : "+score);
			grade='C';
		}
		if(score>=60 && score<70) {
			System.out.println("점수 : "+score);
			grade='D';
		}
		if(score>=0) {
			System.out.println("점수 : "+score);
			grade='F';
		}
		// 다중 if
		// 최소 2번, 최악 4번 비교
		if(score>=90) {
			System.out.println("점수 : "+score);
			//System.out.println("평점 : A");
			grade='A';
		}else if(score>=80) {
			System.out.println("점수 : "+score);
			//System.out.println("평점 : B");
			grade='B';
		}else if(score>=70) {
			System.out.println("점수 : "+score);
			grade='C';
		}else if(score>=60) {
			System.out.println("점수 : "+score);
			grade='D';
		}else{
			System.out.println("점수 : "+score);
			grade='F';
		}
		String g1="";
		score=95;
		if(score>=90) {
			if(score>=95)
				g1="A+";
			else g1="A";
		}		
		System.out.println("평점 : "+ grade);
		System.out.println("평점 g1 : "+ g1);
	}

}

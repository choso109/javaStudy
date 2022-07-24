package book;

public class SwitchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn="010101-1015214";
		char sex=ssn.charAt(7);
		switch(sex) {
		case 49://'1'
		case '3':System.out.println("남자");break;
		case '2':
		case '4':System.out.println("여자");break;
		default:System.out.println("외계인");
		}//end sw

	}//endmain

}//end class

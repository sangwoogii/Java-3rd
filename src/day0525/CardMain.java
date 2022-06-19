package day0525;

public class CardMain {

	public static void main(String[] args) {
		
		Card cd1 = new Card("김그린", 10000);
		Card cd2 = new Card("박자바", 30000);
		
		cd1.pointAmt();
		cd2.pointAmt();
		

		
//		Card cd1 = new Card("김그린", 10000);
//		cd1.pointAmt(); // 값을 출력하기 위해 메서드 호출
//		
//		System.out.println();
//		
//		Card cd2 = new Card("박자바", 30000);
//		cd2.pointAmt(); // 값을 출력하기 위해 메서드 호출
	}

}

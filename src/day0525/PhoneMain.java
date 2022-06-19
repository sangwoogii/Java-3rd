package day0525;


public class PhoneMain {

	public static void main(String[] args) {
		
		Phone p1 = new Phone("samsung", "black", 1200000);
		Phone p2 = new Phone("apple", "white", 1090000);
		
		p1.make = "samsung";
		p1.color = "black";
		p1.price = 1200000;
		
		System.out.println("제조사 : " + p1.make + " / 색상 : " + p1.color + "/ 가격 : " + p1.price);
		System.out.println("제조사 : " + p2.make + " / 색상 : " + p2.color + "/ 가격 : " + p2.price);

		
		
//		Phone p1 = new Phone("samsung", "black", 1200000);
//		Phone p2 = new Phone("apple", "white", 1090000);
//		
//		System.out.printf("제조사 : %s / 색상 : %s / 가격 : %s\n", p1.make, p1.color, p1.price);
//		System.out.printf("제조사 : %s / 색상 : %s / 가격 : %s", p2.make, p2.color, p2.price);
	
		
//		Phone p1 = new Phone();
//		p1.make = "samsung";
//		p1.color = "black";
//		p1.price = 1200000;
//		
//		Phone p2 = new Phone("apple", "white", 1090000);
//
//		System.out.printf("제조사 : %s / 색상 : %s / 가격 : %d", p1.make, p1.color, p1.price);
//		System.out.printf("제조사 : %s / 색상 : %s / 가격 : %d", p2.make, p2.color, p2.price);
	}

}

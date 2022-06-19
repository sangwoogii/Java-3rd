package day0525;

public class Car {

	String color; 		// 색상변수 생성
	String gearType;    // 기어변수 생성
	int door; 			// 문 개수 생성
	
	Car(){ // Car 생성자의 기본값 생성
		
		this("white", "auto", 4); // 생성자의 제일 첫 문장에서만 사용가능
		door = 5;
	// Car(String color, String gearType, int door) 이 코드를 호출하는 의미
		
//		color = "white";
//		gearType = "auto";
//		door = 4;
	}
	
	
	Car(String color){ // 색상을 바꾸고 싶을 때 생성자 하나 더 생성
		
		this(color, "auto", 4);
//		this.color = color;
//		gearType = "auto";
//		door = 4;
	}
	
	
	Car(String color, String gearType, int door) { // 3개 다 바꾸고 싶을 때 생성자 하나 더 생성
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	
	Car(Car c){ // CarCopy의 내용, 인스턴스 복사하는 방법
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
}

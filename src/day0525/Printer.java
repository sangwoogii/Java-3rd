package day0525;

public class Printer {

//	오버로딩 예제
//
//	Printer 클래스를 생성하고 println ( ) 메서드를 작성하여
//	매개변수값을 콘솔창에 결과로 출력하고자 함.
//	println ( ) 메서드의 매개변수 값으로는 int, boolean, double, String 값을 지정할 수 있음.
//	println ( ) 메서드를 작성하시오.
	
	
	
	
	
	// 오버로딩
	// 메서드 이름은 같아야함 -> println
	// 변수명도 같아야함 -> a
	// 타입은 달라야함 -> int boolean double String
	
	static void println (int a) {
		System.out.println(a);
		// return으로 반환할 값이 없어서 바로 화면에 
		//출력하면 되기 때문에 void 사용
	}
	
	static void println (boolean a) {
		System.out.println(a);
	}
	
	static void println (double a) {
		System.out.println(a);
	}
	
	static void println (String a) {
		System.out.println(a);
	}
	 	
}

package day0525;

public class InitTest {

	static int cv = 1; // 명시적 초기화 (변수를 선언함과 동시에 값을 저장하는 것), (클래스)
	int iv = 1; // 명시적 초기화 (인스턴스)
	
	
	// 클래스 초기화 블럭 사용방법
	static {
		cv = 2;
	}
	
	// 인스턴스 초기화 블럭 사용방법
	{
		iv = 2;
	}
	
	//생성자 초기화 사용방법
	InitTest(){
		iv = 3;
	}
	
	public static void main(String[] args) {
		InitTest it = new InitTest();
		
		System.out.println(cv); // static이라 참조변수 없이 사용가능 -> 2 출력
		System.out.println(it.iv); // 생성자를 먼저 찾아감 -> 3 출력
		
		// 출력될 때 순서대로 이동하되 값이 덮어쓰여진다
		// 순서 외우기 ppt에 있음
		
		// 클래스 초기화 : 기본값 -> 명시적 초기화 -> 클래스 초기화 블럭 순서
		// 인스턴스 초기화 : 기본값 -> 명시적 초기화 -> 인스턴스 초기화 블럭 -> 생성자 순서

	}

}

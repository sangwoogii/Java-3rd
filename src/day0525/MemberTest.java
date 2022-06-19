package day0525;

public class MemberTest {

	public static void main(String[] args) {
		
		Member m1 = new Member("010-1111-2222", "울산시 남구");  // 객체 생성
		m1.print();
		
		System.out.println();
		
		Member m2 = new Member("010-8888-9999", "부산시 연제구");
		m2.print();
		
		System.out.println();
		
		Member m = new Member(); 
		// 생성자에 매개변수의 값이 있기 때문에 화면에 아무것도 출력하고 싶지 않을 땐
		// 매개변수가 없는 기본 생성자를 하나 생성해주면 에러가 뜨지 않는다.
		
		m.setMemberData("김그린", "010-1111-2222", "울산시 남구 삼산동");
		m.print();
		// 바로 위에 아무 값을 집어 넣지 않고 출력을 했을 때
		// 객체는 생성자를 제일 먼저 찾아가기 때문에 생성자에 입력되어 있는 값이 먼저 출력됨
		
		
	}

}

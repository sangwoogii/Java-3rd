package day0525;

public class Member {

	String name = "박자바"; 	// 명시적 초기화
	String tel; 			// 명시적 초기화
	String address;     	// 명시적 초기화
	
	Member(){} // 기본생성자
	
	Member(String tel, String address){
		// 매개 변수가 있는 기본 생성자 생성, 클래스이름과 무조건 동일해야함
//		name = no name;
		this.tel = tel;
		this.address = address;
	} 
	
	void setMemberData(String setName, String setTel, String setAddress) {
		name = setName;
		tel = setTel;
		address = setAddress;
	}
	
	void print() { // 화면에 출력하는 메서드 생성
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("address : " + address);
	}
	
	// 화면에 출력하기 위해 메인 생성 -> MemberTest
}

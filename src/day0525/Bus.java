package day0525;

public class Bus {

	int num; // 필드
	double gas; // 필드

	Bus(){ // 생성자 (매개변수가 없는 생성자)
		num = 1234; // 생성자에 필드 num (차량번호) 값 저장
		gas = 10.2d;// 생성자에  필드 gas (연료량) 값 저장
		System.out.println("버스가 만들어졌어요 !");
		// 객체를 생성하고 호출하면 제일 먼저 생성자부터
		// 찾기 때문에 버스가 만들어졌어요 ! 라는 말이 제일 먼저
		// 화면에 출력됨
	}
	
	public void show() {
		// 화면에 출력하기 위해 show라는 메서드 만듬 public은 그냥 쓴 것 큰 의미 x
		System.out.println("차량 번호 : " + num);
		System.out.println("연료량 : " + gas);
	}
}

package day0525;

public class Box {

	int width;
	int length;
	int height;
	int volume;
	
	Box(){} // 기본 생성자 생성
	
	// this : 객체 자신을 참조 (필드)
	// 이름이 동일한 경우에는 '매개변수'의 우선순위가 더 높기 때문에 필드명을 참조할수가 없음
	// 그렇기 때문에 this라는 것을 사용해 필드를 지정함
	Box(int width, int length, int height){ 
		this.width = width;
		this.length = length;
		this.height = height;
		this.volume = width * length * height;
	}
	
	public int getVolume() { // 게터 ? 세터 ?
		return volume;
	}
}

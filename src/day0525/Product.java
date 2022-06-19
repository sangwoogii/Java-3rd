package day0525;

public class Product {
	
	static int count = 0; // 인스턴스의 개수를 알기 위한 초기값
	int serialNo;
	
	{ // 인스턴스 초기화 블럭
		++count;
		serialNo = count; // 카운트가 늘어날때 마다 serialNO값이 count가 됨
	}
	
	public Product() {} // Product 생성자 생성
	
	
	
}

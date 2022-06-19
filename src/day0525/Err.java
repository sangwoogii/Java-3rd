package day0525;

class Data_1 {
	int value;
	
	Data_1(){} // 생성자를 직접 쓰지 않아도 자동으로 추가가 됨
			   // 기본생성자 : 매개변수가 없는 생성자
			   // 클래스를 생성할 때 기본적으로 기본생성자를 입력하는 것이 좋음
}

class Data_2 {
	int value;

	Data_2(){}
	Data_2(int x){ // 이 생성자를 직접 쓰지 않아도 자동으로 추가가 됨
		value = x;
		// 생성자도 오버로딩이 가능
	}  

}


public class Err {

	public static void main(String[] args) {
//		Data_1 d1 = new Data_1();
//		Data_2 d2 = new Data_2(10); 
//		// Data_2클래스에서 매개변수를 선언을 했기 때문에 여기서도 매개변수 값을 입력해야함
//		Data_2 d3 = new Data_2();
//		// Data_2클래스에서 매개변수를 선언을 했기 때문에 여기선 에러가 뜸
//		}

	}
}
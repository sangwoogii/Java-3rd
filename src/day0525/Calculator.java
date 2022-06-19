package day0525;

public class Calculator {

	// 정사각형과 직사각형의 넓이를 계산하는
	// areaRectangle 메서드를 오버로딩하여 작성하고
	// 정사각형의 길이는 10,
	// 직사각형의 넓이는 가로 10, 세로 20으로 계산하여
	// 각각의 넓이를 출력하시오.
	
	
	// 오버로딩
	double areaRectangle (int width) {
		return width * width;
	}
	
	double areaRecrangle (int width, int height) {
		return width * height;
	}
	

	
	// 정사각형의 넓이 계산 (길이 * 길이) -> 길이 1개만 구하면됨
//	double areaRectangle (double width) {
//		return width * width;
//	}

	
	// 직사각형의 넓이 계산 (가로 * 세로)
//	double areaRectangle (double width, double height) {
//		return width * height;
//	}
	
	// 오버로딩
	// 메서드의 이름이 같아야함
	// 매개변수의 개수가 달라야함
	
	
}

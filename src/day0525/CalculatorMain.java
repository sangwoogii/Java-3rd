package day0525;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		double result1 = cal.areaRectangle(20);
		double result2 = cal.areaRecrangle(20, 30);
		
		System.out.println("정사각형의 길이 : " + result1);
		System.out.println("직사각형의 길이 : " + result2);


//		Calculator myCal = new Calculator();
//		
//		double result3 = myCal.areaRectangle(10d);
//		double result4 = myCal.areaRectangle(10d, 20d);
//		
//		System.out.println("정사각형의 길이 : " + result1);
//		System.out.println("직사각형의 길이 : " + result2);
		
	
	}

}

package day0525;

public class ProductTest {

	public static void main(String[] args) {
		
		Product p1 = new Product(); // 객체 생성
		Product p2 = new Product();
		Product p3 = new Product();
		
		
		System.out.println("p1의 serialNo : " + p1.serialNo);
		System.out.println("p2의 serialNo : " + p2.serialNo);
		System.out.println("p3의 serialNo : " + p3.serialNo);
		
		
		System.out.println("총 제품의 수는 " + Product.count + "개");

	}

}

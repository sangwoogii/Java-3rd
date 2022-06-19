package day0525;

public class Cons {

	int x;
	
	Cons(){
		this(1000); // this() : 생성자를 호출함, 생성자 먼저 찾아감
		
		x = 10;
		System.out.println("매개변수가 없는 생성자");
		System.out.println("Cons가 가지고 있는 x : " + this.x);
	}
	
	Cons (int x) {
		this.x = x;
		System.out.println("매개변수가 하나인 생성자");
		System.out.println("Cons가 가지고 있는 x : " + this.x);
	}
	
	public static void main(String[] args) {
//		Cons c = new Cons();
	}
}

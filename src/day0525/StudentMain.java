package day0525;

public class StudentMain {

	public static void main(String[] args) {
		
		Student st1 = new Student("김그린", 1, 1, 86, 92, 85);
		System.out.println("이름 : " + st1.name);
		System.out.println("총점 : " + st1.getTotal());
		System.out.println("평균 : " + st1.getAverage());
		
		System.out.println();
			
		Student st2 = new Student("박자바", 2, 10, 95, 87, 77);
		System.out.println("이름 : " + st2.name);
		System.out.println("총점 : " + st2.getTotal());
		System.out.println("평균 : " + st2.getAverage());
		
		
	
		
		
//		Student s = new Student("김그린", 1, 1, 100, 60, 76);
//		System.out.println("이름 : " + s.name);
//		System.out.println("총점 : " + s.getTotal());
//		System.out.println("평균 : " + s.getAverage());
	}

}

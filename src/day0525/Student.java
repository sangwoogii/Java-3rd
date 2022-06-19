package day0525;

public class Student {

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(){}
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		return (int)((getTotal() / 3f) * 100 + 0.5f) / 100f;
	}
	

	
	
//	String name;
//	int ban;
//	int no;
//	int kor;
//	int eng;
//	int math;
//	
//	Student(){} // 기본 생성자는 무조건 하나 만들어주는게 좋음
//	
//	Student(String name, int ban, int no, int kor, int eng, int math){
//		this.name = name;
//		this.ban = ban;
//		this.no = no;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//	}
//	
//	int getTotal() {
//		return kor + eng + math; // 반환하라고 했기 때문에 return 사용
//	}							 // 합계
//	
//	float getAverage() {
//		return (int)((getTotal() / 3f) * 100 + 0.5f) / 100f; // 평균
//		
//	}
}

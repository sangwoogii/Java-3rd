package day0525;

public class Document {

//	문서의 제목이 있다면 그대로 출력하고
//	만약 문서명을 지정하지 않았다면
//	'제목없음1.java', '제목없음2.java'...를 출력하는
//	Document.java와 DocumentMain.java를 생성하시오 !
	
	static int count = 0;
	String name;
	
	
	Document(){
		count++;
		this.name = "제목없음" + count;
		System.out.println(this.name + ".java");
	}
	
	Document(String name){
		this.name = name;
		System.out.println(this.name + "이(가) 생성됨");
	}
	
	
	
//	static int count = 0; // 클래스 변수 순서가 늘어나야되서 count
//	String title; // 인스턴스 변수
//	
//	
//	Document() {
//		count++;
//		this.title = "제목없음" + count;
//		System.out.println(this.title + ".java이(가) 생성됨");
//	}
//	
//	Document(String title) {
//		this.title = title;
//		System.out.println(this.title + "이(가) 생성됨");
	}


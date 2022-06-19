package day0525;

public class PrinterExam {

	public static void main(String[] args) {
		
		// static 메서드이기 때문에 객체생성없이 바로 호출 가능
		
		Printer.println(77);
		Printer.println(true);
		Printer.println(77.7d); // double형은 뒤에 접미사 d 붙이기
		Printer.println("파이팅");
	}

}

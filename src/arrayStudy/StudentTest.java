package arrayStudy;

public class StudentTest {

	public static void main(String[] args) {
		
		Student stdLee = new Student(1001, "이꾸생");
		
		stdLee.addSubject("자바 프로그래밍", 100);
		stdLee.addSubject("Spring", 99);
		stdLee.addSubject("HTML/CSS", 98);
		
		stdLee.showStudentInfo();
		
		System.out.println("");
		System.out.println("=========================================");
		System.out.println("");
		
		Student stdKim = new Student(1002, "꾸생");
		
		stdKim.addSubject("자바 프로그래밍", 98);
		stdKim.addSubject("Spring", 97);
		
		stdKim.showStudentInfo();
	}
}
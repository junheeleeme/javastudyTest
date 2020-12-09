package arrayStudy;

import java.util.ArrayList;

public class Student {
	
	private int studentID;
	private String studentName; 
	private ArrayList<Subject> subjectList;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		Subject sbj = new Subject();
		sbj.setName(name);
		sbj.setScorePoint(score);
		subjectList.add(sbj);
	}
	
	public void showStudentInfo() {
		int avg = 0;
		int total = 0;
		for( Subject s : subjectList ) {
			total+= s.getScorePoint();
			avg+= s.getScorePoint();
			System.out.println("학생 " + studentName + "의 총점은 " + s.getName() + " 과목 성적은 " 
			+ s.getScorePoint() + "점 입니다." );
		}	
		System.out.println("총점 : " + total + "점, 평균 : " + avg/subjectList.size() + "점");
	}
}

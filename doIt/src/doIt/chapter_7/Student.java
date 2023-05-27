package doIt.chapter_7;
import java.util.ArrayList;

public class Student {
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList; // ArrayList 선언하기
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject(); // Subject 생성
		subject.setName(name); // 과목 이름 추가
		subject.setScorePoint(score); // 점수 추가하기
		subjectList.add(subject);
	}

	public void showStudentInfo() {
		int total = 0;
		for(Subject s : subjectList) {
			total += s.getScorePoint();
			System.out.println("학생 " + studentName +"의 " +
			s.getName() +" 과목 성적은 " + s.getScorePoint() + 
			"입니다.");
		}
		System.out.println("총점은 " + total + "입니다.");
	}
	
}

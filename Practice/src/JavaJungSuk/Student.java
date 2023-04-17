package JavaJungSuk;

public class Student {
	
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		}
	
	Student(){

	} // 생성자 메서드 오버로딩
	
	String info() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + 
				math + "," + (kor+eng+math) + "," + 
				(int)((kor+eng+math)/3f*10+0.5)/10f; 
	}
	
	int getTotal() {
		return this.kor + this.eng + this.math;
	}
	
	float getAverage() {
		
		return (int)(getTotal()/3f*10+0.5)/10f;
		
	}
	
	

}

package week2.day3assignments;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Student name:Vignesh");

	}

	public void studentDept() {
		System.out.println("Student Dep:Mech");
	}

	public void studentId() {
		System.out.println("studentId:102");
	
}
public static void main(String[] args) {
	Student s = new Student();
	s.collegeName();
	s.collegeCode();
	System.out.println(s.collegeRank("Gf rank first"));
	s.deptName();
	s.studentName();
	s.studentDept();
	s.studentId();
}
}

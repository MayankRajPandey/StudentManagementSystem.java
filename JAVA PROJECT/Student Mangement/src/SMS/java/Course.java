package SMS.java;
 import java.util.ArrayList;
 import java.util.List;
 
public class Course {
	private String name;
	private int maxStudents;
	private List<Student> students;
	
	public Course(String name,int maxStudents) {
		this.name=name;
		this.maxStudents = maxStudents;
		this.students=new ArrayList<>();
	}
	public boolean enrollStudent(Student student) {
		if (students.size()< maxStudents) {
			students.add(student);
			return true;
		}
		return false;
	}
	public String getName() {
		return name;
	}
	public int getMAxStudent() {
		return maxStudents;
	}
	public List<Student>getStudents() {
	return students;
	}

}

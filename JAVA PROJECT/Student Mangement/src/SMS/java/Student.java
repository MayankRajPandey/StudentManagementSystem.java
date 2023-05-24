package SMS.java;
import java.util.ArrayList;
import java.util.List;

public class Student {
	private int id;
	private String name;
	private int age;
	private List<Integer> grades;
	
	public Student(int id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.grades=new ArrayList<>();
	}
	public void addGrade(int grade) {
		grades.add(grade);
	
		
	}
	public int getId() {
		return id;

	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public List<Integer>getGrades() {
		return grades;
	}
}

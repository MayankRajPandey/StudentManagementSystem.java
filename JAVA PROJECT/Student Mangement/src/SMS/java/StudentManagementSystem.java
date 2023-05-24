package SMS.java;

import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {
          private List<Student> students;
          private List<Course> courses;
          
          public StudentManagementSystem() {
        	  this.students = new ArrayList<>();
        	  this.courses = new ArrayList<>();
          }
          public void addStudent(Student student) {
        	  students.add(student);
          }
          public void createCourse(String name,int maxStudents) {
        	  Course course = new Course(name, maxStudents);
        	  courses.add(course);
          }
          public boolean enrollStudentInCourse(int studentId, String courseName) {
        	  Student student = getStudentById(studentId);
        	  Course course = getCourseByName(courseName);
        	  if(student !=null && course != null) {
        		  return course.enrollStudent(student);
        	  }
        	  return false;
          }
		private Course getCourseByName(String courseName) {
			// TODO Auto-generated method stub
			return null;
		}
		private Student getStudentById(int studentId) {
			// TODO Auto-generated method stub
			return null;
		}
		public void displayStudentInfo(int studentId) {
			Student student=getStudentById(studentId);
			if(student != null) {
				System.out.println("Student ID:" + student.getId());
				System.out.println("Name:"+ student.getName());
				System.out.println("Age:" + student.getAge());
				System.out.println("Grades:" + student.getGrades());
				System.out.println("Average Grade:"+ GradeCalculator.calculateAverageGrade(student.getGrades()));
		}else {
			System.out.println("Student not found");
		}
}
		public void generateReport() {
			for(Course course : courses) {
				System.out.println("Course:"+course.getName());
				for(Student student : course.getStudents()) {
					System.out.println("Student ID:"+student.getId());
					System.out.println("Name:"+student.getName());
					System.out.println("Age:"+student.getAge());
					System.out.println("Grades:"+student.getGrades());
					System.out.println("Average Grade:"+ GradeCalculator.calculateAverageGrade(student.getGrades()));
					System.out.println();
				}
			}
		}
//		private Student getStudentById1(int studentId) {
//		for(Student student : students) {
//			if(student.getId() == studentId) {
//				return student;
//			}
//		}
//		return null;
	//	}
}


		
		


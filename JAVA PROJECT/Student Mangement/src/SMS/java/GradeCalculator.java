package SMS.java;

import java.util.List;

public class GradeCalculator {
	public static double calculateAverageGrade(List<Integer>grades) {
		if(grades.isEmpty()) {
			return 0;
		}
		int sum=0;
		for(int grade : grades){
			sum +=grade;
		}
		return(double) sum/grades.size();
		
		
	}

}

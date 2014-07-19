package com.sprint3r.cicd.gradecalculator;

public class GradeCalculator {

	public String cal(int score) {
		
		if(score >= 95)
			return "A+";
		
		if(score >= 85)
			return "A";
		
		if(score >= 80)
			return "A-";

		if(score >= 70)
			return "B";

		if(score >= 60)
			return "D+";

		if(score >= 50)
			return "D-";

		return "F";
	}

}

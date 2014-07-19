package com.sprint3r.cicd.gradecalculator;

public class GradeCalculator {

	public String cal(int score) {
		
		if(score >= 95)
			return "A+";
		
		if(score >= 85)
			return "A";
		
		return null;
	}

}

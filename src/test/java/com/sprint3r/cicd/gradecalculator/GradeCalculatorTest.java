package com.sprint3r.cicd.gradecalculator;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class GradeCalculatorTest {

	GradeCalculator gradeCalculator = new GradeCalculator();
	@Test
	public void given_score_95_then_a_plus() {
		assertThat(gradeCalculator.cal(95), is("A+"));
	}

	@Test
	public void given_score_85_then_a() {
		assertThat(gradeCalculator.cal(85), is("A"));
	}	
	
	@Test
	public void given_score_80_then_a_minus() {
		assertThat(gradeCalculator.cal(80), is("A-"));
	}
	@Test
	public void given_score_70_then_b() {
		assertThat(gradeCalculator.cal(70), is("B"));
	}
}

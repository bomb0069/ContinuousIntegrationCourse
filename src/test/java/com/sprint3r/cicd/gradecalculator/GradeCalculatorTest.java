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

	@Test
	public void given_score_65_then_c() {
		assertThat(gradeCalculator.cal(65), is("C"));
	}
	
	
	@Test
	public void given_score_55_then_d() {
		assertThat(gradeCalculator.cal(55), is("D"));
	}
	
	@Test
	public void given_score_60_then_d_plus() {
		assertThat(gradeCalculator.cal(60), is("D+"));
	}

	@Test
	public void given_score_50_then_d_minus() {
		assertThat(gradeCalculator.cal(50), is("D-"));
	}

	@Test
	public void given_score_40_then_d_plus() {
		assertThat(gradeCalculator.cal(40), is("F+"));
	}
}

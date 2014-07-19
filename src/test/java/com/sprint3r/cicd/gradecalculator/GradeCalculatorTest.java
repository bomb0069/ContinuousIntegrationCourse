package com.sprint3r.cicd.gradecalculator;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class GradeCalculatorTest {

	@Test
	public void given_score_95_then_a_plus() {
		GradeCalculator gradeCalculator = new GradeCalculator();
		assertThat(gradeCalculator.cal(95), is("A+"));
	}

}

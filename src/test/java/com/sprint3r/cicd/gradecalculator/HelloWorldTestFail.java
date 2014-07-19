package com.sprint3r.cicd.gradecalculator;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import com.sprint3r.cicd.gradecalculator.HelloWorld;


public class HelloWorldTestFail {

	@Test
	public void showHelloWorld() {
		HelloWorld helloWorld = new HelloWorld();
		assertThat(helloWorld.show(), is("Hello"));
	}

}

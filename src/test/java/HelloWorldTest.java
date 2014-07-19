import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;


public class HelloWorldTest {

	@Test
	public void showHelloWorld() {
		assertThat(HelloWorld.show(), is("Hello World"));
	}

}

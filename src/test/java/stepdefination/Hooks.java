package stepdefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void setUp()
	{
		System.out.println("Test started");
	}
	@After
	public void tearDown()
	{
		System.out.println("Test ended");
	}
}

package org.GIT;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class NewGIT {
	
	@Before
	public void startTime() {
		System.out.println("Testcase starts");
	}

	@After
	public void endTime() {
		System.out.println("testcase ends");
	}

	@Test
	public void tc3() {
		System.out.println("Test3");

	}

	@BeforeClass
	public static void launch() {
		System.out.println("Launch");
	}

	@AfterClass
	public static void quit() {
		System.out.println("close");
	}

	@Test
	public void tc2() {
		System.out.println("Test2");

	}

	@Test
	public void tc1() {
		System.out.println("Test1");

	}

}
	

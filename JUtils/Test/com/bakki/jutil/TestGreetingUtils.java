/**
 * 
 */
package com.bakki.jutil;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author prakash
 *
 */
public class TestGreetingUtils {
	private GreetingUtils gUtils;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		gUtils= new GreetingUtils();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		gUtils= null;
	}

	/**
	 * Test method for {@link com.bakki.jutil.GreetingUtils#wishUser(java.lang.String)}.
	 */
	@Test
	public final void testGreetTheUser() {
		String expecting ="Welcome Mr.Srikanth";
		String actual=gUtils.greetTheUser("Srikanth");
		
		assertEquals("Success", expecting , actual);
	
	}

}

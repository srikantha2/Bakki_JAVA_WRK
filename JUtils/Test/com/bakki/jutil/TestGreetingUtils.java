/**
 * TEST class for GreetingUtils
 */
package com.bakki.jutil;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;
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
	private GreetingJUtils gUtils;
	static Logger log = Logger.getLogger(TestGreetingUtils.class.getName());

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		log.debug("TestGreetingUtils:: Before Class Invocation");

	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		log.debug("TestGreetingUtils:: After Class Invocation");

	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		log.debug("TestGreetingUtils:: Before Test Invocation");
		gUtils = new GreetingJUtils();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		gUtils = null;
		log.debug("TestGreetingUtils:: After Test Invocation");

	}

	/**
	 * Test method for
	 * {@link com.bakki.jutil.GreetingJUtils#wishUser(java.lang.String)}.
	 */
	@Test
	public final void testGreetTheUser() {
		log.info("TestGreetingUtils:: Testing started..");

		String expecting = "Good Evening,Welcome Mr.Srikanth";
		String actual = gUtils.greetTheUser("Srikanth");

		assertEquals("Success", expecting, actual);

		log.info("TestGreetingUtils:: Testing ends..");

	}

}

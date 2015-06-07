/**
 * 
 */
package com.bakki.jutil;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author prakash
 *
 */
public class TestTimeUtils {

	private TimeUtils tUtils;
	
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
		tUtils= mock(TimeUtils.class);
		 when(tUtils.presentMode()).thenReturn("Good Morning,");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.bakki.jutil.TimeUtils#getDayMode()}.
	 */
	@Test
	public final void testGetMorningMode() {
		String actual=tUtils.presentMode();
		String expected ="Good Morning,";
		assertEquals(expected, actual);
      //  verify(, atLeastOnce()).findAccount(customer);

	}

}

/**
 * 
 */
package com.bakki.jutil;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.lang3.StringUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * @author prakash
 *
 */
public class TestTimeUtils {

	private TimeJUtils tUtils;
	
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
		tUtils= mock(TimeJUtils.class);
		 when(tUtils.presentMode()).thenReturn("Good Morning,");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.bakki.jutil.TimeJUtils#getDayMode()}.
	 */
	@Test
	public final void testGetMorningMode() {
		
		String actual=tUtils.presentMode();
		String expected ="Good Morning,";
		StringUtils.isNotBlank(expected); 
		assertEquals(expected, actual);
		Mockito.verify(tUtils, Mockito.atLeastOnce());
		
	}

}

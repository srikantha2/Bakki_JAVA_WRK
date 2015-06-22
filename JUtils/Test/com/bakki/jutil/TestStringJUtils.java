package com.bakki.jutil;

import junit.framework.TestCase;

import org.junit.Test;

public class TestStringJUtils extends TestCase {

	public void test_type() throws Exception {
		assertNotNull(StringJUtils.class);
	}

	@Test
	public void test_instantiation() throws Exception {
		StringJUtils target = new StringJUtils();
		assertNotNull(target);
	}

	@Test
	public void test_equalsIgnoreEmpty_null() throws Exception {
		String str1 = null;
		String str2 = null;
		boolean actual = StringJUtils.equalsStrictEmpty(str1, str2);
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void test_equalsIgnoreEmpty_blank() throws Exception {
		String str1 = "";
		String str2 = "";
		boolean actual = StringJUtils.equalsStrictEmpty(str1, str2);
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void test_equalsIgnoreEmpty_blankSpace() throws Exception {
		String str1 = " ";
		String str2 = " ";
		boolean actual = StringJUtils.equalsStrictEmpty(str1, str2);
		boolean expected = true;
		assertEquals(expected, actual);
	}

	@Test
	public void test_equalsIgnoreEmpty_Match() throws Exception {
		String str1 = "sample";
		String str2 = "sample";
		boolean actual = StringJUtils.equalsStrictEmpty(str1, str2);
		boolean expected = true;
		assertEquals(expected, actual);
	}

	@Test
	public void test_equalsIgnoreEmpty_NoMatchCase() throws Exception {
		String str1 = "Sample";
		String str2 = "sample";
		boolean actual = StringJUtils.equalsStrictEmpty(str1, str2);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	@Test
	public void test_equalsIgnoreEmpty_NoMatch() throws Exception {
		String str1 = "Sample";
		String str2 = "tiger";
		boolean actual = StringJUtils.equalsStrictEmpty(str1, str2);
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void test_equalsIgnoreEmpty_NoMatchNull() throws Exception {
		String str1 = null;
		String str2 = "sample";
		boolean actual = StringJUtils.equalsStrictEmpty(str1, str2);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	

	@Test
	public void test_equalsIgnoreNull_null() throws Exception {
		String str1 = null;
		String str2 = null;
		boolean actual = StringJUtils.equalsStrictNull(str1, str2);
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void test_equalsIgnoreNull_blank() throws Exception {
		String str1 = "";
		String str2 = "";
		boolean actual = StringJUtils.equalsStrictNull(str1, str2);
		boolean expected = true;
		assertEquals(expected, actual);
	}

	@Test
	public void test_equalsIgnoreNull_blankSpace() throws Exception {
		String str1 = " ";
		String str2 = " ";
		boolean actual = StringJUtils.equalsStrictNull(str1, str2);
		boolean expected = true;
		assertEquals(expected, actual);
	}

	@Test
	public void test_equalsIgnoreNull_Match() throws Exception {
		String str1 = "sample";
		String str2 = "sample";
		boolean actual = StringJUtils.equalsStrictNull(str1, str2);
		boolean expected = true;
		assertEquals(expected, actual);
	}

	@Test
	public void test_equalsIgnoreNull_NoMatchCase() throws Exception {
		String str1 = "Sample";
		String str2 = "sample";
		boolean actual = StringJUtils.equalsStrictNull(str1, str2);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	@Test
	public void test_equalsIgnoreNull_NoMatch() throws Exception {
		String str1 = "Sample";
		String str2 = "tiger";
		boolean actual = StringJUtils.equalsStrictNull(str1, str2);
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void test_equalsIgnoreNull_NoMatchNull() throws Exception {
		String str1 = null;
		String str2 = "sample";
		boolean actual = StringJUtils.equalsStrictNull(str1, str2);
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void test_equalsIgnoreBlank_null() throws Exception {
		String str1 = null;
		String str2 = null;
		boolean actual = StringJUtils.equalsStrictBlank(str1, str2);
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void test_equalsIgnoreBlank_blank() throws Exception {
		String str1 = "";
		String str2 = "";
		boolean actual = StringJUtils.equalsStrictBlank(str1, str2);
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void test_equalsIgnoreBlank_blankSpace() throws Exception {
		String str1 = " ";
		String str2 = " ";
		boolean actual = StringJUtils.equalsStrictBlank(str1, str2);
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void test_equalsIgnoreBlank_Match() throws Exception {
		String str1 = "sample";
		String str2 = "sample";
		boolean actual = StringJUtils.equalsStrictBlank(str1, str2);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	@Test
	public void test_equalsIgnoreBlank_NoMatchCase() throws Exception {
		String str1 = "sample";
		String str2 = "Sample";
		boolean actual = StringJUtils.equalsStrictBlank(str1, str2);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	@Test
	public void test_equalsIgnoreBlank_NoMatch() throws Exception {
		String str1 = "sample";
		String str2 = "tiger";
		boolean actual = StringJUtils.equalsStrictBlank(str1, str2);
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void test_equalsIgnoreBlank_NoMatchNull() throws Exception {
		String str1 = null;
		String str2 = "sample";
		boolean actual = StringJUtils.equalsStrictBlank(str1, str2);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	@Test
	public void test_equalsIgnoresCaseEmpty_null() throws Exception {
		String str1 = null;
		String str2 = null;
		boolean actual = StringJUtils.equalsIgnoreCaseStrictEmpty(str1, str2);
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void test_equalsIgnoresCaseEmpty_blank() throws Exception {
		String str1 = "";
		String str2 = "";
		boolean actual = StringJUtils.equalsIgnoreCaseStrictEmpty(str1, str2);
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void test_equalsIgnoresCaseEmpty_blankSpace() throws Exception {
		String str1 = " ";
		String str2 = " ";
		boolean actual = StringJUtils.equalsIgnoreCaseStrictEmpty(str1, str2);
		boolean expected = true;
		assertEquals(expected, actual);
	}

	@Test
	public void test_equalsIgnoresCaseEmpty_Match() throws Exception {
		String str1 = "sample";
		String str2 = "sample";
		boolean actual = StringJUtils.equalsIgnoreCaseStrictEmpty(str1, str2);
		boolean expected = true;
		assertEquals(expected, actual);
	}

	@Test
	public void test_equalsIgnoresCaseEmpty_NoMatchCase() throws Exception {
		String str1 = "sample";
		String str2 = "Sample";
		boolean actual = StringJUtils.equalsIgnoreCaseStrictEmpty(str1, str2);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	@Test
	public void test_equalsIgnoresCaseEmpty_NoMatch() throws Exception {
		String str1 = "sample";
		String str2 = "tiger";
		boolean actual = StringJUtils.equalsIgnoreCaseStrictEmpty(str1, str2);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_equalsIgnoresCaseEmpty_NoMatchNull() throws Exception {
		String str1 = null;
		String str2 = "sample";
		boolean actual = StringJUtils.equalsIgnoreCaseStrictEmpty(str1, str2);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_equalsIgnoresCaseBlank_null() throws Exception {
		String str1 = null;
		String str2 = null;
		boolean actual = StringJUtils.equalsIgnoreCaseStrictBlank(str1, str2);
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void test_equalsIgnoresCaseBlank_blank() throws Exception {
		String str1 = "";
		String str2 = "";
		boolean actual = StringJUtils.equalsIgnoreCaseStrictBlank(str1, str2);
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void test_equalsIgnoresCaseBlank_blankSpace() throws Exception {
		String str1 = " ";
		String str2 = " ";
		boolean actual = StringJUtils.equalsIgnoreCaseStrictBlank(str1, str2);
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void test_equalsIgnoresCaseBlank_Match() throws Exception {
		String str1 = "sample";
		String str2 = "sample";
		boolean actual = StringJUtils.equalsIgnoreCaseStrictBlank(str1, str2);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	@Test
	public void test_equalsIgnoresCaseBlank_MatchCase() throws Exception {
		String str1 = "sample";
		String str2 = "Sample";
		boolean actual = StringJUtils.equalsIgnoreCaseStrictBlank(str1, str2);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	@Test
	public void test_equalsIgnoresCaseBlank_NoMatch() throws Exception {
		String str1 = "sample";
		String str2 = "tiger";
		boolean actual = StringJUtils.equalsIgnoreCaseStrictBlank(str1, str2);
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void test_equalsIgnoresCaseBlank_NoMatchNull() throws Exception {
		String str1 = null;
		String str2 = "sample";
		boolean actual = StringJUtils.equalsIgnoreCaseStrictBlank(str1, str2);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	@Test
	public void test_equalsIgnoresCaseNull_null() throws Exception {
		String str1 = null;
		String str2 = null;
		boolean actual = StringJUtils.equalsIgnoreCaseStrictNull(str1, str2);
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void test_equalsIgnoresCaseNull_blank() throws Exception {
		String str1 = "";
		String str2 = "";
		boolean actual = StringJUtils.equalsIgnoreCaseStrictNull(str1, str2);
		boolean expected = true;
		assertEquals(expected, actual);
	}

	@Test
	public void test_equalsIgnoresCaseNull_blankSpace() throws Exception {
		String str1 = " ";
		String str2 = " ";
		boolean actual = StringJUtils.equalsIgnoreCaseStrictNull(str1, str2);
		boolean expected = true;
		assertEquals(expected, actual);
	}

	@Test
	public void test_equalsIgnoresCaseNull_Match() throws Exception {
		String str1 = "sample";
		String str2 = "sample";
		boolean actual = StringJUtils.equalsIgnoreCaseStrictNull(str1, str2);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	@Test
	public void test_equalsIgnoresCaseNull_MatchCase() throws Exception {
		String str1 = "sample";
		String str2 = "Sample";
		boolean actual = StringJUtils.equalsIgnoreCaseStrictNull(str1, str2);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	@Test
	public void test_equalsIgnoresCaseNull_NoMatch() throws Exception {
		String str1 = "sample";
		String str2 = "tiger";
		boolean actual = StringJUtils.equalsIgnoreCaseStrictNull(str1, str2);
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void test_equalsIgnoresCaseNull_NoMatchNull() throws Exception {
		String str1 = null;
		String str2 = "sample";
		boolean actual = StringJUtils.equalsIgnoreCaseStrictNull(str1, str2);
		boolean expected = false;
		assertEquals(expected, actual);
	}
}


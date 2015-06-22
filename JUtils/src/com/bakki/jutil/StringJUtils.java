/**
 * 
 */
package com.bakki.jutil;

import org.apache.commons.lang3.StringUtils;

/**
 * @author prakash
 *
 */
public class StringJUtils extends StringUtils {

	
	/**
     * <p>Compares two Strings, returning <code>true</code> if they are equal.</p>
     *
     * <p><code>null</code>s are handled without exceptions. Two <code>null</code>
     * references are considered to be not equal.Two <code>blank(space)</code>
     * references are considered to be not equal. The comparison is case sensitive.</p>
     *
     * <pre>
     * StringJUtils.equalsStrictEmpty(null, null)   = false
     * StringJUtils.equalsStrictEmpty("", "")   	= false
     * StringJUtils.equalsStrictEmpty(null, "abc")  = false
     * StringJUtils.equalsStrictEmpty("abc", null)  = false
     * StringJUtils.equalsStrictEmpty("abc", "abc") = true
     * StringJUtils.equalsStrictEmpty("abc", "ABC") = false
     * </pre>
     *
     * @see java.lang.String#equals(Object)
     * @param str1  the first String, may be null
     * @param str2  the second String, may be null
     * @return <code>true</code> if the Strings are equal , non Blank and case sensitive
     *  
     */
	public static boolean equalsStrictEmpty(String str1, String str2) {
		return (isNotEmpty(str1) && str1.equals(str2));
	}

	/**
     * <p>Compares two Strings, returning <code>true</code> if they are equal.</p>
     *
     * <p><code>null</code>s are handled without exceptions. Two <code>null</code>
     * references are considered to be not equal. The comparison is case sensitive.</p>
     *
     * <pre>
     * StringJUtils.equalsStrictNull(null, null)   = false
     * StringJUtils.equalsStrictNull("", "")   	   = true
     * StringJUtils.equalsStrictNull(null, "abc")  = false
     * StringJUtils.equalsStrictNull("abc", null)  = false
     * StringJUtils.equalsStrictNull("abc", "abc") = true
     * StringJUtils.equalsStrictNull("abc", "ABC") = false
     * </pre>
     *
     * @see java.lang.String#equals(Object)
     * @param str1  the first String, may be null
     * @param str2  the second String, may be null
     * @return <code>true</code> if the Strings are equal and case sensitive
     *  
     */
	public static boolean equalsStrictNull(String str1, String str2) {
		return (str1!=null && str1.equals(str2));
	}

	
	public static boolean equalsStrictBlank(String str1, String str2) {
		return (isNotBlank(str1)  && str1.equals(str2));
	}
	
	public static boolean equalsIgnoreCaseStrictEmpty(String str1, String str2) {
		return (isNotEmpty(str1)  && str1.equalsIgnoreCase(str2));
	}

	public static boolean equalsIgnoreCaseStrictBlank(String str1, String str2) {
		return (isNotBlank(str1)  && str1.equalsIgnoreCase(str2));
	}
	
	public static boolean equalsIgnoreCaseStrictNull(String str1, String str2) {
		return (str1!=null  && str1.equalsIgnoreCase(str2));
	}
	
}

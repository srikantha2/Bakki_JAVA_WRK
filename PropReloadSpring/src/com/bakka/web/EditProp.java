/**
 * 
 */
package com.bakka.web;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * @author sbakka
 *
 */
public class EditProp {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

		Properties props=new Properties();   
		FileInputStream fis = new FileInputStream ("c:/Mylogs/sample.properties");   
		 props.load(fis);   
		String TargetKey ="TEST_KEY" ; 
		System.out.println("Before : "+props.getProperty(TargetKey));   
		FileOutputStream fos = new FileOutputStream ("c:/MyLogs/sample.properties");   
		props.setProperty(TargetKey,"somevalue");   
		props.store(fos,null);   
		fis.close();   
		fos.close();
		
		FileInputStream fis2 = new FileInputStream ("c:/MyLogs/sample.properties");   
		 props.load(fis2);   
		System.out.println("After : "+props.getProperty(TargetKey));   
		fis2.close();   

		
	}

}

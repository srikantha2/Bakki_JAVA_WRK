/**
 * 
 */
package com.bakka.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;

/**
 * @author SB 
 *
 */
public class PropUtils {
	
	
	public Map<String, String> loadPropertiesFromCP() throws Exception{
		final Properties properties = new Properties();
		Map<String, String> map = new HashMap<String, String>();
		try{
			FileInputStream fis2 = new FileInputStream ("c:/Temp/foo.properties");   
			properties.load(fis2);   
		   
			fis2.close();   	
		for (final String name: properties.stringPropertyNames())
		    map.put(name, properties.getProperty(name));
		}
		catch(Exception ex){
			
		}
		return map;
	}
	
	public void updatePropertiesFromCP(Map<String, String> map) throws Exception{
		final Properties properties = new Properties();
		try{
			FileOutputStream fos = new FileOutputStream ("c:/Temp/foo.properties", false);   
			for (Map.Entry<String, String> entry : map.entrySet()) {
				System.out.println("Key : " + entry.getKey() + " Value : "
					+ entry.getValue());
				properties.setProperty(entry.getKey(), entry.getValue());
			}
			properties.store(fos,null);
			fos.close();
			}catch(Exception ex){
			
		}
		
	}

	public Map<String, String> loadProps(HttpServletRequest request) throws Exception{
		Properties properties = new Properties();
		Map<String, String> map = new HashMap<String, String>();
		properties.load(request.getServletContext().getResourceAsStream("/WEB-INF/foo.properties"));
		for (final String name: properties.stringPropertyNames())
		    map.put(name, properties.getProperty(name));
		return map;
 	}
	
	public void saveProps(HttpServletRequest request, Map<String, String> map) throws Exception{		
		Properties properties = new Properties();
	try{
		FileOutputStream fos = new FileOutputStream (request.getServletContext().getRealPath("/WEB-INF/foo.properties"), false);   
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : "
				+ entry.getValue());
			properties.setProperty(entry.getKey(), entry.getValue());
		}
		properties.store(fos,null);
		fos.close();
		}catch(Exception ex){
		
	}
}
	
	
}

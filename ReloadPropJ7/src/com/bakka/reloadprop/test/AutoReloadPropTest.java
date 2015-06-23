/**
 * Reloadable properties test with JDK7.x
 */
package com.bakka.reloadprop.test;

import com.bakka.reloadprop.util.ApplicationConfiguration;
import com.bakka.reloadprop.util.ConfigurationChangeListner;

/**
 * @author SB
 *
 */
public class AutoReloadPropTest {

    private static final String FILE_PATH = "C:/MyLogs/sample.properties";
 
    public static void main(String[] args) {
        ConfigurationChangeListner listner = new ConfigurationChangeListner(
                FILE_PATH);
        try {
            new Thread(listner).start();
            while (true) {
                Thread.sleep(2000l);
                System.out.println(ApplicationConfiguration.getInstance()
                        .getConfiguration("TEST_KEY"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

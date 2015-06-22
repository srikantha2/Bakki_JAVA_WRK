import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

     
/**
 * Example class for Log4J1.2 XML Configuration
 * @author  SB
 */
public class HelloLog4J {                   
  
    private static final Logger LOGGER = (Logger) LogManager.getLogger(HelloLog4J.class.getName());
    public static void main(String a[]) {
        System.out.println("Log4j:Hello");
        LOGGER.debug("Logging Debug");
        LOGGER.info("Logging Info");
        
    }
}

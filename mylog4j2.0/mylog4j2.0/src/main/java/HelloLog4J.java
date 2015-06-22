import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
     
/**
 * Example class for Log4J XML Configuration
 * @author SB 
 */
public class HelloLog4J {                   
  
    private static final Logger LOGGER = (Logger) LogManager.getLogger(HelloLog4J.class.getName());
    public static void main(String a[]) {
        System.out.println("Log4J::HELLO");
        LOGGER.debug("Logging Debug");
        LOGGER.info("Logging Info");
        for(int i=0;i<1000;i++){
        
        	for(int ii=0;ii<1000;ii++){
            
        		for(int iii=0;iii<10000;iii++){
        			LOGGER.debug("Logging Debug");
                    LOGGER.info("Logging Info");
                }
        		
            }
        	
        }
        
    }
}

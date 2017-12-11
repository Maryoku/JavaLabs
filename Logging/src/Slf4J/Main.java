package Slf4J;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

        public static void main( String[] args )
        {
            Logger logger = LoggerFactory.getLogger(Main.class.getName());
            logger.info("This is how you configure Log4J with SLF4J");
        }
}

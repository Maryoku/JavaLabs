package Log4j;

import org.apache.log4j.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        for(int i = 0; i < 3; i++) {
            try {
                logger.info("result: " + divide(i));
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
            }
        }
    }

    public static int divide(int x) {
        logger.debug("divide method invoked; 2 / " + x);
        if(x == 0) {
            logger.warn("x = 0; exception may occur");
        }
        return 2 / x;
    }
}

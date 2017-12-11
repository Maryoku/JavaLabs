package util.logging;

import com.sun.glass.ui.Window;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        logger.log(Level.FINE, "Started with arguments: {0}", Arrays.toString(args));

        try {
            randomlyFailingAlgorithm();
        }
        catch (IllegalStateException e) {
            logger.log(Level.SEVERE, "Exception caught", e);
            System.exit(2);
        }

        logger.fine("Finished successfully");
    }

    private static void randomlyFailingAlgorithm() {
        double randomNum = Math.random();
        logger.log(Level.FINE, "Generated random number: {0}", randomNum);
        if (randomNum < 0.5) {
            throw new IllegalStateException("Invalid phase of the Moon");
        }
    }
}

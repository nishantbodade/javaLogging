import java.util.logging.Level;
import java.util.logging.Logger;

public class LogExample {

    private static final Logger LOGGER=Logger.getLogger(LogExample.class.getName());
    public static void main(String[] args) {
        LOGGER.log(Level.INFO,"this is an example message");

    }
}

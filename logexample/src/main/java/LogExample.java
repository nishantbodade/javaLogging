import java.io.IOException;
import java.util.logging.*;

public class LogExample {

    private static final Logger LOGGER=Logger.getLogger(LogExample.class.getName());

    static
    {
        LOGGER.setLevel(Level.FINEST);
        FileHandler fileHandler= null;
        try {
            fileHandler = new FileHandler(LogExample.class.getName()+".log");
            fileHandler.setFormatter(new SimpleFormatter());
            fileHandler.setLevel(Level.FINEST);
        } catch (IOException e) {
            e.printStackTrace();
        }

        LOGGER.addHandler(fileHandler);

    }
    public static void main(String[] args) {

        LOGGER.log(Level.FINEST,"this is an example message");


    }
}

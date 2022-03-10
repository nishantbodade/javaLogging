import utils.LoggingUtil;

import java.io.IOException;
import java.util.logging.*;

public class LogExample {


    private static final Logger LOGGER=Logger.getLogger(LogExample.class.getName());



    public static void main(String[] args) throws  IOException{
        LoggingUtil.initLogManager();

        LOGGER.log(Level.INFO,"this is an example message");


    }
}

package algoimpl.logger;

import algoimpl.logger.enums.LogLevel;
import algoimpl.logger.model.FileLogConfig;
import algoimpl.logger.model.LogConfig;
import algoimpl.logger.model.LogEvent;

import java.util.Properties;

/**
 * @author nishika.garg
 */
public class ConsoleLogger extends Logger {

    public ConsoleLogger(Properties properties){
        this.namespace = "";
    }



    @Override
    public void log(LogLevel level, String message, Class clazz) {

        System.out.println(new LogEvent(level, message, clazz.getName()));
    }
}

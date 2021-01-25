package algoimpl.logger;


import algoimpl.logger.enums.LogLevel;
import algoimpl.logger.model.FileLogConfig;
import algoimpl.logger.model.LogConfig;
import algoimpl.logger.model.LogEvent;

import java.util.Properties;

/**
 * @author nishika.garg
 */
public class FileLogger extends Logger {

    private LogConfig config;

    public FileLogger(Properties properties){
        this.namespace = "";
        this.config = new FileLogConfig(properties);
    }

    @Override
    public void log(LogLevel logLevel, String message, Class clazz) {
        LogLevel configLevel = LogLevel.getLogEvent(config.getLogLevel());

        if (configLevel.getPriority()>logLevel.getPriority()){
            return;
        }

        LogEvent msg = new LogEvent(logLevel, message, clazz.getName());
        System.out.println(msg.toString());

        // store in file

    }
}

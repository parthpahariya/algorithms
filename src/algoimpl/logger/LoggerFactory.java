package algoimpl.logger;

import algoimpl.logger.enums.SinkType;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author nishika.garg
 */
public class LoggerFactory {
    static Map<String, Logger> loggers = new HashMap<>();

    //TODO initialise MAp while reading config
    static {
//        readConfigFile("log-config.config");
        Properties properties = null;
        String sinkType = "FILE";
        SinkType senum = SinkType.getSinkType(sinkType);
        switch (senum){
            case FILE:
                loggers.put("one", new FileLogger(properties));
                break;
            default:
                loggers.put("one", new ConsoleLogger(properties));
                break;
        }
    }

    public static Logger getLogger(String namespace){
        return loggers.get(namespace);
    }
}

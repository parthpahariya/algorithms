package algoimpl.logger;

import algoimpl.logger.enums.LogLevel;

/**
 * @author nishika.garg
 */
public interface ILogger {
    void log(LogLevel level, String message, Class clazz);
}

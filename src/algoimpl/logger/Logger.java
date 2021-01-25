package algoimpl.logger;

import algoimpl.logger.enums.LogLevel;

/**
 * @author nishika.garg
 */
public abstract class Logger implements ILogger{

    protected String namespace;

    @Override
    public void log(LogLevel level, String message, Class clazz) {
        //todo get sinkType from config using my level
        //todo get my logger from sink and level mapping
        //logger.log();

    }



}

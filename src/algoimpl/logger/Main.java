package algoimpl.logger;

import algoimpl.logger.enums.LogLevel;

/**
 * @author nishika.garg
 */
public class Main {
    public static void main(String[] args) {
        ILogger logger = LoggerFactory.getLogger("one");
        logger.log(LogLevel.INFO,"My first logger", Main.class);
    }
}

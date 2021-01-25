package algoimpl.logger.enums;

import java.util.Arrays;

/**
 * @author nishika.garg
 */
public enum LogLevel {
    FATAL(5),
    ERROR(4),
    WARN(3),
    INFO(2),
    DEBUG(1)

    ;

    int priority;

    LogLevel(int priority) {
        this.priority = priority;
    }

    /**
     * Getter method for property <tt>priority</tt>.
     *
     * @return property value of priority
     */
    public int getPriority() {
        return priority;
    }

    public static LogLevel getLogEvent(String level){
        return Arrays.stream(LogLevel.values()).filter(x->x.name().equals(level)).findFirst().orElse(INFO);
    }
}

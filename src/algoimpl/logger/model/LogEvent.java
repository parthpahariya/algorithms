package algoimpl.logger.model;


import algoimpl.logger.enums.LogLevel;

import java.util.Date;

/**
 * @author nishika.garg
 */
public class LogEvent {
    private LogLevel level;
    private String message;
    private String timestamp;
    private String namespace;


    public LogEvent(LogLevel level, String message, String namespace) {
        this.level = level;
        this.message = message;
        this.timestamp = String.valueOf(new Date());
        this.namespace = namespace;
    }

    public LogLevel getLevel() {
        return level;
    }

    public void setLevel(LogLevel level) {
        this.level = level;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LogEvent{");
        sb.append("level=").append(level);
        sb.append(", message='").append(message).append('\'');
        sb.append(", timestamp='").append(timestamp).append('\'');
        sb.append(", namespace='").append(namespace).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

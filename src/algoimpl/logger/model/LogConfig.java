package algoimpl.logger.model;

import java.util.Properties;

/**
 * @author nishika.garg
 */
public class LogConfig {
    private String timeFormat;
    private String logLevel;
    private String sinkType;
    private String threadModel;
    private String writeMode;

    protected LogConfig(Properties properties){
        this.timeFormat = properties.getProperty("ts_format");
        this.logLevel = properties.getProperty("log_level");
        this.sinkType = properties.getProperty("sink_type");
        this.threadModel = properties.getProperty("thread_model");
        this.writeMode = properties.getProperty("write_mode");
    }


    /**
     * Getter method for property <tt>timeFormat</tt>.
     *
     * @return property value of timeFormat
     */
    public String getTimeFormat() {
        return timeFormat;
    }

    /**
     * Getter method for property <tt>logLevel</tt>.
     *
     * @return property value of logLevel
     */
    public String getLogLevel() {
        return logLevel;
    }


    /**
     * Getter method for property <tt>sinkType</tt>.
     *
     * @return property value of sinkType
     */
    public String getSinkType() {
        return sinkType;
    }

    /**
     * Getter method for property <tt>threadModel</tt>.
     *
     * @return property value of threadModel
     */
    public String getThreadModel() {
        return threadModel;
    }

    /**
     * Getter method for property <tt>writeMode</tt>.
     *
     * @return property value of writeMode
     */
    public String getWriteMode() {
        return writeMode;
    }
}

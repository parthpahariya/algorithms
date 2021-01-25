package algoimpl.logger.model;

import java.util.Properties;

/**
 * @author nishika.garg
 */
public class FileLogConfig extends LogConfig {

    private String fileLocation;

    public FileLogConfig(Properties properties){
        super(properties);
        this.fileLocation = properties.getProperty("file_location");

    }

    /**
     * Getter method for property <tt>fileLocation</tt>.
     *
     * @return property value of fileLocation
     */
    public String getFileLocation() {
        return fileLocation;
    }

}

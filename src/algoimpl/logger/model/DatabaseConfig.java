package algoimpl.logger.model;

import java.util.Properties;

public class DatabaseConfig extends LogConfig{

    private String dbHost;
    private String dbPort;


    public DatabaseConfig(Properties properties){
        super(properties);
        this.dbHost = properties.getProperty("dbhost");
        this.dbPort = properties.getProperty("dbport");

    }

    /**
     * Getter method for property <tt>dbHost</tt>.
     *
     * @return property value of dbHost
     */
    public String getDbHost() {
        return dbHost;
    }

    /**
     * Getter method for property <tt>dbPort</tt>.
     *
     * @return property value of dbPort
     */
    public String getDbPort() {
        return dbPort;
    }
}

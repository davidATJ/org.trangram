package org.trangram.config;

/**
 * project : org.trangram
 * author :  liyuqi
 * date : 2017-05-03 13:29
 */
public class JDBCConnectionConfiguration extends PropertyHolder {

    private String driverClass;

    private String connectionURL;

    private String userId;

    private String password;

    public JDBCConnectionConfiguration() {
        super();
    }

    public String getDriverClass() {
        return driverClass;
    }

    public void setDriverClass(String driverClass) {
        this.driverClass = driverClass;
    }

    public String getConnectionURL() {
        return connectionURL;
    }

    public void setConnectionURL(String connectionURL) {
        this.connectionURL = connectionURL;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

package com.home.tut.springpropconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
@ConfigurationProperties("db")
public class DbConfigBean {

    private String connection;
    private String hostOne;
    private int portTwo;

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public String getHostOne() {
        return hostOne;
    }

    public void setHostOne(String hostOne) {
        this.hostOne = hostOne;
    }

    public int getPortTwo() {
        return portTwo;
    }

    public void setPortTwo(int portTwo) {
        this.portTwo = portTwo;
    }

    @Override
    public String toString() {
        return "DbConfigBean{" +
                "connection='" + connection + '\'' +
                ", hostOne='" + hostOne + '\'' +
                ", portTwo=" + portTwo +
                '}';
    }
}

package io.properties;

import lombok.*;

import java.util.Properties;

@Data
@ToString
public class AppConfig {

    public static Properties properties = new Properties();

    static {
        try{
            properties.load(AppConfig.class.getResourceAsStream("app-config.properties"));
        }catch (Exception e) {
            System.err.println("appConfig load error");
            e.printStackTrace();
        }
    }

    public static final String URL = properties.getProperty("url");
    public static final String DRIVER_CLASS_NAME = properties.getProperty("driverClassName");
    public static final String NAME = properties.getProperty("name");
    public static final String PWD = properties.getProperty("pwd");




    public static void show() {

        System.out.println("URL : " + URL);
        System.out.println("DRIVER_CLASS_NAME : " + DRIVER_CLASS_NAME);
        System.out.println("NAME : " + NAME);
        System.out.println("PWD : " + PWD);

    }




}

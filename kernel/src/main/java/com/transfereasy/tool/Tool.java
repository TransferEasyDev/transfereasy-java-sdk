package main.java.com.transfereasy.tool;

import main.java.com.transfereasy.api.Request;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Tool {
    private static Properties getProp() throws IOException{
        Properties props = new Properties();
        InputStream config = Request.class.getResourceAsStream("../resources/config.properties");
        props.load(config);
        config.close();
        return props;
    }
    public static String getHost() throws IOException {
        Properties props = Tool.getProp();
        return props.getProperty("TE_HOST");
    }

    public static String getAccountNo() throws IOException {
        Properties props = Tool.getProp();
        return props.getProperty("ACCOUNT_NO");
    }

    public static String getSecret() throws IOException {
        Properties props = Tool.getProp();
        return props.getProperty("SECRET");
    }

    public static String getPublicKey() throws IOException {
        Properties props = Tool.getProp();
        String key_path = props.getProperty("PUBLIC_KEY_PATH");

        FileInputStream inputStream = new FileInputStream(key_path);
        byte[] keyBytes = new byte[inputStream.available()];
        int i = inputStream.read(keyBytes);
        inputStream.close();
        return new String(keyBytes, "UTF-8");

    }



}

package main.java.com.transfereasy.api;

import main.java.com.transfereasy.tool.Tool;
import org.apache.http.NameValuePair;

import java.io.*;
import java.util.List;


public class Statement {
    public String download(List<NameValuePair> params) throws IOException {
        Request re = new Request();
        return re.requestGet(Tool.getHost() + "/statement", params, "./statement.csv");
    }
}

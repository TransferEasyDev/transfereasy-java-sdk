package main.java.com.transfereasy.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import main.java.com.transfereasy.entity.rate.Response;
import main.java.com.transfereasy.tool.Tool;
import org.apache.http.NameValuePair;

import java.io.IOException;
import java.util.List;

public class Rate {
    public Response getRate(List<NameValuePair> params) throws IOException {
        Request re = new Request();
        String msg = re.requestGet(Tool.getHost() + "/rate", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, Response.class);
    }
}

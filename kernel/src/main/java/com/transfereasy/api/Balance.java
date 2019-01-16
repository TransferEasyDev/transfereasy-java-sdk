package main.java.com.transfereasy.api;

import main.java.com.transfereasy.entity.balance.Response;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import main.java.com.transfereasy.tool.Tool;
import org.apache.http.NameValuePair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Balance {
    public Response getBalance() throws IOException {
        Request re = new Request();

        List<NameValuePair> params = new ArrayList<NameValuePair>();

        String msg = re.requestGet(Tool.getHost() + "/account/wallet/balance", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, Response.class);
    }

}

package main.java.com.transfereasy.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import main.java.com.transfereasy.entity.exchange.Response;
import main.java.com.transfereasy.entity.exchange.ListResponse;
import main.java.com.transfereasy.tool.Tool;
import org.apache.http.NameValuePair;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;

public class Exchange {
    public Response enquiry(JSONObject params) throws IOException {
        Request re = new Request();

        String msg = re.requestPost(Tool.getHost() + "/exchange/enquiry", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, Response.class);
    }

    public Response createExchange(JSONObject params) throws IOException {
        Request re = new Request();

        String msg = re.requestPost(Tool.getHost() + "/exchange", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, Response.class);
    }

    public Response payment(List<NameValuePair> params) throws IOException {
        Request re = new Request();

        String msg = re.requestPost(Tool.getHost() + "/exchange/payment", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, Response.class);
    }

    public Response getExchange(List<NameValuePair> params) throws IOException {
        Request re = new Request();

        String msg = re.requestGet(Tool.getHost() + "/exchange", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, Response.class);
    }

    public ListResponse getExchanges(List<NameValuePair> params) throws IOException {
        Request re = new Request();

        String msg = re.requestGet(Tool.getHost() + "/exchanges", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, ListResponse.class);
    }

}


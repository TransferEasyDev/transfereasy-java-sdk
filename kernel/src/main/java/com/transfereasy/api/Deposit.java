package main.java.com.transfereasy.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import main.java.com.transfereasy.entity.deposit.Response;
import main.java.com.transfereasy.entity.deposit.ListResponse;
import main.java.com.transfereasy.tool.Tool;
import org.apache.http.NameValuePair;

import java.io.IOException;
import java.util.List;

public class Deposit {
    public Response createDeposit(List<NameValuePair> params) throws IOException {
        Request re = new Request();

        String msg = re.requestPost(Tool.getHost() + "/deposit", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, Response.class);
    }

    public Response getDeposit(List<NameValuePair> params) throws IOException {
        Request re = new Request();

        String msg = re.requestGet(Tool.getHost() + "/deposit", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, Response.class);
    }

    public ListResponse getDeposits(List<NameValuePair> params) throws IOException {
        Request re = new Request();

        String msg = re.requestGet(Tool.getHost() + "/deposits", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, ListResponse.class);
    }

    public Response cancelDeposit(List<NameValuePair> params) throws IOException {
        Request re = new Request();

        String msg = re.requestDelete(Tool.getHost() + "/deposit", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, Response.class);
    }

}

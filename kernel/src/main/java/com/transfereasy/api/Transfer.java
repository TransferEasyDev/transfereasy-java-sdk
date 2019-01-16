package main.java.com.transfereasy.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import main.java.com.transfereasy.entity.transfer.ListResponse;
import main.java.com.transfereasy.entity.transfer.Response;
import main.java.com.transfereasy.tool.Tool;
import org.apache.http.NameValuePair;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;

public class Transfer {
    public Response enquiry(JSONObject params) throws IOException {
        Request re = new Request();

        String msg = re.requestPost(Tool.getHost() + "/transfer/enquiry", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, Response.class);
    }

    public Response createTransfer(JSONObject params) throws IOException {
        Request re = new Request();

        String msg = re.requestPost(Tool.getHost() + "/transfer", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, Response.class);
    }

    public Response payment(List<NameValuePair> params) throws IOException {
        Request re = new Request();

        String msg = re.requestPost(Tool.getHost() + "/transfer/payment", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, Response.class);
    }

    public Response getTransfer(List<NameValuePair> params) throws IOException {
        Request re = new Request();

        String msg = re.requestGet(Tool.getHost() + "/transfer", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, Response.class);
    }

    public ListResponse getTransfers(List<NameValuePair> params) throws IOException {
        Request re = new Request();

        String msg = re.requestGet(Tool.getHost() + "/transfers", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, ListResponse.class);
    }

    public Response repetitionTransfer(List<NameValuePair> params) throws IOException {
        Request re = new Request();

        String msg = re.requestPost(Tool.getHost() + "/transfer/repetition", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, Response.class);
    }

    public Response cancelTransfer(List<NameValuePair> params) throws IOException {
        Request re = new Request();

        String msg = re.requestDelete(Tool.getHost() + "/transfer", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, Response.class);
    }

}

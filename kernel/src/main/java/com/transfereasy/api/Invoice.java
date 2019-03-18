package main.java.com.transfereasy.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import main.java.com.transfereasy.entity.invoice.ListResponse;
import main.java.com.transfereasy.entity.invoice.Response;
import main.java.com.transfereasy.tool.Tool;
import org.apache.http.NameValuePair;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;

public class Invoice {
    public Response createInvoice(JSONObject params) throws IOException {
        Request re = new Request();

        String msg = re.requestPost(Tool.getHost() + "/invoice", params);
        System.out.println(msg);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, Response.class);
    }

    public Response updateInvoice(JSONObject params) throws IOException {
        Request re = new Request();

        String msg = re.requestPut(Tool.getHost() + "/invoice", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, Response.class);
    }

    public Response getInvoice(List<NameValuePair> params) throws IOException {
        Request re = new Request();

        String msg = re.requestGet(Tool.getHost() + "/invoice", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, Response.class);
    }

    public ListResponse getInvoices(List<NameValuePair> params) throws IOException {
        Request re = new Request();

        String msg = re.requestGet(Tool.getHost() + "/invoices", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, ListResponse.class);
    }

    public Response cancelInvoice(List<NameValuePair> params) throws IOException {
        Request re = new Request();

        String msg = re.requestDelete(Tool.getHost() + "/invoice", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, Response.class);
    }


}

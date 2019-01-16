package main.java.com.transfereasy.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import main.java.com.transfereasy.entity.iat.ListResponse;
import main.java.com.transfereasy.entity.iat.Response;
import main.java.com.transfereasy.tool.Tool;
import org.apache.http.NameValuePair;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;

public class IAT {
    public Response createIat(JSONObject params) throws IOException {
        Request re = new Request();

        String msg = re.requestPost(Tool.getHost() + "/iat", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, Response.class);
    }

    public Response repetitionIat(List<NameValuePair> params) throws IOException {
        Request re = new Request();

        String msg = re.requestPost(Tool.getHost() + "/iat/repetition", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, Response.class);
    }

    public Response getIat(List<NameValuePair> params) throws IOException {
        Request re = new Request();

        String msg = re.requestGet(Tool.getHost() + "/iat", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, Response.class);
    }

    public ListResponse getIats(List<NameValuePair> params) throws IOException {
        Request re = new Request();

        String msg = re.requestGet(Tool.getHost() + "/iats", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, ListResponse.class);
    }


}

package main.java.com.transfereasy.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import main.java.com.transfereasy.entity.bankaccount.Response;
import main.java.com.transfereasy.entity.bankaccount.ListResponse;
import main.java.com.transfereasy.tool.Tool;

import java.io.IOException;
import java.util.List;

import org.apache.http.NameValuePair;
import org.json.JSONArray;
import org.json.JSONObject;


public class BankAccount {
    public Response createBankAccount(JSONObject params) throws IOException {
        Request re = new Request();

        String msg = re.requestPost(Tool.getHost() + "/account/bank_account", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, Response.class);

    }

    public ListResponse createBankAccounts(JSONArray params) throws IOException {
        Request re = new Request();

        String msg = re.requestPost(Tool.getHost() + "/account/bank_accounts", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, ListResponse.class);

    }

    public Response getBankAccount(List<NameValuePair> params) throws IOException {
        Request re = new Request();
        String msg = re.requestGet(Tool.getHost() + "/account/bank_account", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, Response.class);
    }

    public ListResponse getBankAccounts(List<NameValuePair> params) throws IOException {
        Request re = new Request();
        String msg = re.requestGet(Tool.getHost() + "/account/bank_accounts", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, ListResponse.class);
    }

}

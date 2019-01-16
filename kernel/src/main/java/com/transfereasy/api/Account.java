package main.java.com.transfereasy.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import main.java.com.transfereasy.entity.account.AccountResponse;
import main.java.com.transfereasy.entity.account.CompanyDocResponse;
import main.java.com.transfereasy.entity.account.IndividualDocResponse;
import main.java.com.transfereasy.tool.Tool;
import org.apache.http.NameValuePair;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.io.IOException;
import java.util.List;

public class Account {

    // 账号增查
    public AccountResponse createAccount(List<NameValuePair> params) throws IOException {
        Request re = new Request();
        String msg = re.requestPostWithoutToken(Tool.getHost() + "/account", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, AccountResponse.class);
    }

    public AccountResponse getAccount(List<NameValuePair> params) throws IOException {
        Request re = new Request();
        String msg = re.requestGet(Tool.getHost() + "/account", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, AccountResponse.class);

    }

    // 认证
    public CompanyDocResponse companyIdentification(MultipartEntityBuilder params) throws IOException {
        Request re = new Request();
        String msg = re.requestPost(Tool.getHost() + "/account/company/identification", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, CompanyDocResponse.class);
    }

    public CompanyDocResponse companyReidentification(MultipartEntityBuilder params) throws IOException {
        Request re = new Request();
        String msg = re.requestPut(Tool.getHost() + "/account/company/identification", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, CompanyDocResponse.class);
    }

    public IndividualDocResponse individualIdentification(MultipartEntityBuilder params) throws IOException {
        Request re = new Request();
        String msg = re.requestPost(Tool.getHost() + "/account/individual/identification", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, IndividualDocResponse.class);
    }

    public IndividualDocResponse individualReidentification(MultipartEntityBuilder params) throws IOException {
        Request re = new Request();
        String msg = re.requestPut(Tool.getHost() + "/account/individual/identification", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, IndividualDocResponse.class);
    }

}


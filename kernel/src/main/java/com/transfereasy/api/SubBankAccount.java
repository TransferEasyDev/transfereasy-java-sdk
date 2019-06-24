package main.java.com.transfereasy.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import main.java.com.transfereasy.entity.subBankaccount.ApplyResponse;
import main.java.com.transfereasy.entity.subBankaccount.ProgressResponse;
import main.java.com.transfereasy.entity.subBankaccount.TransactionResponse;
import main.java.com.transfereasy.tool.Tool;
import org.apache.http.NameValuePair;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;

public class SubBankAccount {

    public ApplyResponse createSubBankAccount(JSONObject params) throws IOException {
        Request re = new Request();
        String msg = re.requestPost(Tool.getHost() + "/account/company/sub_bank_account", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, ApplyResponse.class);
    }

    public ApplyResponse updateSubBankAccount(JSONObject params) throws IOException {
        Request re = new Request();
        String msg = re.requestPut(Tool.getHost() + "/account/company/sub_bank_account", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, ApplyResponse.class);
    }

//    // 企业身份申请
//    public ApplyResponse comCreateSubBankAccount(MultipartEntityBuilder params) throws IOException {
//        Request re = new Request();
//        String msg = re.requestPost(Tool.getHost() + "/account/company/sub_bank_account", params);
//        Gson gson = new GsonBuilder().create();
//        return gson.fromJson(msg, ApplyResponse.class);
//    }
//
//    public ApplyResponse comUpdateSubBankAccount(MultipartEntityBuilder params) throws IOException {
//        Request re = new Request();
//        String msg = re.requestPut(Tool.getHost() + "/account/company/sub_bank_account", params);
//        Gson gson = new GsonBuilder().create();
//        return gson.fromJson(msg, ApplyResponse.class);
//    }
//
//    // 个人身份申请
//    public ApplyResponse indCreateSubBankAccount(MultipartEntityBuilder params) throws IOException {
//        Request re = new Request();
//        String msg = re.requestPost(Tool.getHost() + "/account/individual/sub_bank_account", params);
//        Gson gson = new GsonBuilder().create();
//        return gson.fromJson(msg, ApplyResponse.class);
//    }
//
//    public ApplyResponse indUpdateSubBankAccount(MultipartEntityBuilder params) throws IOException {
//        Request re = new Request();
//        String msg = re.requestPut(Tool.getHost() + "/account/individual/sub_bank_account", params);
//        Gson gson = new GsonBuilder().create();
//        return gson.fromJson(msg, ApplyResponse.class);
//    }

    // 查询申请进度
    public ProgressResponse GetProgress(List<NameValuePair> params) throws IOException {
        Request re = new Request();
        String msg = re.requestGet(Tool.getHost() + "/account/sub_bank_account/progress", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, ProgressResponse.class);
    }

    // 查询交易
    public TransactionResponse GetTransactions(List<NameValuePair> params) throws IOException {
        Request re = new Request();
        String msg = re.requestGet(Tool.getHost() + "/account/sub_bank_account/transactions", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, TransactionResponse.class);
    }
}

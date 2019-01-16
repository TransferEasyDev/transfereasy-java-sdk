package main.java.com.transfereasy.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import main.java.com.transfereasy.entity.others.EscrowAccountsResponse;
import main.java.com.transfereasy.entity.others.EvidenceResponse;
import main.java.com.transfereasy.tool.Tool;
import org.apache.http.NameValuePair;

import java.io.IOException;
import java.util.List;

public class Others {

    public EscrowAccountsResponse escrowAccounts(List<NameValuePair> params) throws IOException {
        Request re = new Request();
        String msg = re.requestGet(Tool.getHost() + "/escrow_accounts", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, EscrowAccountsResponse.class);
    }

    public EvidenceResponse Evidence(List<NameValuePair> params) throws IOException {
        Request re = new Request();
        String msg = re.requestPost(Tool.getHost() + "/evidence", params);
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(msg, EvidenceResponse.class);
    }
}

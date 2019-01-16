package main.java.com.transfereasy.example.subBankaccount;

import main.java.com.transfereasy.api.SubBankAccount;
import main.java.com.transfereasy.entity.subBankaccount.ProgressResponse;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GetProgress {
    public static void main(String[] args) throws IOException {
        SubBankAccount sbacc = new SubBankAccount();
        List<NameValuePair> params = new ArrayList<NameValuePair>();

        params.add(new BasicNameValuePair("apply_no", "apply_no"));

        ProgressResponse response = sbacc.GetProgress(params);
        System.out.println("======response结果=======");
        System.out.println(response.getData());
        System.out.println(response.getMeta());

    }
}
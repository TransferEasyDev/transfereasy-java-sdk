package main.java.com.transfereasy.example.account;

import main.java.com.transfereasy.api.Account;
import main.java.com.transfereasy.entity.account.AccountResponse;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreateAccount {
    public static void main(String[] args) throws IOException {
        Account acc = new Account();
        List<NameValuePair> params = new ArrayList<NameValuePair>();

//        params.add(new BasicNameValuePair("account", "example@test.com"));
        params.add(new BasicNameValuePair("account", "7@3.com"));
        params.add(new BasicNameValuePair("password", "your_password"));
//        params.add(new BasicNameValuePair("entity_type", "COMPANY"));
        params.add(new BasicNameValuePair("entity_type", "INDIVIDUAL"));
        params.add(new BasicNameValuePair("secret", "your_secret"));
//        params.add(new BasicNameValuePair("partner", "your_partner_tag"));
        params.add(new BasicNameValuePair("partner", "your_partner_id"));
        params.add(new BasicNameValuePair("callback_url", "http://your_callback_url"));

        AccountResponse response = acc.createAccount(params);
        System.out.println("======response结果=======");
        System.out.println(response.getData());
        System.out.println(response.getMeta());
    }
}

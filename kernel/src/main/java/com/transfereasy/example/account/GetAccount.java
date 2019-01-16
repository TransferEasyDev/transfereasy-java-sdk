package main.java.com.transfereasy.example.account;

import main.java.com.transfereasy.api.Account;
import main.java.com.transfereasy.entity.account.AccountResponse;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GetAccount {
    public static void main(String[] args) throws IOException {
        Account acc = new Account();
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        AccountResponse response = acc.getAccount(params);
        System.out.println("======response结果=======");
        System.out.println(response.getData());
        System.out.println(response.getMeta());
    }
}

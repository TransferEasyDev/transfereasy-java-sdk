package main.java.com.transfereasy.example.bankaccount;

import main.java.com.transfereasy.api.BankAccount;
import main.java.com.transfereasy.entity.bankaccount.ListResponse;
import org.apache.http.NameValuePair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GetBankAccounts {
    public static void main(String[] args) throws IOException {
        BankAccount api = new BankAccount();

        List<NameValuePair> params = new ArrayList<NameValuePair>();
//        params.add(new BasicNameValuePair("purpose", "PAYER"));
//        params.add(new BasicNameValuePair("status", "PENDING"));

        ListResponse response = api.getBankAccounts(params);
        System.out.println("======response结果=======");
        System.out.println(response.getData());
        System.out.println(response.getMeta());

    }
}

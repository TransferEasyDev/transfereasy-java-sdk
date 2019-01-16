package main.java.com.transfereasy.example.subBankaccount;

import main.java.com.transfereasy.api.SubBankAccount;
import main.java.com.transfereasy.entity.subBankaccount.TransactionResponse;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GetTransactions {
    public static void main(String[] args) throws IOException {
        SubBankAccount sbacc = new SubBankAccount();
        List<NameValuePair> params = new ArrayList<NameValuePair>();

        params.add(new BasicNameValuePair("sub_bank_account_number", "sub_bank_account_number"));
        params.add(new BasicNameValuePair("from_created_at", "2019-01-01"));
        params.add(new BasicNameValuePair("to_created_at", "2019-02-01"));

        TransactionResponse response = sbacc.GetTransactions(params);
        System.out.println("======response结果=======");
        System.out.println(response.getData());
        System.out.println(response.getMeta());

    }
}
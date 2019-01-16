package main.java.com.transfereasy.example.bankaccount;

import main.java.com.transfereasy.api.BankAccount;
import main.java.com.transfereasy.entity.bankaccount.Response;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GetBankAccount {
    public static void main(String[] args) throws IOException {
        BankAccount api = new BankAccount();

        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("bank_account_number", "TEST-666"));
        params.add(new BasicNameValuePair("purpose", "PAYER"));
        params.add(new BasicNameValuePair("currency", "HKD"));

        Response response = api.getBankAccount(params);
        System.out.println("======response结果=======");
        System.out.println(response.getData());
        System.out.println(response.getMeta());

    }
}

package main.java.com.transfereasy.example.deposit;

import main.java.com.transfereasy.api.Deposit;
import main.java.com.transfereasy.entity.deposit.Response;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreateDeposit {
    public static void main(String[] args) throws IOException {
        Deposit api = new Deposit();

        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("currency", "HKD"));
        params.add(new BasicNameValuePair("amount", "1000000"));
        params.add(new BasicNameValuePair("payer_bank_acc_number", "TEST-666"));
//        params.add(new BasicNameValuePair("payer_bank_acc_no", ""));
        params.add(new BasicNameValuePair("escrow_bank_acc_number", "20143304"));
//        params.add(new BasicNameValuePair("out_trade_id", "your_trade_id"));

        Response response = api.createDeposit(params);
        System.out.println("======response结果=======");
        System.out.println(response.getData());
        System.out.println(response.getMeta());

    }

}

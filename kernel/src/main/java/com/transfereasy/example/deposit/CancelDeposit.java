package main.java.com.transfereasy.example.deposit;

import main.java.com.transfereasy.api.Deposit;
import main.java.com.transfereasy.entity.deposit.Response;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CancelDeposit {
    public static void main(String[] args) throws IOException {
        Deposit api = new Deposit();

        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("no", "deposit_no"));
//        params.add(new BasicNameValuePair("out_trade_id", "your_trade_id"));

        Response response = api.cancelDeposit(params);
        System.out.println("======response结果=======");
        System.out.println(response.getData());
        System.out.println(response.getMeta());

    }
}

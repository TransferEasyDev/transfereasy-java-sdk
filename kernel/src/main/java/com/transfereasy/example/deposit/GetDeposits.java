package main.java.com.transfereasy.example.deposit;

import main.java.com.transfereasy.api.Deposit;
import main.java.com.transfereasy.entity.deposit.ListResponse;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public class GetDeposits {
    public static void main(String[] args) throws IOException {
        Deposit api = new Deposit();

        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("from_created_at", URLEncoder.encode("2018-10-01 00:00:00", "UTF-8")));
        params.add(new BasicNameValuePair("to_created_at", URLEncoder.encode("2018-10-30 23:59:59", "UTF-8")));
        params.add(new BasicNameValuePair("currency", "HKD"));
        params.add(new BasicNameValuePair("status", "CANCELED"));

        ListResponse response = api.getDeposits(params);
        System.out.println("======response结果=======");
        System.out.println(response.getData());
        System.out.println(response.getMeta());

    }

}

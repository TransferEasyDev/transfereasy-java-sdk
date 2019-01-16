package main.java.com.transfereasy.example.transfer;

import main.java.com.transfereasy.api.Transfer;
import main.java.com.transfereasy.entity.transfer.ListResponse;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public class GetTransfers {
    public static void main(String[] args) throws IOException {
        Transfer api = new Transfer();

        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("from_created_at", URLEncoder.encode("2018-10-01 00:00:00", "UTF-8")));
        params.add(new BasicNameValuePair("to_created_at", URLEncoder.encode("2018-10-30 23:59:59", "UTF-8")));
        params.add(new BasicNameValuePair("sell_currency", "CNH"));
        params.add(new BasicNameValuePair("buy_currency", "USD"));
        params.add(new BasicNameValuePair("status", "RISK"));

        ListResponse response = api.getTransfers(params);
        System.out.println("======response结果=======");
        System.out.println(response.getData());
        System.out.println(response.getMeta());

    }
}

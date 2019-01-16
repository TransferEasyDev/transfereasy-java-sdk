package main.java.com.transfereasy.example.exchange;

import main.java.com.transfereasy.api.Exchange;
import main.java.com.transfereasy.entity.exchange.ListResponse;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public class GetExchanges {
    public static void main(String[] args) throws IOException {
        Exchange api = new Exchange();

        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("from_created_at", URLEncoder.encode("2018-11-01 00:00:00", "UTF-8")));
        params.add(new BasicNameValuePair("to_created_at", URLEncoder.encode("2018-11-30 23:59:59", "UTF-8")));
        params.add(new BasicNameValuePair("sell_currency", "CNH"));
        params.add(new BasicNameValuePair("buy_currency", "USD"));
        params.add(new BasicNameValuePair("status", "PAYMENT"));

        ListResponse response = api.getExchanges(params);
        System.out.println("======response结果=======");
        System.out.println(response.getData());
        System.out.println(response.getMeta());

    }
}

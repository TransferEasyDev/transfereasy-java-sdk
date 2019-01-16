package main.java.com.transfereasy.example.rate;

import main.java.com.transfereasy.api.Rate;
import main.java.com.transfereasy.entity.rate.Response;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GetRate {
    public static void main(String[] args) throws IOException {
        Rate api = new Rate();
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("sell_currency", "USD"));
        params.add(new BasicNameValuePair("buy_currency", "CNY"));

        Response response = api.getRate(params);
        System.out.println("======response结果=======");
        System.out.println(response.getData());
        System.out.println(response.getMeta());

    }
}

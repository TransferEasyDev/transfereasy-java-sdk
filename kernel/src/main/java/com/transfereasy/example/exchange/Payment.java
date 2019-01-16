package main.java.com.transfereasy.example.exchange;

import main.java.com.transfereasy.api.Exchange;
import main.java.com.transfereasy.entity.exchange.Response;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Payment {
    public static void main(String[] args) throws IOException {
        Exchange api = new Exchange();

        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("no", "exchange_no"));

        Response response = api.payment(params);
        System.out.println("======response结果=======");
        System.out.println(response.getData());
        System.out.println(response.getMeta());

    }
}

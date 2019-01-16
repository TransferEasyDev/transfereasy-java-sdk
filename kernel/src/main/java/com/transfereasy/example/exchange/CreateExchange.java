package main.java.com.transfereasy.example.exchange;

import main.java.com.transfereasy.api.Exchange;
import main.java.com.transfereasy.entity.exchange.Response;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class CreateExchange {
    public static void main(String[] args) throws IOException, JSONException {
        Exchange api = new Exchange();

        JSONObject jo = new JSONObject();

        jo.put("buy_amount", 0);
        jo.put("buy_currency", "USD");
        jo.put("sell_currency", "CNH");
        jo.put("sell_amount", 1000);

        Response response = api.createExchange(jo);
        System.out.println("======response结果=======");
        System.out.println(response.getData());
        System.out.println(response.getMeta());

    }
}

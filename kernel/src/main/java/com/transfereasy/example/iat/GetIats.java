package main.java.com.transfereasy.example.iat;

import main.java.com.transfereasy.api.IAT;
import main.java.com.transfereasy.entity.iat.ListResponse;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public class GetIats {
    public static void main(String[] args) throws IOException {
        IAT api = new IAT();

        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("from_created_at", URLEncoder.encode("2018-10-01 00:00:00", "UTF-8")));
        params.add(new BasicNameValuePair("to_created_at", URLEncoder.encode("2018-10-31 23:59:59", "UTF-8")));
        params.add(new BasicNameValuePair("send_currency", "USD"));

        ListResponse response = api.getIats(params);
        System.out.println("======response结果=======");
        System.out.println(response.getData());
        System.out.println(response.getMeta());
    }
}

package main.java.com.transfereasy.example.iat;

import main.java.com.transfereasy.api.IAT;
import main.java.com.transfereasy.entity.iat.Response;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GetIat {
    public static void main(String[] args) throws IOException {
        IAT api = new IAT();

        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("no", "iat_no"));

        Response response = api.getIat(params);
        System.out.println("======response结果=======");
        System.out.println(response.getData());
        System.out.println(response.getMeta());
    }
}

package main.java.com.transfereasy.example.statement;

import main.java.com.transfereasy.api.Statement;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public class DownloadStatement {
    public static void main(String[] args) throws IOException {
        Statement api = new Statement();
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("from_created_at", URLEncoder.encode("2018-10-01 00:00:00", "UTF-8")));
        params.add(new BasicNameValuePair("to_created_at", URLEncoder.encode("2018-10-31 23:59:59", "UTF-8")));

        String response = api.download(params);
        System.out.println("======response结果=======");
        System.out.println(response);

    }

}

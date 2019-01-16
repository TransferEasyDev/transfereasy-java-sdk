package main.java.com.transfereasy.example.invoice;

import main.java.com.transfereasy.api.Invoice;
import main.java.com.transfereasy.entity.invoice.ListResponse;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public class GetInvoices {
    public static void main(String[] args) throws IOException {
        Invoice api = new Invoice();

        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("from_created_at", URLEncoder.encode("2018-10-01 00:00:00", "UTF-8")));
        params.add(new BasicNameValuePair("to_created_at", URLEncoder.encode("2018-10-31 23:59:59", "UTF-8")));
        params.add(new BasicNameValuePair("send_currency", "USD"));
        params.add(new BasicNameValuePair("status", "PROCESSING"));

        ListResponse response = api.getInvoices(params);
        System.out.println("======response结果=======");
        System.out.println(response.getData());
        System.out.println(response.getMeta());
    }
}

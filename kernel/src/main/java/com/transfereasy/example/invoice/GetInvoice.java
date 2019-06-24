package main.java.com.transfereasy.example.invoice;

import main.java.com.transfereasy.api.Invoice;
import main.java.com.transfereasy.entity.invoice.Response;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GetInvoice {
    public static void main(String[] args) throws IOException {
        Invoice api = new Invoice();

        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("no", "invoice_no"));
//        params.add(new BasicNameValuePair("out_trade_id", "your_trade_id"));

        Response response = api.getInvoice(params);
        System.out.println("======response结果=======");
        System.out.println(response.getData());
        System.out.println(response.getMeta());
    }
}

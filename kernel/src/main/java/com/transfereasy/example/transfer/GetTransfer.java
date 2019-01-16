package main.java.com.transfereasy.example.transfer;

import main.java.com.transfereasy.api.Transfer;
import main.java.com.transfereasy.entity.transfer.Response;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GetTransfer {
    public static void main(String[] args) throws IOException {
        Transfer api = new Transfer();

        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("no", "transfer_no"));

        Response response = api.getTransfer(params);
        System.out.println("======response结果=======");
        System.out.println(response.getData());
        System.out.println(response.getMeta());

    }
}

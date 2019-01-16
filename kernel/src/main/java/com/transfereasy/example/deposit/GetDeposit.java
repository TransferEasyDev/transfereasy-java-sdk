package main.java.com.transfereasy.example.deposit;

import main.java.com.transfereasy.api.Deposit;
import main.java.com.transfereasy.entity.deposit.Response;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GetDeposit {
    public static void main(String[] args) throws IOException {
        Deposit api = new Deposit();

        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("no", "deposit_no"));

        Response response = api.getDeposit(params);
        System.out.println("======response结果=======");
        System.out.println(response.getData());
        System.out.println(response.getMeta());

    }
}

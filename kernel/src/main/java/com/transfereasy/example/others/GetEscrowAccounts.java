package main.java.com.transfereasy.example.others;

import main.java.com.transfereasy.api.Others;
import main.java.com.transfereasy.entity.others.EscrowAccountsResponse;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GetEscrowAccounts {
    public static void main(String[] args) throws IOException {
        Others api = new Others();
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("currency", "HKD"));
        params.add(new BasicNameValuePair("country", "HKG"));

        EscrowAccountsResponse response = api.escrowAccounts(params);
        System.out.println("======response结果=======");
        System.out.println(response.getData());
        System.out.println(response.getMeta());

    }
}
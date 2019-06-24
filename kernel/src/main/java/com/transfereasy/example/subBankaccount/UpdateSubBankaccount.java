package main.java.com.transfereasy.example.subBankaccount;

import main.java.com.transfereasy.api.SubBankAccount;
import main.java.com.transfereasy.entity.subBankaccount.ApplyResponse;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.protocol.HTTP;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;

public class UpdateSubBankaccount {
    public static void main(String[] args) throws IOException,JSONException {
        SubBankAccount sbacc = new SubBankAccount();

        JSONObject params = new JSONObject();
        JSONObject shop = new JSONObject();


        shop.put("type", "AMAZON");
        shop.put("name", "name");
        shop.put("industry", "旅行，运输，住宿及物流");
        shop.put("url", "https://www.amazon.com/xxxx");
        shop.put("piece_transfer_amount", 1000);
        shop.put("week_transfer_amount", 1000);
        shop.put("amazon_site", "USA");
        shop.put("business_description", "business_description");
        shop.put("seller_id", "seller_id");
        shop.put("access_key", "access_key");
        shop.put("secret_key", "secret_key");

        params.put("no", "");
        params.put("country", "USA");
        params.put("shop", shop);


        ApplyResponse response = sbacc.createSubBankAccount(params);
        System.out.println("======response结果=======");
        System.out.println(response.getData());
        System.out.println(response.getMeta());
    }
}

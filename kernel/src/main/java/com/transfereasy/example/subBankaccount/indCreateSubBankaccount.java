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

public class indCreateSubBankaccount {
    public static void main(String[] args) throws IOException,JSONException {
        SubBankAccount sbacc = new SubBankAccount();

        JSONObject datas = new JSONObject();
        JSONObject individual = new JSONObject();
        JSONObject shop = new JSONObject();
        JSONObject subBankaccount = new JSONObject();

        individual.put("name", "name");
        individual.put("country_code", "USA");
        individual.put("mobile", "mobile");
        individual.put("doc_type", "ID");
        individual.put("doc_number", "doc_number");
        individual.put("address", "address");

        subBankaccount.put("currency", "USD");
        subBankaccount.put("country", "USA");

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

        datas.put("individual", individual);
        datas.put("sub_bank_account", subBankaccount);
        datas.put("shop", shop);


        MultipartEntityBuilder params = MultipartEntityBuilder.create();

        params.addTextBody("apply_data", datas.toString(), ContentType.create(HTTP.PLAIN_TEXT_TYPE, HTTP.UTF_8));


        params.addBinaryBody("id_file_front", new File("/file_path/upload.png"));
        params.addBinaryBody("id_file_back", new File("/file_path/upload.png"));
        params.addBinaryBody("passport_file", new File("/file_path/upload.png"));
        params.addBinaryBody("address_evd_file", new File("/file_path/upload.png"));

        ApplyResponse response = sbacc.indCreateSubBankAccount(params);
        System.out.println("======response结果=======");
        System.out.println(response.getData());
        System.out.println(response.getMeta());
    }
}

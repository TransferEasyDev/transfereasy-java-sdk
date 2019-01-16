package main.java.com.transfereasy.example.subBankaccount;

import main.java.com.transfereasy.api.SubBankAccount;
import main.java.com.transfereasy.entity.subBankaccount.ApplyResponse;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;

public class ComUpdateSubBankaccount {
    public static void main(String[] args) throws IOException,JSONException {
        SubBankAccount sbacc = new SubBankAccount();

        JSONObject datas = new JSONObject();
        JSONObject company = new JSONObject();
        JSONObject shop = new JSONObject();
        JSONObject subBankaccount = new JSONObject();

        company.put("org_name", "org_name");
        company.put("office_op_address", "office_op_address");
        company.put("contact_name", "contact_name");
        company.put("contact_email", "contact_email");
        company.put("contact_phone", "contact_phone");
        company.put("contact_country", "contact_country");
        company.put("contact_address", "contact_address");
        company.put("contact_position", "contact_position");
        company.put("website", "website");
        company.put("company_type", "有限责任公司 (LLC)");
        company.put("industry", "旅行，运输，住宿及物流");
        company.put("major_funds_source", "营业收入，住宿及物流");
        company.put("year_transfer_amount", "year_transfer_amount");
        company.put("piece_transfer_amount", "piece_transfer_amount");
        company.put("credit_code", "credit_code");
        company.put("business_code", "business_code");
        company.put("business_country", "HKG");
        company.put("register_country", "HKG");

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

        datas.put("no", "VTZSGPHG48D4THZOFCHXKB");
        datas.put("company", company);
        datas.put("sub_bank_account", subBankaccount);
        datas.put("shop", shop);


        MultipartEntityBuilder params = MultipartEntityBuilder.create();

        params.addTextBody("apply_data", datas.toString());


        params.addBinaryBody("license_file", new File("/file_path/upload.png"));
        params.addBinaryBody("office_reg_addr_evd_file", new File("/file_path/upload.png"));
        params.addBinaryBody("beneficiary_evd_file", new File("/file_path/upload.png"));
        params.addBinaryBody("bank_cert_evd_file", new File("/file_path/upload.png"));
        params.addBinaryBody("contact_doc_file", new File("/file_path/upload.png"));
        params.addBinaryBody("contact_address_file", new File("/file_path/upload.png"));

        ApplyResponse response = sbacc.comUpdateSubBankAccount(params);
        System.out.println("======response结果=======");
        System.out.println(response.getData());
        System.out.println(response.getMeta());
    }
}

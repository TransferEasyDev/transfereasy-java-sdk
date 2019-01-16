package main.java.com.transfereasy.example.transfer;

import main.java.com.transfereasy.api.Transfer;
import main.java.com.transfereasy.entity.transfer.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class CreateTransfer {
    public static void main(String[] args) throws IOException, JSONException {
        Transfer api = new Transfer();

        JSONObject jo = new JSONObject();
        JSONObject beneficiary1 = new JSONObject();
        JSONObject beneficiary2 = new JSONObject();
        JSONArray beneficiaries = new JSONArray();

        beneficiary1.put("currency", "HKD");
        beneficiary1.put("amount", 200);
        beneficiary1.put("bank_account_number", "TEST-777");

        beneficiary2.put("currency", "HKD");
        beneficiary2.put("amount", 1000);
        beneficiary2.put("bank_account_number", "TEST-777");

        beneficiaries.put(beneficiary1);
        beneficiaries.put(beneficiary2);

        jo.put("beneficiaries", beneficiaries);
        jo.put("send_amount", 0);
        jo.put("send_currency", "CNH");
        jo.put("purpose", "留学");
        jo.put("memo", "测试");

        Response response = api.createTransfer(jo);
        System.out.println("======response结果=======");
        System.out.println(response.getData());
        System.out.println(response.getMeta());
    }
}

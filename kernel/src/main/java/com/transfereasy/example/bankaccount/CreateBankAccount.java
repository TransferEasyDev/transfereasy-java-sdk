package main.java.com.transfereasy.example.bankaccount;

import main.java.com.transfereasy.api.BankAccount;
import main.java.com.transfereasy.entity.bankaccount.Response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class CreateBankAccount {
    public static void main(String[] args) throws IOException, JSONException {
        BankAccount api = new BankAccount();
        JSONObject jo = new JSONObject();
        JSONObject bo = new JSONObject();
        JSONObject ho = new JSONObject();

        bo.put("name", "招商银行");
        bo.put("branch", "北京分行");
        bo.put("swift_code", "CMBCXXXX");
        ho.put("name", "TestHolder");
        ho.put("doc_type", "ID");
        ho.put("doc_number", "110101199001010001");
        ho.put("contact", "18888888888");
        ho.put("type", "INDIVIDUAL");

        jo.put("bank", bo);
        jo.put("country", "HKG");
        jo.put("currency", "HKD");
        jo.put("bank_account_number", "TEST-499");
        jo.put("holder", ho);
        jo.put("purpose", "PAYER");
        jo.put("iban", "00");
        Response response = api.createBankAccount(jo);
        System.out.println("======response结果=======");
        System.out.println(response.getData());
        System.out.println(response.getMeta());

    }

}

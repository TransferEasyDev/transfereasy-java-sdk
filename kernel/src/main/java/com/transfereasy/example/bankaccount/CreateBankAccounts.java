package main.java.com.transfereasy.example.bankaccount;

import main.java.com.transfereasy.api.BankAccount;
import main.java.com.transfereasy.entity.bankaccount.ListResponse;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class CreateBankAccounts {
    public static void main(String[] args) throws IOException, JSONException {
        BankAccount api = new BankAccount();
        JSONObject bankAccount = new JSONObject();
        JSONObject bank = new JSONObject();
        JSONObject holder = new JSONObject();
        JSONArray bankAccounts = new JSONArray();

        bank.put("name", "招商银行");
        bank.put("branch", "北京分行");
        bank.put("swift_code", "CMBCXXXX");

        holder.put("name", "TestHolder");
        holder.put("doc_type", "ID");
        holder.put("doc_number", "110101199001010001");
        holder.put("contact", "18888888888");
        holder.put("type", "INDIVIDUAL");

        bankAccount.put("bank", bank);
        bankAccount.put("country", "HKG");
        bankAccount.put("currency", "HKD");
        bankAccount.put("bank_account_number", "TEST-399");
        bankAccount.put("holder", holder);
        bankAccount.put("purpose", "PAYER");
        bankAccount.put("iban", "00");

        bankAccounts.put(bankAccount);
        ListResponse response = api.createBankAccounts(bankAccounts);
        System.out.println("======response结果=======");
        System.out.println(response.getData());
        System.out.println(response.getMeta());

    }
}

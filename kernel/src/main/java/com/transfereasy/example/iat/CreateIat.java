package main.java.com.transfereasy.example.iat;

import main.java.com.transfereasy.api.IAT;
import main.java.com.transfereasy.entity.iat.Response;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class CreateIat {
    public static void main(String[] args) throws IOException, JSONException {
        IAT api = new IAT();

        JSONObject jo = new JSONObject();

        jo.put("beneficiary_account_name", "benefi@example.com");
        jo.put("beneficiary_account_no", "beneficiary_account_no");
        jo.put("send_amount", 1);
        jo.put("send_currency", "USD");
        jo.put("purpose", "留学");
        jo.put("memo", "测试");

        Response response = api.createIat(jo);
        System.out.println("======response结果=======");
        System.out.println(response.getData());
        System.out.println(response.getMeta());

    }
}

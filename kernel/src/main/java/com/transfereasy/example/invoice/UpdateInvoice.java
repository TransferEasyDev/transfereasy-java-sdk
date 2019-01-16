package main.java.com.transfereasy.example.invoice;

import main.java.com.transfereasy.api.Invoice;
import main.java.com.transfereasy.entity.invoice.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class UpdateInvoice {
    public static void main(String[] args) throws IOException, JSONException {
        Invoice api = new Invoice();

        JSONObject jo = new JSONObject();
        JSONObject recipient = new JSONObject();
        JSONObject address = new JSONObject();
        JSONObject unit_price1 = new JSONObject();
        JSONObject unit_price2 = new JSONObject();
        JSONObject product1 = new JSONObject();
        JSONObject product2 = new JSONObject();
        JSONArray products = new JSONArray();

        address.put("line1", "1234 First Street");
        address.put("city", "Anytown");
        address.put("state", "CA");
        address.put("postal_code", "98765");
        address.put("country", "USA");

        recipient.put("dob", "1976-08-26");
        recipient.put("entity_type", "INDIVIDUAL");
        recipient.put("first_name", "John");
        recipient.put("last_name", "Walker");
        recipient.put("document_number", "E12345678");
        recipient.put("document_type", "CHN/PASSPORT");
        recipient.put("email", "bill-me@example.com");
        recipient.put("mobile", "1234567890");
        recipient.put("bank_account_number", "432100001111");
        recipient.put("bank_name", "HSBC (HongKong Branch)");
        recipient.put("address", address);

        unit_price1.put("currency", "USD");
        unit_price1.put("amount", 120);

        product1.put("name", "Zoom System wireless headphones");
        product1.put("quantity", 2);
        product1.put("unit_price", unit_price1);

        unit_price2.put("currency", "USD");
        unit_price2.put("amount", 45);

        product2.put("name", "Bluetooth speaker");
        product2.put("quantity", 4);
        product2.put("unit_price", unit_price2);

        products.put(product1);
        products.put(product2);

        jo.put("ex_invoice_no", "ex_invoice_no");
        jo.put("recipient", recipient);
        jo.put("products", products);
        jo.put("memo", "Thank you for your business.");
        jo.put("out_trade_id", "your_trade_id");
        jo.put("currency", "USD");
        jo.put("amount", 420);

        Response response = api.updateInvoice(jo);
        System.out.println("======response结果=======");
        System.out.println(response.getData());
        System.out.println(response.getMeta());
    }
}

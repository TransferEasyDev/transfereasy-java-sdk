package main.java.com.transfereasy.entity.invoice;

import lombok.Data;
import main.java.com.transfereasy.entity.bankaccount.BaData;;

import java.util.ArrayList;
import java.util.List;

@Data
public class InvoiceData {

    private String created;
    private BaData escrow_account = new BaData();
    private String fee_amount;
    private String fee_currency;
    private String invoice_amount;
    private String invoice_currency;
    private String received_amount;
    private String received_currency;
    private Boolean is_canceled;
    private Boolean is_credit;
    private String memo;
    private String no;
    private String reference;
    private String out_trade_id;
    private List<ProductData> products = new ArrayList<ProductData>();
    private RecipientData recipient = new RecipientData();

}

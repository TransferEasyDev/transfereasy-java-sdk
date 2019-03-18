package main.java.com.transfereasy.entity.transfer;

import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@lombok.Data
public class TransferData extends main.java.com.transfereasy.entity.Data {
    private List<BeneficiaryData> beneficiaries = new ArrayList<BeneficiaryData>();
    private String cutoff_time;
    private String delivery_time;
    private String fee_amount;
    private String fee_currency;
    private String fx_rate;
    private String send_amount;
    private String send_currency;
    private String receive_amount;
    private String receive_currency;
    private String memo;
    private String no;
    private String out_trade_id;
    private String order_time;
    private String purpose;
    private String sender_name;
    private String state;
}

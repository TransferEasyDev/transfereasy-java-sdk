package main.java.com.transfereasy.entity.transfer;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TransferData {
    private List<BeneficiaryData> beneficiaries = new ArrayList<BeneficiaryData>();
    private String cutoff_time;
    private String delivery_time;
    private String fee_amount;
    private String fee_currency;
    private String fx_rate;
    private String memo;
    private String no;
    private String order_time;
    private String purpose;
    private String send_amount;
    private String send_currency;
    private String sender_name;
    private String state;
}

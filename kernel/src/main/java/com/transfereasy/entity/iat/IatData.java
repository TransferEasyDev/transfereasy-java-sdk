package main.java.com.transfereasy.entity.iat;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@lombok.Data
public class IatData extends main.java.com.transfereasy.entity.Data {
    private String amount;
    private String beneficiary_account_no;
    private String created;
    private String currency;
    private String out_trade_id;
    private String no;
    private String payer_account_no;
    private String purpose;
}

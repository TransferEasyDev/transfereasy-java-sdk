package main.java.com.transfereasy.entity.iat;

import lombok.Data;

@Data
public class IatData {
    private String amount;
    private String beneficiary_account_no;
    private String created;
    private String currency;
    private String memo;
    private String no;
    private String payer_account_no;
    private String purpose;
}

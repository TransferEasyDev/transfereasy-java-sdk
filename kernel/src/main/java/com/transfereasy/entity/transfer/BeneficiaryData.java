package main.java.com.transfereasy.entity.transfer;

import lombok.EqualsAndHashCode;
import main.java.com.transfereasy.entity.bankaccount.BaData;

@EqualsAndHashCode(callSuper = true)
@lombok.Data
public class BeneficiaryData extends main.java.com.transfereasy.entity.Data {
    private String amount;
    private BaData bank_account = new BaData();
    private String currency;
}

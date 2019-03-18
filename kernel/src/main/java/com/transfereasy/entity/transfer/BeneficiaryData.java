package main.java.com.transfereasy.entity.transfer;

import lombok.Data;
import main.java.com.transfereasy.entity.bankaccount.BaData;

@Data
public class BeneficiaryData {
    private String amount;
    private BaData bank_account = new BaData();
    private String currency;
}

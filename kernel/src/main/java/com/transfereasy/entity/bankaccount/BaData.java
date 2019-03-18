package main.java.com.transfereasy.entity.bankaccount;

import lombok.EqualsAndHashCode;
import main.java.com.transfereasy.entity.Data;

@EqualsAndHashCode(callSuper = true)
@lombok.Data
public class BaData extends Data {
    private BankData bank = new BankData();
    private String country;
    private String currency;
    private String bank_account_number;
    private HolderData holder = new HolderData();
    private String purpose;
    private String iban;
    private String bank_account_name;
    private String beneficiary_address;
    private String telephone;
    private String no;
    private String status;
}

package main.java.com.transfereasy.entity.bankaccount;

@lombok.Data
public class BaData {
    private BankData bank = new BankData();
    private String country = "";
    private String currency = "";
    private String bank_account_number = "";
    private HolderData holder = new HolderData();
    private String purpose = "";
    private String iban = "";
    private String bank_account_name = "";
    private String beneficiary_address = "";
    private String telephone = "";
    private String no = "";
    private String status = "";
}

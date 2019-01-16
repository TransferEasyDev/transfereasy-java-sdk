package main.java.com.transfereasy.entity.deposit;

import main.java.com.transfereasy.entity.bankaccount.BaData;

@lombok.Data
class DpData {
    private String created = "";
    private BaData escrow_bank_account = new BaData();
    private String estimated_amount = "";
    private String estimated_currency = "";
    private String fee_amount = "";
    private String fee_currency = "";
    private Boolean is_canceled = false;
    private Boolean is_credit = false;
    private String no = "";
    private BaData payer_bank_account = new BaData();
    private String received_amount = "";
    private String received_currency = "";
    private String reference = "";

}

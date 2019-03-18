package main.java.com.transfereasy.entity.deposit;

import lombok.EqualsAndHashCode;
import main.java.com.transfereasy.entity.Data;
import main.java.com.transfereasy.entity.bankaccount.BaData;

@EqualsAndHashCode(callSuper = true)
@lombok.Data
class DpData extends Data {
    private String created;
    private BaData escrow_bank_account = new BaData();
    private String estimated_amount;
    private String estimated_currency;
    private String fee_amount;
    private String fee_currency;
    private Boolean is_canceled;
    private Boolean is_credit;
    private String no;
    private BaData payer_bank_account = new BaData();
    private String received_amount;
    private String received_currency;
    private String reference;

}

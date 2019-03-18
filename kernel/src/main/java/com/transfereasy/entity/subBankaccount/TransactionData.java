package main.java.com.transfereasy.entity.subBankaccount;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@lombok.Data
public class TransactionData extends main.java.com.transfereasy.entity.Data {
        private String credit_amount;
        private String currency;
        private String debit_amount;
        private String description;
        private String is_credit;
        private String no;
        private String post_time;
        private String sub_bank_account_number;
}

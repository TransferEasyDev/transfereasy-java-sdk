package main.java.com.transfereasy.entity.subBankaccount;

import lombok.Data;

@Data
public class TransactionData {
        private String credit_amount = "";
        private String currency = "";
        private String debit_amount = "";
        private String description = "";
        private String is_credit = "";
        private String no = "";
        private String post_time = "";
        private String sub_bank_account_number = "";
}

package main.java.com.transfereasy.entity.subBankaccount;

import lombok.Data;

@Data
public class ProgressData {
    private String apply_no;
    private SubBankaccountData sub_bank_account = new SubBankaccountData();
}

package main.java.com.transfereasy.entity.subBankaccount;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@lombok.Data
public class ProgressData extends main.java.com.transfereasy.entity.Data {
    private String apply_no;
    private SubBankaccountData sub_bank_account = new SubBankaccountData();
}

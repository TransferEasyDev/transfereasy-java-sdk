package main.java.com.transfereasy.entity.subBankaccount;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@lombok.Data
public class SubBankaccountData extends main.java.com.transfereasy.entity.Data {
      private String bank_account_number;
      private String country;
      private String currency;
}

package main.java.com.transfereasy.entity.balance;

import lombok.EqualsAndHashCode;
import main.java.com.transfereasy.entity.Data;

@EqualsAndHashCode(callSuper = true)
@lombok.Data
class BlData extends Data {
    private String amount;
    private String currency;
    private String pending_amount;
}

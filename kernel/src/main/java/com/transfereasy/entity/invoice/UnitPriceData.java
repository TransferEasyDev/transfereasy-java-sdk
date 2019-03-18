package main.java.com.transfereasy.entity.invoice;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@lombok.Data
public class UnitPriceData extends main.java.com.transfereasy.entity.Data {
    private String amount;
    private String currency;
}

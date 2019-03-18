package main.java.com.transfereasy.entity.invoice;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@lombok.Data
public class ProductData extends main.java.com.transfereasy.entity.Data {
    private String name;
    private String quantity;
    private UnitPriceData unit_price = new UnitPriceData();
}

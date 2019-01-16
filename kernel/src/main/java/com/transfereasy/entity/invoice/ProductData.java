package main.java.com.transfereasy.entity.invoice;

import lombok.Data;

@Data
public class ProductData {
    private String name = "";
    private String quantity = "";
    private UnitPriceData unit_price = new UnitPriceData();
}

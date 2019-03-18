package main.java.com.transfereasy.entity.invoice;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@lombok.Data
public class AddressData extends main.java.com.transfereasy.entity.Data {
    private String city;
    private String country;
    private String line1;
    private String line2;
    private String line3;
    private String line4;
    private String postal_code;
    private String state;
}

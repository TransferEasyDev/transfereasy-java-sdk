package main.java.com.transfereasy.entity.invoice;

import lombok.Data;

@Data
public class AddressData {
    private String city = "";
    private String country = "";
    private String line1 = "";
    private String line2 = "";
    private String line3 = "";
    private String line4 = "";
    private String postal_code = "";
    private String state = "";
}

package main.java.com.transfereasy.entity.bankaccount;

import lombok.Data;

@Data
class BankData {
    private String name;
    private String branch;
    private String swift_code;
    private String routing_number;
    private String bsb_code;

    private String address;
    private String bg_mini;
    private String card_bg;
    private String issuer;
    private String logo;
    private String sort_code;
}

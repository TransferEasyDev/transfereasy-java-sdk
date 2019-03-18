package main.java.com.transfereasy.entity.bankaccount;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@lombok.Data
class BankData extends main.java.com.transfereasy.entity.Data {
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

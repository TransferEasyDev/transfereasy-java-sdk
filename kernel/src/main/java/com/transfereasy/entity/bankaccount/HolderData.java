package main.java.com.transfereasy.entity.bankaccount;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@lombok.Data
class HolderData extends main.java.com.transfereasy.entity.Data {
    private String name;
    private String doc_type;
    private String doc_number;
    private String contact;
    private String type;
    private String dob;
    private String country;
    private String address;
}

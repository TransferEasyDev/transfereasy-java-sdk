package main.java.com.transfereasy.entity.bankaccount;

import lombok.Data;

@Data
class HolderData {
    private String name = "";
    private String doc_type = "";
    private String doc_number = "";
    private String contact = "";
    private String type = "";
    private String dob = "";
    private String country = "";
    private String address = "";
}

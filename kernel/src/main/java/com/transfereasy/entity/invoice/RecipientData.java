package main.java.com.transfereasy.entity.invoice;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@lombok.Data
public class RecipientData extends main.java.com.transfereasy.entity.Data {
    private AddressData address = new AddressData();
    private String bank_account_number;
    private String bank_name;
    private String dob;
    private String document_number;
    private String document_type;
    private String email;
    private String entity_type;
    private String first_name;
    private String last_name;
    private String mobile;

}

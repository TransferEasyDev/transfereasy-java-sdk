package main.java.com.transfereasy.entity.account;

import lombok.EqualsAndHashCode;
import main.java.com.transfereasy.entity.Data;

@EqualsAndHashCode(callSuper = true)
@lombok.Data
class AccData extends Data {
    private String callback_url;
    private String email;
    private String entity_name;
    private String entity_type;
    private String level;
    private String mobile;
    private String no;
    private String status;
}

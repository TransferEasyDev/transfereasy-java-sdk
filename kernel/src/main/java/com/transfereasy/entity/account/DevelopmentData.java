package main.java.com.transfereasy.entity.account;

import lombok.EqualsAndHashCode;
import main.java.com.transfereasy.entity.Data;

@EqualsAndHashCode(callSuper = true)
@lombok.Data
class DevelopmentData extends Data {
    private String account_no;
    private String secret;
}

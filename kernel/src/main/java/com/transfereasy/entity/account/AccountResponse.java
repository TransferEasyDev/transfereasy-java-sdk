package main.java.com.transfereasy.entity.account;


import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class AccountResponse extends main.java.com.transfereasy.entity.Response {
    private AccData data = new AccData();
}

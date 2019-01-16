package main.java.com.transfereasy.entity.bankaccount;


import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@lombok.Data
public class Response extends main.java.com.transfereasy.entity.Response {
    private BaData data = new BaData();
}

package main.java.com.transfereasy.entity.deposit;


import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@lombok.Data
public class Response extends main.java.com.transfereasy.entity.Response {
    private DpData data = new DpData();
}

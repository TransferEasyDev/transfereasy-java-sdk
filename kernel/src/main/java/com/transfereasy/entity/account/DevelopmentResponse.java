package main.java.com.transfereasy.entity.account;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class DevelopmentResponse extends main.java.com.transfereasy.entity.Response {
    private DevelopmentData data = new DevelopmentData();
}

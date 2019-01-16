package main.java.com.transfereasy.entity.account;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class IndividualDocResponse  extends main.java.com.transfereasy.entity.Response {
    private IndividualDocData data = new IndividualDocData();
}

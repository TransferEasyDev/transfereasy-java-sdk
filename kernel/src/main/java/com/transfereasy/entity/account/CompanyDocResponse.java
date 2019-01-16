package main.java.com.transfereasy.entity.account;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class CompanyDocResponse  extends main.java.com.transfereasy.entity.Response {
    private CompanyDocData data = new CompanyDocData();
}

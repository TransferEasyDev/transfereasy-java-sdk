package main.java.com.transfereasy.entity.subBankaccount;

import lombok.Data;
import lombok.EqualsAndHashCode;
import main.java.com.transfereasy.entity.Response;

@EqualsAndHashCode(callSuper = true)
@Data
public class ApplyResponse extends Response {
    private ApplyData data = new ApplyData();
}

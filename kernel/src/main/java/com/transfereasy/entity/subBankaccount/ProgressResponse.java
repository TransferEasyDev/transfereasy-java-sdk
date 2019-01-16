package main.java.com.transfereasy.entity.subBankaccount;

import lombok.Data;
import lombok.EqualsAndHashCode;
import main.java.com.transfereasy.entity.Response;

@EqualsAndHashCode(callSuper = true)
@Data
public class ProgressResponse extends Response {
    private ProgressData data = new ProgressData();
}

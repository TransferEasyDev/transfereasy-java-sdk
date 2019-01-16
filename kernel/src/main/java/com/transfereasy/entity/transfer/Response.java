package main.java.com.transfereasy.entity.transfer;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Response extends main.java.com.transfereasy.entity.Response {
    private TransferData data = new TransferData();
}

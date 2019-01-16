package main.java.com.transfereasy.entity.exchange;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Response extends main.java.com.transfereasy.entity.Response {
    private ExData data = new ExData();
}

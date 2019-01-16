package main.java.com.transfereasy.entity.token;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Response extends main.java.com.transfereasy.entity.Response {
    private TData data = new TData();
}


package main.java.com.transfereasy.entity.token;

import lombok.EqualsAndHashCode;
import main.java.com.transfereasy.entity.Data;

@EqualsAndHashCode(callSuper = true)
@lombok.Data
public class TData extends Data {
    private String token;
}

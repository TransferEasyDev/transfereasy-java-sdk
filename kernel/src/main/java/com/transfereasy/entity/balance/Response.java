package main.java.com.transfereasy.entity.balance;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class Response extends main.java.com.transfereasy.entity.Response {
    private List<BlData> data = new ArrayList<BlData>();
}

package main.java.com.transfereasy.entity.bankaccount;

import lombok.EqualsAndHashCode;
import main.java.com.transfereasy.entity.Response;

import java.util.ArrayList;
import java.util.List;


@EqualsAndHashCode(callSuper = true)
@lombok.Data
public class ListResponse extends Response {
    private List<BaData> data = new ArrayList<BaData>();
}

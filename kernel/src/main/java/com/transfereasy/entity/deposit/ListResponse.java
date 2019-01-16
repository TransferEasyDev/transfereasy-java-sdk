package main.java.com.transfereasy.entity.deposit;


import lombok.EqualsAndHashCode;
import main.java.com.transfereasy.entity.Response;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@lombok.Data
public class ListResponse extends Response {
    private List<DpData> data = new ArrayList<DpData>();
}

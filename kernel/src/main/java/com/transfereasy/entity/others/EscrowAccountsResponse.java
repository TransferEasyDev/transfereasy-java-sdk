package main.java.com.transfereasy.entity.others;

import lombok.EqualsAndHashCode;
import main.java.com.transfereasy.entity.Response;
import main.java.com.transfereasy.entity.bankaccount.BaData;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@lombok.Data
public class EscrowAccountsResponse extends Response {
    private List<BaData> data = new ArrayList<BaData>();
}

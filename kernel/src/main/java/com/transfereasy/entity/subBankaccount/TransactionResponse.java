package main.java.com.transfereasy.entity.subBankaccount;

import lombok.Data;
import lombok.EqualsAndHashCode;
import main.java.com.transfereasy.entity.Response;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class TransactionResponse extends Response {
    private List<TransactionData> data = new ArrayList<TransactionData>();
}

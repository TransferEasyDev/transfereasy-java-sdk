package main.java.com.transfereasy.entity.invoice;

import lombok.Data;
import lombok.EqualsAndHashCode;
import main.java.com.transfereasy.entity.Response;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class ListResponse extends Response {
    private List<InvoiceData> data = new ArrayList<InvoiceData>();
}

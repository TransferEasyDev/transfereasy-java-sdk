package main.java.com.transfereasy.entity.invoice;


import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Response extends main.java.com.transfereasy.entity.Response {
    private InvoiceData data = new InvoiceData();
}

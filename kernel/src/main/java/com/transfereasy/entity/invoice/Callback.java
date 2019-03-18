package main.java.com.transfereasy.entity.invoice;


import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Callback extends main.java.com.transfereasy.entity.Callback {
    private InvoiceData entity = new InvoiceData();
}

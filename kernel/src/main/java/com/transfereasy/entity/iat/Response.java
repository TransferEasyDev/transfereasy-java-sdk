package main.java.com.transfereasy.entity.iat;


import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Response extends main.java.com.transfereasy.entity.Response {
    private IatData data = new IatData();
}

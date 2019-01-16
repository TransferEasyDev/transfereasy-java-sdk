package main.java.com.transfereasy.entity.iat;

import lombok.Data;
import lombok.EqualsAndHashCode;
import main.java.com.transfereasy.entity.Response;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class ListResponse extends Response {
    private List<IatData> data = new ArrayList<IatData>();
}

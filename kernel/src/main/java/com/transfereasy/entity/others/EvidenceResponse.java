package main.java.com.transfereasy.entity.others;

import lombok.EqualsAndHashCode;
import main.java.com.transfereasy.entity.Response;

@EqualsAndHashCode(callSuper = true)
@lombok.Data
public class EvidenceResponse extends Response {
    private FilesData data = new FilesData();
}

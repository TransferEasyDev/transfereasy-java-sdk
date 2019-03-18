package main.java.com.transfereasy.entity.others;

import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@lombok.Data
public class FilesData extends main.java.com.transfereasy.entity.Data {
    private List file_urls = new ArrayList();
}

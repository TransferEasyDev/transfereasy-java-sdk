package main.java.com.transfereasy.example.others;

import main.java.com.transfereasy.api.Others;
import main.java.com.transfereasy.entity.others.EvidenceResponse;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UploadEvidence {
    public static void main(String[] args) throws IOException {
        Others api = new Others();
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("url", "https://www.baidu.com/img/bd_logo1.png"));
        params.add(new BasicNameValuePair("file_name", "材料.pdf"));
        params.add(new BasicNameValuePair("transfer_no", "transfer_no"));
        params.add(new BasicNameValuePair("memo", "包含了本次交易的所有信息"));

        EvidenceResponse response = api.Evidence(params);
        System.out.println("======response结果=======");
        System.out.println(response.getData());
        System.out.println(response.getMeta());
    }
}

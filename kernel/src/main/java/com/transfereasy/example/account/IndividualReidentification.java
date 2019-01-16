package main.java.com.transfereasy.example.account;

import main.java.com.transfereasy.api.Account;
import main.java.com.transfereasy.entity.account.IndividualDocResponse;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.io.File;
import java.io.IOException;

public class IndividualReidentification {
    public static void main(String[] args) throws IOException {
        Account acc = new Account();

        MultipartEntityBuilder params = MultipartEntityBuilder.create();

        params.addTextBody("name", "name");
        params.addTextBody("country", "CHN");
        params.addTextBody("mobile", "mobile");
        params.addTextBody("doc_type", "ID");
        params.addTextBody("doc_number", "doc_number");
        params.addTextBody("address", "address");

        params.addBinaryBody("id_file_front", new File("/file_path/upload.png"));
        params.addBinaryBody("id_file_back", new File("/file_path/upload.png"));
        params.addBinaryBody("passport_file", new File("/file_path/upload.png"));
        params.addBinaryBody("address_evd_file", new File("/file_path/upload.png"));

        IndividualDocResponse response = acc.individualReidentification(params);
        System.out.println("======response结果=======");
        System.out.println(response.getData());
        System.out.println(response.getMeta());
    }
}

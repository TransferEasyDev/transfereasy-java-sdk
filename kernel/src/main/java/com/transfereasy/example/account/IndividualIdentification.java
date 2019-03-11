package main.java.com.transfereasy.example.account;

import main.java.com.transfereasy.api.Account;
import main.java.com.transfereasy.entity.account.IndividualDocResponse;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.protocol.HTTP;

import java.io.File;
import java.io.IOException;

public class IndividualIdentification {
    public static void main(String[] args) throws IOException {
        Account acc = new Account();

        MultipartEntityBuilder params = MultipartEntityBuilder.create();

        params.addTextBody("name", "name", ContentType.create(HTTP.PLAIN_TEXT_TYPE, HTTP.UTF_8));
        params.addTextBody("country", "CHN", ContentType.create(HTTP.PLAIN_TEXT_TYPE, HTTP.UTF_8));
        params.addTextBody("mobile", "mobile", ContentType.create(HTTP.PLAIN_TEXT_TYPE, HTTP.UTF_8));
        params.addTextBody("doc_type", "ID", ContentType.create(HTTP.PLAIN_TEXT_TYPE, HTTP.UTF_8));
        params.addTextBody("doc_number", "doc_number", ContentType.create(HTTP.PLAIN_TEXT_TYPE, HTTP.UTF_8));
        params.addTextBody("address", "address", ContentType.create(HTTP.PLAIN_TEXT_TYPE, HTTP.UTF_8));

        params.addBinaryBody("id_file_front", new File("/file_path/upload.png"));
        params.addBinaryBody("id_file_back", new File("/file_path/upload.png"));
        params.addBinaryBody("passport_file", new File("/file_path/upload.png"));
        params.addBinaryBody("address_evd_file", new File("/file_path/upload.png"));

        IndividualDocResponse response = acc.individualIdentification(params);
        System.out.println("======response结果=======");
        System.out.println(response.getData());
        System.out.println(response.getMeta());
    }
}

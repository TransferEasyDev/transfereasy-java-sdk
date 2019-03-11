package main.java.com.transfereasy.example.account;

import main.java.com.transfereasy.api.Account;
import main.java.com.transfereasy.entity.account.CompanyDocResponse;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.protocol.HTTP;

import java.io.File;
import java.io.IOException;

public class CompanyIdentification  {
    public static void main(String[] args) throws IOException {
        Account acc = new Account();

        MultipartEntityBuilder params = MultipartEntityBuilder.create();

        params.addTextBody("org_name", "org_name", ContentType.create(HTTP.PLAIN_TEXT_TYPE, HTTP.UTF_8));
        params.addTextBody("office_op_address", "office_op_address", ContentType.create(HTTP.PLAIN_TEXT_TYPE, HTTP.UTF_8));
        params.addTextBody("contact_name", "contact_name", ContentType.create(HTTP.PLAIN_TEXT_TYPE, HTTP.UTF_8));
        params.addTextBody("contact_email", "contact_email", ContentType.create(HTTP.PLAIN_TEXT_TYPE, HTTP.UTF_8));
        params.addTextBody("contact_phone", "contact_phone", ContentType.create(HTTP.PLAIN_TEXT_TYPE, HTTP.UTF_8));
        params.addTextBody("contact_country", "contact_country", ContentType.create(HTTP.PLAIN_TEXT_TYPE, HTTP.UTF_8));
        params.addTextBody("contact_address", "contact_address", ContentType.create(HTTP.PLAIN_TEXT_TYPE, HTTP.UTF_8));
        params.addTextBody("contact_position", "contact_position", ContentType.create(HTTP.PLAIN_TEXT_TYPE, HTTP.UTF_8));
        params.addTextBody("website", "website", ContentType.create(HTTP.PLAIN_TEXT_TYPE, HTTP.UTF_8));
        params.addTextBody("company_type", "company_type", ContentType.create(HTTP.PLAIN_TEXT_TYPE, HTTP.UTF_8));
        params.addTextBody("industry", "industry", ContentType.create(HTTP.PLAIN_TEXT_TYPE, HTTP.UTF_8));
        params.addTextBody("major_funds_source", "major_funds_source", ContentType.create(HTTP.PLAIN_TEXT_TYPE, HTTP.UTF_8));
        params.addTextBody("year_transfer_amount", "year_transfer_amount", ContentType.create(HTTP.PLAIN_TEXT_TYPE, HTTP.UTF_8));
        params.addTextBody("piece_transfer_amount", "piece_transfer_amount", ContentType.create(HTTP.PLAIN_TEXT_TYPE, HTTP.UTF_8));
        params.addTextBody("credit_code", "credit_code", ContentType.create(HTTP.PLAIN_TEXT_TYPE, HTTP.UTF_8));
        params.addTextBody("business_code", "business_code", ContentType.create(HTTP.PLAIN_TEXT_TYPE, HTTP.UTF_8));
        params.addTextBody("business_country", "CHN", ContentType.create(HTTP.PLAIN_TEXT_TYPE, HTTP.UTF_8));
        params.addTextBody("register_country", "HKG", ContentType.create(HTTP.PLAIN_TEXT_TYPE, HTTP.UTF_8));
        params.addTextBody("issue_bearer_share", "true", ContentType.create(HTTP.PLAIN_TEXT_TYPE, HTTP.UTF_8));

        params.addBinaryBody("license_file", new File("/file_path/upload.png"));
        params.addBinaryBody("office_reg_addr_evd_file", new File("/file_path/upload.png"));
        params.addBinaryBody("beneficiary_evd_file", new File("/file_path/upload.png"));
        params.addBinaryBody("bank_cert_evd_file", new File("/file_path/upload.png"));
        params.addBinaryBody("ownership_structure_file", new File("/file_path/upload.png"));

        CompanyDocResponse response = acc.companyIdentification(params);
        System.out.println("======response结果=======");
        System.out.println(response.getData());
        System.out.println(response.getMeta());
    }
}

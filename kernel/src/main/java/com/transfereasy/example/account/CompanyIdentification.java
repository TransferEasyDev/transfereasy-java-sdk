package main.java.com.transfereasy.example.account;

import main.java.com.transfereasy.api.Account;
import main.java.com.transfereasy.entity.account.CompanyDocResponse;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.io.File;
import java.io.IOException;

public class CompanyIdentification  {
    public static void main(String[] args) throws IOException {
        Account acc = new Account();

        MultipartEntityBuilder params = MultipartEntityBuilder.create();

        params.addTextBody("org_name", "org_name");
        params.addTextBody("office_op_address", "office_op_address");
        params.addTextBody("contact_name", "contact_name");
        params.addTextBody("contact_email", "contact_email");
        params.addTextBody("contact_phone", "contact_phone");
        params.addTextBody("contact_country", "contact_country");
        params.addTextBody("contact_address", "contact_address");
        params.addTextBody("contact_position", "contact_position");
        params.addTextBody("website", "website");
        params.addTextBody("company_type", "company_type");
        params.addTextBody("industry", "industry");
        params.addTextBody("major_funds_source", "major_funds_source");
        params.addTextBody("year_transfer_amount", "year_transfer_amount");
        params.addTextBody("piece_transfer_amount", "piece_transfer_amount");
        params.addTextBody("credit_code", "credit_code");
        params.addTextBody("business_code", "business_code");
        params.addTextBody("business_country", "CHN");
        params.addTextBody("register_country", "HKG");
        params.addTextBody("issue_bearer_share", "true");

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

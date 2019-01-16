package main.java.com.transfereasy.example.balance;

import main.java.com.transfereasy.api.Balance;
import main.java.com.transfereasy.entity.balance.Response;

import java.io.IOException;

public class GetBalance {
    public static void main(String[] args) throws IOException {
        Balance bl = new Balance();
        Response response = bl.getBalance();
        System.out.println("======response结果=======");
        System.out.println(response.getData());
        System.out.println(response.getMeta());
    }
}

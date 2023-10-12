package BankSystem;

import java.util.ArrayList;

public class BankUser {


    private String name;
    private Double balance;

    public BankUser(String name) {
        this.name = name;
        this.balance = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

}
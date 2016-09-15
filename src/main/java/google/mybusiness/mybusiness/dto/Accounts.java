package main.java.google.mybusiness.mybusiness.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Jayesh on 9/13/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Accounts {

    public Accounts(){

    }

    public Accounts(String error){
        this.error = error;
    }

    private String error;

    private Account[] accounts;

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}

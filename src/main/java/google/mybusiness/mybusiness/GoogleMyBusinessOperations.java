package main.java.google.mybusiness.mybusiness;


import main.java.google.mybusiness.mybusiness.dto.Accounts;
import main.java.google.mybusiness.mybusiness.dto.Locations;
import main.java.google.mybusiness.mybusiness.dto.Reviews;

/**
 * Created by Jayesh on 9/8/16.
 */
public interface GoogleMyBusinessOperations {

    /**
     * Get all accounts for the logged in user (uses access token)
     * @return
     */
    public Accounts getAccounts();

    /**
     * Get all locations for the account name. Account name is a number
     * @param accountName
     * @return
     */
    public Locations getLocations(String accountName);

    /**
     * Get reviews for the account and location
     * @param accountName
     * @param locationName
     * @return
     */
    public Reviews getReviews(String accountName, String locationName);


}

package main.java.google.mybusiness.mybusiness;

import com.cobalt.social.integration.google.api.mybusiness.dto.Accounts;
import com.cobalt.social.integration.google.api.mybusiness.dto.Locations;
import com.cobalt.social.integration.google.api.mybusiness.dto.Reviews;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.social.google.api.impl.AbstractGoogleApiOperations;
import org.springframework.web.client.RestTemplate;

import static com.cobalt.social.socialnetwork.google.GoogleOperation.*;

/**
 * Created by Jayesh on 9/8/16.
 */
public class GoogleMyBusinessTemplate extends AbstractGoogleApiOperations implements GoogleMyBusinessOperations {

    private static final Logger LOGGER = LoggerFactory.getLogger(GoogleMyBusinessTemplate.class);


    public GoogleMyBusinessTemplate(RestTemplate restTemplate, boolean isAuthorized) {
        super(restTemplate, isAuthorized);
    }

    /**
     * Get all accounts for the logged in user (uses access token)
     * @return Accounts
     */
    @Override
    public Accounts getAccounts() {
        try {
            return getEntity(MY_BUSINESS_GOOGLE_ACCOUNTS, Accounts.class);
        } catch (Exception ex) {
            LOGGER.error("Error getting accounts data from Google", ex);
            return new Accounts(ex.getMessage());
        }
    }

    /**
     * Get all locations for the account name. Account name is a number
     * @param accountName
     * @return
     */
    @Override
    public Locations getLocations(String accountName) {
        Locations locations;
        try {
            String locationsUrl = MY_BUSINESS_GOOGLE_LOCATIONS.replace("{accountName}", accountName);
            locations = getEntity(locationsUrl, Locations.class);
        } catch (Exception ex) {
            LOGGER.error("Error getting locations data from Google", ex);
            locations = new Locations(ex.getMessage());
        }
        return locations;
    }

    /**
     * Get Reviews for the account and location
     * @param accountName
     * @param locationName
     * @return
     */
    public Reviews getReviews(String accountName, String locationName) {
        Reviews reviews;
        try {
            String reviewUrl = MY_BUSINESS_GOOGLE_REVIEWS
                    .replace("{accountName}", accountName)
                    .replace("{locationName}", locationName);
            reviews = getEntity(reviewUrl, Reviews.class);
        } catch (Exception ex) {
            LOGGER.error("Error getting review data from Google", ex);
            reviews = new Reviews(ex.getMessage());
        }
        return reviews;
    }
}

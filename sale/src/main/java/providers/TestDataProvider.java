package providers;

import com.fasterxml.jackson.databind.ObjectMapper;
import pojos.customer.Customer;
import pojos.user.User;
import java.io.File;
import java.io.IOException;

public class TestDataProvider {

    private final String authDirectory = "src/test/resources/testData/auth/";
    private final String customerDirectory = "src/test/resources/testData/customer/";

    public User getUser(Class clazz) {
        ObjectMapper objectMapper = new ObjectMapper();
        User user = null;
        try {
            user = objectMapper.readValue(new File(authDirectory + clazz.getSimpleName() + ".json"), User.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return user;
    }

    public Customer getCustomer(Class clazz){
        ObjectMapper objectMapper = new ObjectMapper();
        Customer customer = null;
        try {
            customer = objectMapper.readValue(new File(customerDirectory + clazz.getSimpleName() + ".json"), Customer.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return customer;
    }
}

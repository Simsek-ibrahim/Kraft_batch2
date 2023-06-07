package pojos.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import pojos.address.Address;
import pojos.bank.Bank;

public class Customer {

    @JsonProperty
    private CustomerGeneral customerGeneral;

    @JsonProperty
    private Bank bank;

    @JsonProperty
    private Address address;

    public CustomerGeneral getCustomerGeneral() {
        return customerGeneral;
    }

    public void setCustomerGeneral(CustomerGeneral customerGeneral) {
        this.customerGeneral = customerGeneral;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

package pojos.address;

import com.fasterxml.jackson.annotation.JsonProperty;
import enums.AddressTypeEnum;
import enums.SalutationTypeEnum;

public class Address {
    @JsonProperty
    private AddressTypeEnum addressTypeEnum;

    @JsonProperty
    private SalutationTypeEnum salutationTypeEnum;

    @JsonProperty
    private String name;

    @JsonProperty
    private String company;

    @JsonProperty
    private String streetAndNumber;

    @JsonProperty
    private String addressSupplement;

    @JsonProperty
    private String postCode;

    @JsonProperty
    private String location;

    @JsonProperty
    private String country;

    public AddressTypeEnum getAddressTypeEnum() {
        return addressTypeEnum;
    }

    public void setAddressTypeEnum(AddressTypeEnum addressTypeEnum) {
        this.addressTypeEnum = addressTypeEnum;
    }

    public SalutationTypeEnum getSalutationTypeEnum() {
        return salutationTypeEnum;
    }

    public void setSalutationTypeEnum(SalutationTypeEnum salutationTypeEnum) {
        this.salutationTypeEnum = salutationTypeEnum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getStreetAndNumber() {
        return streetAndNumber;
    }

    public void setStreetAndNumber(String streetAndNumber) {
        this.streetAndNumber = streetAndNumber;
    }

    public String getAddressSupplement() {
        return addressSupplement;
    }

    public void setAddressSupplement(String addressSupplement) {
        this.addressSupplement = addressSupplement;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

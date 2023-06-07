package pojos.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import enums.CustomerTypeEnum;

public class CustomerGeneral {

    @JsonProperty
    private CustomerTypeEnum customerTypeEnum;

    @JsonProperty
    private String name;

    @JsonProperty
    private String email;

    @JsonProperty
    private String company;

    @JsonProperty
    private String phone;

    @JsonProperty
    private String mobile;

    @JsonProperty
    private String fax;

    @JsonProperty
    private String taxNumber;

    @JsonProperty
    private String vatID;

    public CustomerTypeEnum getCustomerTypeEnum() {
        return customerTypeEnum;
    }

    public void setCustomerTypeEnum(CustomerTypeEnum customerTypeEnum) {
        this.customerTypeEnum = customerTypeEnum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getVatID() {
        return vatID;
    }

    public void setVatID(String vatID) {
        this.vatID = vatID;
    }
}

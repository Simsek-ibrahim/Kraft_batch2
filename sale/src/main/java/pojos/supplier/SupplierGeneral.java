package pojos.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SupplierGeneral {

    @JsonProperty
    private String name;

    @JsonProperty
    private String company;

    @JsonProperty
    private String email;

    @JsonProperty
    private String phone;

    @JsonProperty
    private String mobile;

    @JsonProperty
    private String fax;

    @JsonProperty
    private String faxNumber;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public Long getVatID() {
        return vatID;
    }

    public void setVatID(Long vatID) {
        this.vatID = vatID;
    }

    @JsonProperty
    private Long vatID;


}

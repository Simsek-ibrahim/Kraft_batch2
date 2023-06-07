package pojos.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import pojos.address.Address;
import pojos.bank.Bank;

public class Supplier {

    @JsonProperty
    private SupplierGeneral supplierGeneral;

    @JsonProperty
    private Bank bank;

    @JsonProperty
    private Address address;

    public SupplierGeneral getSupplierGeneral() {
        return supplierGeneral;
    }

    public void setSupplierGeneral(SupplierGeneral supplierGeneral) {
        this.supplierGeneral = supplierGeneral;
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

package pojos.bank;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Bank {
    @JsonProperty
    private String bankName;

    @JsonProperty
    private String iban;

    @JsonProperty
    private String bic;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }
}

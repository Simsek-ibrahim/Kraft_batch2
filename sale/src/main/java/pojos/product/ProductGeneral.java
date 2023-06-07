package pojos.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import enums.ConditionTypeEnum;
import enums.VatEnum;

import java.util.List;

public class ProductGeneral {

    @JsonProperty
    private String itemName;

    @JsonProperty
    private String sku;

    @JsonProperty
    private ConditionTypeEnum conditionTypeEnum;

    @JsonProperty
    private String brand;

    @JsonProperty
    private VatEnum vatEnum;

    @JsonProperty
    private Long purchasePrice;

    @JsonProperty
    private Long salePrice;

    @JsonProperty
    private Long salePriceGross;

    @JsonProperty
    private Long quantity;

    @JsonProperty
    private Long unit;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public ConditionTypeEnum getConditionTypeEnum() {
        return conditionTypeEnum;
    }

    public void setConditionTypeEnum(ConditionTypeEnum conditionTypeEnum) {
        this.conditionTypeEnum = conditionTypeEnum;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public VatEnum getVatEnum() {
        return vatEnum;
    }

    public void setVatEnum(VatEnum vatEnum) {
        this.vatEnum = vatEnum;
    }

    public Long getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Long purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Long getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Long salePrice) {
        this.salePrice = salePrice;
    }

    public Long getSalePriceGross() {
        return salePriceGross;
    }

    public void setSalePriceGross(Long salePriceGross) {
        this.salePriceGross = salePriceGross;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getUnit() {
        return unit;
    }

    public void setUnit(Long unit) {
        this.unit = unit;
    }
}

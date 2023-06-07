package pojos.product;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductMoreSettings {

    @JsonProperty
    private String barcode;

    @JsonProperty
    private String ean;

    @JsonProperty
    private String gtin;

    @JsonProperty
    private String isbn;

    @JsonProperty
    private String mpn;

    @JsonProperty
    private String upc;

    @JsonProperty
    private Long weight;

    @JsonProperty
    private Long width;

    @JsonProperty
    private Long height;

    @JsonProperty
    private Long depth;

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getGtin() {
        return gtin;
    }

    public void setGtin(String gtin) {
        this.gtin = gtin;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getMpn() {
        return mpn;
    }

    public void setMpn(String mpn) {
        this.mpn = mpn;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public Long getWidth() {
        return width;
    }

    public void setWidth(Long width) {
        this.width = width;
    }

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public Long getDepth() {
        return depth;
    }

    public void setDepth(Long depth) {
        this.depth = depth;
    }
}

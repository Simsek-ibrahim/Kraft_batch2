package pojos.product;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Product {

    @JsonProperty
    private ProductGeneral productGeneral;

    @JsonProperty
    private List<String> categories;

    @JsonProperty
    private String imageUrl;

    @JsonProperty
    private String description;

    @JsonProperty
    private ProductMoreSettings productMoreSettings;

    public ProductGeneral getProductGeneral() {
        return productGeneral;
    }

    public void setProductGeneral(ProductGeneral productGeneral) {
        this.productGeneral = productGeneral;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductMoreSettings getProductMoreSettings() {
        return productMoreSettings;
    }

    public void setProductMoreSettings(ProductMoreSettings productMoreSettings) {
        this.productMoreSettings = productMoreSettings;
    }
}

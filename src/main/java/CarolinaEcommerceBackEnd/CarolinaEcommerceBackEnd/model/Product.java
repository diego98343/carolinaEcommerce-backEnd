package CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model;

import javax.persistence.*;

@Entity
@Table
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  String productName;

    private String description;

    @ManyToOne
    @JoinColumn(name="category_id")
    private ProductCategory productCategory;

    private String imageUrl;


    public Product(Long id, String productName, String description, ProductCategory productCategory) {
        this.id = id;
        this.productName = productName;
        this.description = description;
        this.productCategory = productCategory;
    }

    public Product() {
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductCategory getCategory() {
        return productCategory;
    }

    public void setCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }


}

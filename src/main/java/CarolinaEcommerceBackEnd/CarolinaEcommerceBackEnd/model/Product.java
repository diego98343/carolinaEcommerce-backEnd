package CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name="product")
public class Product {


    //UPDATE APPLICATION PROPERTIES TO USE @COLUM

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="productName")
    private  String productName;
    @Column(name="description")
    private String description;

    @ManyToOne
    @JoinColumn(name="category_id")
    private ProductCategory productCategory;
    @Column(name="imageUrl")
    private String imageUrl;


    public Product(Long id, String productName, String description, ProductCategory productCategory) {
        this.id = id;
        this.productName = productName;
        this.description = description;
        this.productCategory = productCategory;
    }

    public Product() {
    }

    @JsonBackReference
    public ProductCategory getProductCategory() {
        return productCategory;
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

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}

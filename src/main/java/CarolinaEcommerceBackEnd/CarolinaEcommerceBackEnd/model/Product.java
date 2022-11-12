package CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="product")
public class Product {


    //UPDATE APPLICATION PROPERTIES TO USE @COLUM
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_id")
    private int id;
    @Column(name="productName")
    private  String productName;
    @Column(name="description")
    private String description;

    @ManyToOne
    @JoinColumn(name="category_id")
    private ProductCategory productCategory;
    @Column(name="imageUrl")
    private String imageUrl;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(
         name="product_images",
         joinColumns = {
                 @JoinColumn(name="product_id")
         },
            inverseJoinColumns = {
                 @JoinColumn(name="image_id")
            }
    )
    private Set<Image>  image;


    public Product(int id, String productName, String description, ProductCategory productCategory, String imageUrl, Set<Image> image) {
        this.id = id;
        this.productName = productName;
        this.description = description;
        this.productCategory = productCategory;
        this.imageUrl = imageUrl;
        this.image = image;
    }

    public Product() {
    }

    @JsonBackReference
    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public Set<Image> getImage() {
        return image;
    }

    public void setImage(Set<Image> image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

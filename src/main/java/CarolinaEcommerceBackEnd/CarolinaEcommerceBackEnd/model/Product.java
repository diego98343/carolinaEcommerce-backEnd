package CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="product")
public class Product {


    //UPDATE APPLICATION PROPERTIES TO USE @COLUM
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_Id")
    private int productId;
    @Column(name="productName")
    private  String productName;
    @Column(name="description")
    private String description;


    @Column(name="productPrice")
    private int productPrice;
    @ManyToOne
    @JoinColumn(name="category_id")
    private ProductCategory productCategory;

    @Column(name = "date_created")
    @CreationTimestamp
    private Date dateCreated;

    @Column(name = "active")
    private boolean active;

    @Column(name = "last_updated")
    @UpdateTimestamp
    private Date lastUpdated;

    @Column(name = "units_in_stock")
    private int unitsInStock;


    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name="product_image",
           joinColumns = {
            @JoinColumn(name="product_id")
           },
            inverseJoinColumns = {
            @JoinColumn(name="image_id")
            }
    )
    private Set<Attachment> productImage;


    public Product(int productId, String productName, String description, int productPrice, ProductCategory productCategory, Date dateCreated, boolean active, Date lastUpdated, int unitsInStock, Attachment attachmentFile, Set<Attachment> productImage) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
        this.dateCreated = dateCreated;
        this.active = active;
        this.lastUpdated = lastUpdated;
        this.unitsInStock = unitsInStock;
        this.productImage = productImage;
    }



    public Product() {
    }


    @JsonBackReference
    public ProductCategory getProductCategory() {
        return productCategory;
    }


    public Set<Attachment> getProductImage() {
        return productImage;
    }


    public void setProductImage(Set<Attachment> productImage) {
        this.productImage = productImage;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
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

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }
}

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
    @Column(name="productId")
    private int productId;
    @Column(name="productName")
    private  String productName;
    @Column(name="description")
    private String description;
    @Column(name="imageUrl")
    private String imageUrl;

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

    @ManyToOne
    @JoinColumn(name="attachment_id")
    private Attachment attachmentFile;


    public Product(int productId, String productName, String description, String imageUrl, int productPrice, ProductCategory productCategory, Date dateCreated, boolean active, Date lastUpdated, int unitsInStock, Attachment attachmentFile) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.imageUrl = imageUrl;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
        this.dateCreated = dateCreated;
        this.active = active;
        this.lastUpdated = lastUpdated;
        this.unitsInStock = unitsInStock;
        this.attachmentFile = attachmentFile;
    }

    public Product() {
    }


    @JsonBackReference
    public ProductCategory getProductCategory() {
        return productCategory;
    }
//MAKE SURE TO CALLED DIFFERENT VALUES FOR  JSONBACKREFERENCE WHEN THERE ARE MORE THAN TWO
    @JsonBackReference(value = "image-a")
    public Attachment getAttachmentFile() {
        return attachmentFile;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public void setAttachmentFile(Attachment attachmentFile) {
        this.attachmentFile = attachmentFile;
    }

    public String getImageUrl() {
        return imageUrl;
    }


    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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

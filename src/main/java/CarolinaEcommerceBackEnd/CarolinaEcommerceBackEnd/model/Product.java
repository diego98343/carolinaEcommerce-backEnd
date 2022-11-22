package CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
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

    @ManyToOne
    @JoinColumn(name="category_id")
    private ProductCategory productCategory;

    @ManyToOne
    @JoinColumn(name="attachment_id")
    private Attachment attachmentFile;


    public Product(int productId, String productName, String description, ProductCategory productCategory, Attachment attachmentFile) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.productCategory = productCategory;
        this.attachmentFile = attachmentFile;
    }

    public Product() {
    }



    @JsonBackReference
    public ProductCategory getProductCategory() {
        return productCategory;
    }

    @JsonBackReference
    public Attachment getAttachmentFile() {
        return attachmentFile;
    }

    public void setAttachmentFile(Attachment attachmentFile) {
        this.attachmentFile = attachmentFile;
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





}

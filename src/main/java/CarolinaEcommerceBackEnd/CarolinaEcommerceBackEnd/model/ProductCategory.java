package CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="ProductCategory")
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="categoryName")
    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productCategory")
    private Set<Product> product;


    public ProductCategory(int id, String categoryName, Set<Product> product) {
        this.id = id;
        this.categoryName = categoryName;
        this.product = product;
    }

    public ProductCategory() {
    }

    public void saveProduct(Product product){
        getProduct().add(product);
    }

    @JsonManagedReference
    public Set<Product> getProduct() {
        return product;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }


    public void setProduct(Set<Product> product) {
        this.product = product;
    }
}

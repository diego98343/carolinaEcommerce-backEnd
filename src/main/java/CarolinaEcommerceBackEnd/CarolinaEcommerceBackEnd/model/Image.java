package CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;

import javax.persistence.*;
import java.util.List;


@Builder
@Entity
@Table(name="image")
@JsonPOJOBuilder
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="image_id")
    private int imageId;
    @Column(name="image_name")
    private String name;
    @Column(name="image_type")
    private String type;

    @Column(length = 50000000)
    private byte[] pictureByte;

    @OneToMany
    private List<Product> products;

    public Image(int imageId, String name, String type, byte[] pictureByte, List<Product> products) {
        this.imageId = imageId;
        this.name = name;
        this.type = type;
        this.pictureByte = pictureByte;
        this.products = products;
    }

    public Image() {
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public byte[] getPictureByte() {
        return pictureByte;
    }

    public void setPictureByte(byte[] pictureByte) {
        this.pictureByte = pictureByte;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}

package CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;

import javax.persistence.*;


@Builder
@Entity
@Table(name="image")
@JsonPOJOBuilder
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="image_id")
    private int id;
    @Column(name="image_name")
    private String name;
    @Column(name="image_type")
    private String type;

    @Column(length = 50000000)
    private byte[] pictureByte;


    public Image(int id, String name, String type, byte[] pictureByte) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.pictureByte = pictureByte;
    }

    public Image() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}

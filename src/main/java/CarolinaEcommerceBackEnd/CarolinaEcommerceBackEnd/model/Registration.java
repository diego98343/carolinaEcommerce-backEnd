package CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table( name="user_registration_form")
public class Registration {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private int phoneNumber;

    private String homeAddress;

    private String passWord;

    private String email;

    private Date dateOfBirth;


    public Registration(int id, String name, int phoneNumber, String homeAddress, String passWord, String email, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.homeAddress = homeAddress;
        this.passWord = passWord;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public Registration() {
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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}

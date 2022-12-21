package CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.controllers;


import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model.User;
import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.services.RegistrationRespoFile.UserService;
import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.services.productServiceFile.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class RegistrationController {


    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public ResponseEntity<User> addUser(@RequestBody User user){

        User userForm= userService.saveRegistration(user);

        return new ResponseEntity<User>(userForm,HttpStatus.CREATED);
    }

    @GetMapping("/getUsers")
    public ResponseEntity<List<User>> getAllUsers(){

        List<User> userList = userService.findAll();
        return new ResponseEntity<List<User>>(userList,HttpStatus.OK);

    }














}

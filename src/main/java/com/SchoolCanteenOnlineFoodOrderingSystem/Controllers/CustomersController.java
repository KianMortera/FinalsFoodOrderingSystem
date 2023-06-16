package com.SchoolCanteenOnlineFoodOrderingSystem.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomersController {

     @GetMapping("/register")
        public String register(){
            return "register";
    
}
}

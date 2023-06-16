package com.SchoolCanteenOnlineFoodOrderingSystem.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/index")
        public String index(){
            return "index";
        }
     @GetMapping("/login")
        public String login(){
            return "login";
        }
    @GetMapping("/foodMenu")
        public String foodMenu(){
            return "foodMenu";
        }
    @GetMapping("/nutritionalFacts")
        public String nutritionalFacts(){
            return "nutritionalFacts";
        }
    @GetMapping("/submit")
        public String submit(){
            return "submit";
        }
    @GetMapping("/orderedFood")
        public String orderedFood(){
            return "orderedFood";
        }
    @GetMapping("/payment")
        public String payment(){
            return "payment";
        }
   

    

    
}

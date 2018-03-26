package com.example.myproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CusomerController {
	@RequestMapping(value="/index")  
    public String get(){  
        return "index";  
    }  
	@RequestMapping(value="/pp")  
    public String geterror(){  
        return "pp";  
    }  
}

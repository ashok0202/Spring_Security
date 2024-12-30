package com.jsp.SpringSec.controller;

import com.sun.net.httpserver.HttpServer;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String getname(){
        return ("<h1> Hello World</h1>");
    }

//    public CsrfToken csrfToken(HTTPRequ httpServer){
//
//    }
}

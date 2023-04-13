package it.develhope.springboot.Spring.Boot.First.API4.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.net.InetSocketAddress;

@RestController
@RequestMapping("/api")
public class HeaderController {

    @GetMapping("/")
    public String getNameHost (@RequestHeader HttpHeaders headers){
        String header = String.valueOf(headers.get("host"));
        return header;
    }
    // Documentazione Postman: https://documenter.getpostman.com/view/26121086/2s93XvWjhi
}

package it.develhope.springboot.Spring.Boot.First.API4.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HeaderController {

    @GetMapping
    public String getNameHost (@RequestParam(required = true) String hostName, @RequestParam (required = true) String hostPort, @RequestHeader HttpHeaders headers){
        return "Hostname: " + headers.get(hostName) + ", host port: " + headers.get(hostPort);
    }
}

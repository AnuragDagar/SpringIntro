package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    // UC 1: GET Method - Simple Hello Message
    // Test with: curl localhost:8080/hello -w "\n"
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz!";
    }

    // UC 2: GET Method - Pass name as Query Parameter
    // Test with: curl localhost:8080/hello/query?name=Mark -w "\n"
    @GetMapping("/hello/query")
    public String sayHelloQuery(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz!";
    }


}

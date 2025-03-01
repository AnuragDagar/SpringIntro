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

    // UC 3: GET Method - Pass name as Path Variable
    // Test with: curl localhost:8080/hello/param/Mark -w "\n"
    @GetMapping("/hello/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz!";
    }

    // UC 4: POST Method - Pass firstName and lastName in the Body
    // Test with: curl -X POST -H "Content-Type: application/json" -d '{"firstName":"Mark","lastName":"Taylor"}' "http://localhost:8080/hello/post" -w "\n"
    @PostMapping("/hello/post")
    public String sayHelloPost(@RequestBody UserDTO userDTO) {
        return "Hello " + userDTO.getFirstName() + " " + userDTO.getLastName() + " from BridgeLabz!";
    }

    // UC 5: PUT Method - Pass first name as Path Variable and last name as Query Parameter
    // Test with: curl -X PUT localhost:8080/hello/put/Mark/?lastName=Taylor -w "\n"
    @PutMapping("/hello/put/{firstName}")
    public String sayHelloPut(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz!";
    }
}

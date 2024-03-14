package ro.sda.java64.demo2.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class HelloController {

    private final ResponseObject responseObject;

    @GetMapping("/hello")
    public ResponseObject helloWorld(){
        return responseObject;
    }
}

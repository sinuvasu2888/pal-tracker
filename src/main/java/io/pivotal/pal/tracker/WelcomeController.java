package io.pivotal.pal.tracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.*;


@RestController
public class WelcomeController {
    private final String hello;

    public WelcomeController(@Value("${WELCOME_MESSAGE}") String hello){
        this.hello=hello;

    }

    @GetMapping("/")

    public String sayHello() {
        return hello;
    }
}


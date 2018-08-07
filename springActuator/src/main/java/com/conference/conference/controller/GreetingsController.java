package com.conference.conference.controller;
import java.util.concurrent.atomic.AtomicLong;

import com.conference.conference.model.Greetings;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class GreetingsController {


    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/hello-world")
    @ResponseBody
    public Greetings sayHello(@RequestParam(name = "name", required = false, defaultValue = "Stranger") String name) {
        return new Greetings(counter.incrementAndGet(), String.format(template, name));
    }
}

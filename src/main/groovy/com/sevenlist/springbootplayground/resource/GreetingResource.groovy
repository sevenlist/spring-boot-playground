package com.sevenlist.springbootplayground.resource

import com.sevenlist.springbootplayground.service.GreetingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingResource {

    @Autowired
    private GreetingService greetingService

    @RequestMapping("/")
    String home() {
        greetingService.greet()
    }
}
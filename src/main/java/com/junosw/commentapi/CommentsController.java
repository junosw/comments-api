package com.junosw.commentapi;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;


@RestController
@EnableAutoConfiguration
public class CommentsController {


    /**
     * Root of our comments api
     * @return
     */
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

}

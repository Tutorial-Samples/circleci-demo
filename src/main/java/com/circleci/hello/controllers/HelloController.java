package com.circleci.hello.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * vbala created on 3/28/2020
 * Inside the package - com.circleci.hello.controllers
 **/
@RestController
public class HelloController {

    @GetMapping("/hello-circle-ci")
    public ResponseEntity getHelloCircleCI(){
        return new ResponseEntity("Hello Circle-CI !!!", HttpStatus.OK);
    }
}

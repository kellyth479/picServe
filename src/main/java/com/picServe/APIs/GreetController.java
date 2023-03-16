package com.picServe.APIs;

import java.io.InputStream;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @GetMapping(value = "/greet")
    public String greetUser(){
        return "hello world";
    }

    @GetMapping("/")
    public String root(){
        return "This is the root";
    }
    @GetMapping("/face")
    public String error(){
        return "face";
    }
    @GetMapping("/italyImage")
    @ResponseBody
    public ResponseEntity<InputStreamResource> getItalyImage() {
        MediaType contentType =  MediaType.IMAGE_PNG;
        InputStream in =  getClass().getResourceAsStream("/com/picServe/images/venice.png");
        return ResponseEntity.ok()
          .contentType(contentType)
          .body(new InputStreamResource(in));
    }
}

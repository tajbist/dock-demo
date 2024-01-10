package com.io;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class HomeController {
    @GetMapping("/home")
    public ResponseEntity<?> home() {
        return ResponseEntity.ok("Hello");
    }
}

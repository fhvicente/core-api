package com.example.coreapi;

import java.time.Instant;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/api/health")
public class HealthCheckController {

    @GetMapping
    public ResponseEntity<Payload> status() {
        return ResponseEntity.ok(
            new Payload(
                "core-api",
                "UP",
                Instant.now(),
                "Service is running"
            )
        );
    }

}

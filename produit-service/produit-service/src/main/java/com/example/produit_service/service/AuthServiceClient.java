package com.example.produit_service.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "auth-service")
public interface AuthServiceClient {

    @GetMapping("/auth/validate")
    ResponseEntity<?> validateToken(@RequestHeader("Authorization") String token);
}

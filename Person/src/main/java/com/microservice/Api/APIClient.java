package com.microservice.Api;

import com.microservice.DTO.Adhar;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.net.URI;

@FeignClient(value = "Adhar",url = "http://url")
public interface APIClient {
    @GetMapping("/get/{id}")
    public Adhar getAdharById(URI uri, @PathVariable int id);
}

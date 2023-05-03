package com.microservice.Cont;

import com.microservice.Api.APIClient;
import com.microservice.DTO.Adhar;
import com.microservice.DTO.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
@RestController
public class Controller1 {
    @Autowired
    MongoTemplate mongoTemplate;

    @Autowired
    private APIClient client;



    @PostMapping("/post")
    public Adhar save(@RequestBody Person person)
    {
        URI uri=URI.create("http://localhost:8081");
        Adhar adhar=client.getAdharById(uri,person.getAid());
        return adhar;
    }
}

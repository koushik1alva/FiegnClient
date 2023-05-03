package com.microservice.Cont;

import com.microservice.DTO.Adhar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @Autowired
    private MongoTemplate mongoTemplate;

    @PostMapping("save")
    public  Adhar save(@RequestBody  Adhar adhar)
    {
        return mongoTemplate.save(adhar);
    }

    @GetMapping("/get/{id}")
    public Adhar getAdharById(@PathVariable int id)
    {
        return mongoTemplate.findById(id, Adhar.class);
    }
}

package com.microservice.Cont;

import com.microservice.DTO.Langa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    MongoTemplate mongoTemplate;

    @PostMapping("/lol")
    public Langa save(@RequestBody Langa langa)
    {
        return  mongoTemplate.save(langa);
    }
}

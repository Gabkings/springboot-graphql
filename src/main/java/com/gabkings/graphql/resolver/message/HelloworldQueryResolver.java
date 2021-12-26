package com.gabkings.graphql.resolver.message;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.gabkings.graphql.dtos.MessageDTO;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class HelloworldQueryResolver implements GraphQLQueryResolver {

    public String getHelloWorld(){
        return "Hello world";
    }

    public String greetingMessage(String fname, String lname){
        return String.format("Hello %s %s", fname, lname);
    }

    public MessageDTO message(){
        return MessageDTO.builder().id(UUID.randomUUID()).text("Graphql is awesome").build();
    }
}

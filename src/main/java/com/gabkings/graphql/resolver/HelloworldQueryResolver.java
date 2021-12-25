package com.gabkings.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class HelloworldQueryResolver implements GraphQLQueryResolver {

    public String getHelloWorld(){
        return "Hello world";
    }
}

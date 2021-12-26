package com.gabkings.graphql.resolver.author;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.gabkings.graphql.dtos.AuthorDTO;
import com.gabkings.graphql.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class AuthorMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private AuthorService authorService;

    public UUID createAuthor(AuthorDTO authorDTO){
        return authorService.creatAuthor(authorDTO);
    }
}

package com.gabkings.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.gabkings.graphql.dtos.AuthorDTO;
import com.gabkings.graphql.services.AuthorService;
import com.gabkings.graphql.services.PostService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;


@Component
public class AuthorQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private AuthorService authorService;

    public List<AuthorDTO> authors (){
//        return Collections.singletonList(AuthorDTO.builder()
//                .id(UUID.randomUUID())
//                .email("gabworks51@gmail.com")
//                .name("Gitonga")
//                .build());
        return authorService.getAuthors();
    }
}

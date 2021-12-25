package com.gabkings.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.gabkings.graphql.dtos.AuthorDTO;
import com.gabkings.graphql.dtos.PostDTO;
import org.springframework.stereotype.Component;

import java.util.UUID;
@Component
public class PostFieldResolver implements GraphQLResolver<PostDTO> {

    public AuthorDTO author(PostDTO postDTO){
        return AuthorDTO.builder()
                .id(UUID.randomUUID())
                .email("gabworks51@gmail.com")
                .name("Gitonga")
                .build();
    }
}

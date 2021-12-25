package com.gabkings.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.coxautodev.graphql.tools.GraphQLResolver;
import com.gabkings.graphql.dtos.AuthorDTO;
import com.gabkings.graphql.dtos.PostDTO;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Component
public class AuthorFieldResolver implements GraphQLResolver<AuthorDTO> {

    public List<PostDTO> posts(AuthorDTO authorDTO){
        return Collections.singletonList(PostDTO.builder()
                .title("Post title")
                .category("Category")
                .description("Post description")
                .authorId(authorDTO.getId())
                .id(UUID.randomUUID())
                .build());
    }

}

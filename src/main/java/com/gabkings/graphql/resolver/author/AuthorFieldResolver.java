package com.gabkings.graphql.resolver.author;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.coxautodev.graphql.tools.GraphQLResolver;
import com.gabkings.graphql.dtos.AuthorDTO;
import com.gabkings.graphql.dtos.PostDTO;
import com.gabkings.graphql.models.Author;
import com.gabkings.graphql.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Component
public class AuthorFieldResolver implements GraphQLResolver<AuthorDTO> {
    @Autowired
    private PostService postService;

    public List<PostDTO> posts(AuthorDTO authorDTO){
        return postService.getAllPostByAuthorId(authorDTO.getId());
    }

}

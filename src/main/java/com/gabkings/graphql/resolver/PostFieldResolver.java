package com.gabkings.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.gabkings.graphql.dtos.AuthorDTO;
import com.gabkings.graphql.dtos.PostDTO;
import com.gabkings.graphql.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;
@Component
public class PostFieldResolver implements GraphQLResolver<PostDTO> {

    @Autowired
    private PostService postService;

    public AuthorDTO author(PostDTO postDTO) throws Exception {
        return postService.getAuthorById(postDTO.getAuthorId());
    }
}

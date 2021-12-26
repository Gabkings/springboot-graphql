package com.gabkings.graphql.resolver.post;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.gabkings.graphql.dtos.PostDTO;
import com.gabkings.graphql.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class PostMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private PostService postService;
    public UUID createPost(PostDTO postDTO){
        return postService.createPost(postDTO);
    }
}

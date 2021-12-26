package com.gabkings.graphql.resolver.post;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
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
public class PostQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private PostService postService;


    public List<PostDTO> recentPosts (int count, int offset){
//        return Collections.singletonList(PostDTO.builder()
//                .id(UUID.randomUUID())
//                .build());
        return postService.getAllRecentPosts(count, offset);
    }
}

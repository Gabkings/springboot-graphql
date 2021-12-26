package com.gabkings.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.gabkings.graphql.dtos.AuthorDTO;
import com.gabkings.graphql.dtos.PostDTO;
import com.gabkings.graphql.models.Author;
import com.gabkings.graphql.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PostQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private PostService postService;


//    public List<PostDTO> posts (Author author){
//        return Collections.singletonList(AuthorDTO.builder()
//                .id(UUID.randomUUID())
//                .email("gabworks51@gmail.com")
//                .name("Gitonga")
//                .build());
//        return postService.getAllPostByAuthorId(author);
//    }
}

package com.gabkings.graphql.services;

import com.gabkings.graphql.dtos.AuthorDTO;
import com.gabkings.graphql.dtos.PostDTO;
import com.gabkings.graphql.models.Author;

import java.util.List;
import java.util.UUID;

public interface PostService {
    List<PostDTO> getAllPostByAuthorId(UUID author);

    AuthorDTO getAuthorById(UUID authorId) throws Exception;

    List<PostDTO> getAllRecentPosts(int count, int offset);

    UUID createPost(PostDTO postDTO);
}

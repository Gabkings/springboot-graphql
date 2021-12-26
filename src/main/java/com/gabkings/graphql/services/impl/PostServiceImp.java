package com.gabkings.graphql.services.impl;

import com.gabkings.graphql.dtos.AuthorDTO;
import com.gabkings.graphql.dtos.PostDTO;
import com.gabkings.graphql.models.Author;
import com.gabkings.graphql.models.Post;
import com.gabkings.graphql.repositories.AuthorRepository;
import com.gabkings.graphql.repositories.PostRepository;
import com.gabkings.graphql.services.PostService;
import org.checkerframework.checker.formatter.FormatUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class PostServiceImp implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public List<PostDTO> getAllPostByAuthorId(UUID author) {
        List<Post> posts = postRepository.findByAuthor_Id(author);
        return posts.stream().map(post -> PostDTO.builder()
                .authorId(post.getAuthor().getId())
                .id(post.getId())
                .title(post.getTitle())
                .description(post.getDescription())
                .category(post.getCategory())
                .build()).collect(Collectors.toList());
    }

    @Override
    public AuthorDTO getAuthorById(UUID authorId) throws Exception {
        Optional<Author> authorOptional = authorRepository.findById(authorId);

        Author author = authorOptional.orElseThrow(() -> new Exception("User is not exist: " + authorId));

        return AuthorDTO.builder()
                .name(author.getName())
                .email(author.getEmail())
                .id(authorId)
                .build();
    }

    @Override
    public List<PostDTO> getAllRecentPosts(int count, int offset) {
        PageRequest of = PageRequest.of(offset, count);
        Page<Post> all = postRepository.findAll(of);
        return all.stream().map(post -> PostDTO.builder()
                .authorId(post.getAuthor().getId())
                .id(post.getId())
                .title(post.getTitle())
                .description(post.getDescription())
                .category(post.getCategory())
                .build()).collect(Collectors.toList());
    }
}

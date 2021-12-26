package com.gabkings.graphql.services.impl;

import com.gabkings.graphql.dtos.AuthorDTO;
import com.gabkings.graphql.models.Author;
import com.gabkings.graphql.repositories.AuthorRepository;
import com.gabkings.graphql.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public List<AuthorDTO> getAuthors() {

        List<Author> all = authorRepository.findAll();

        return all.stream()
                .map(author -> {
                    return AuthorDTO.builder()
                            .id(author.getId())
                            .name(author.getName())
                            .email(author.getEmail())
                            .build();
                }).collect(Collectors.toList());
    }

    @Override
    public UUID creatAuthor(AuthorDTO authorDTO) {
        Author newAuthor = Author.builder()
                .name(authorDTO.getName())
                .email(authorDTO.getEmail())
                .build();
        Author author = authorRepository.saveAndFlush(newAuthor);
        return author.getId();
    }
}

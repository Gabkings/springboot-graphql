package com.gabkings.graphql.services;

import com.gabkings.graphql.dtos.AuthorDTO;

import java.util.List;
import java.util.UUID;

public interface AuthorService {
    List<AuthorDTO> getAuthors();

    UUID creatAuthor(AuthorDTO authorDTO);
}

package com.gabkings.graphql.services;

import com.gabkings.graphql.dtos.AuthorDTO;

import java.util.List;

public interface AuthorService {
    List<AuthorDTO> getAuthors();
}

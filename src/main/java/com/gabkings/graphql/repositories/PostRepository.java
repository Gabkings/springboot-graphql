package com.gabkings.graphql.repositories;

import com.gabkings.graphql.models.Author;
import com.gabkings.graphql.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PostRepository extends JpaRepository<Post, UUID> {
    List<Post> findByAuthor_Id(UUID author);

}

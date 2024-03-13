package com.myblgs.myblg.repository;

import com.myblgs.myblg.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}

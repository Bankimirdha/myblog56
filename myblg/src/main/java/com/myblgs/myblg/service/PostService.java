package com.myblgs.myblg.service;

import com.myblgs.myblg.payload.PostDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    List<PostDto> findAllLists();


    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);


    void deletePostById(long id);
}

package com.xstreet.brotips.controller;

import com.xstreet.brotips.models.Post;
import com.xstreet.brotips.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/post")
public class PostController {

    @Autowired
    public PostService postService;
    @PostMapping("/")
    public ResponseEntity<Post> createPost(@RequestBody Post post){
        Post savedPost = postService.addPost(post);
        return new ResponseEntity<>(savedPost , HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<Post>> getAllPost(@RequestParam("size") Long pageSize , @RequestParam("num") Long pageNumber ){
        return new ResponseEntity<List<Post>>(postService.getPaginatedPosts(pageSize , pageNumber) , HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Post> getPostById(@PathVariable Long id){
        return new ResponseEntity<>(postService.getPostById(id), HttpStatus.OK);
    }

}

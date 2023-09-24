package com.xstreet.brotips.service;

import com.xstreet.brotips.models.Post;
import com.xstreet.brotips.repository.PostPaginationRepository;
import com.xstreet.brotips.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    public PostRepository postRepository;
    @Autowired
    public PostPaginationRepository postPaginationRepository;

    public Post addPost(Post post){
        return postRepository.save(post);
    }

    public Post getPostById(Long id){
        Optional<Post> post = postRepository.findById(id);
        return post.orElse(null);
    }

    public List<Post> getPaginatedPosts(Long pageSize , Long pageNumber){
        Pageable pageable = PageRequest.of(pageNumber.intValue() , pageSize.intValue());
        return postPaginationRepository.findAll(pageable).getContent();
    }
}

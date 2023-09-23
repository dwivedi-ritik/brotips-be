package com.xstreet.brotips.repository;

import com.xstreet.brotips.models.Post;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostPaginationRepository extends PagingAndSortingRepository<Post , Long> {
}

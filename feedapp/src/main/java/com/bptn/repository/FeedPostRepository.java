package com.bptn.repository;

import org.springframework.stereotype.Repository;

import com.bptn.models.Post;

@Repository
public interface FeedPostRepository extends FeedRepository {
	
	Post save (Post feed);

}

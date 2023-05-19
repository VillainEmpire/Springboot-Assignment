package com.geekster.Instagram.repo;

import com.geekster.Instagram.model.InstagramComment;
import com.geekster.Instagram.model.PostLike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILikeRepo extends JpaRepository<PostLike, Long> {
    long countByPost_PostId(Long postId);
}

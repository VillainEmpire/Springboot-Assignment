package com.geekster.Instagram.repo;


import com.geekster.Instagram.model.InstagramFollowing;
import com.geekster.Instagram.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFollowingRepo extends JpaRepository<InstagramFollowing, Long> {

    Long countByUser_userId(long userId);
}


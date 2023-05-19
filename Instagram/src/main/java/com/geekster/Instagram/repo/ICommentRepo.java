package com.geekster.Instagram.repo;

import com.geekster.Instagram.model.Admin;
import com.geekster.Instagram.model.InstagramComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICommentRepo extends JpaRepository<InstagramComment, Long> {
}

package com.geekster.Instagram.repo;


import com.geekster.Instagram.model.Admin;
import com.geekster.Instagram.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminRepo extends JpaRepository<Admin, Long> {
}

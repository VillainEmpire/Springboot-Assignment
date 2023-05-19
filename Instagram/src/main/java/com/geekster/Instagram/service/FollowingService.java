package com.geekster.Instagram.service;

import com.geekster.Instagram.model.InstagramFollowing;
import com.geekster.Instagram.model.User;
import com.geekster.Instagram.repo.IFollowerRepo;
import com.geekster.Instagram.repo.IFollowingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FollowingService {

    @Autowired
    IFollowingRepo followingRepo;

    public void saveFollowing(User myUser, User otherUser) {
        InstagramFollowing followingRecord = new InstagramFollowing(null,myUser,otherUser);
        followingRepo.save(followingRecord);
    }
}


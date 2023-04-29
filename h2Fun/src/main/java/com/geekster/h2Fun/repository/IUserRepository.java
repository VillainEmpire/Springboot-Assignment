package com.geekster.h2Fun.repository;

import com.geekster.h2Fun.models.Users;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IUserRepository extends CrudRepository <Users,Integer> {
    public List<Users> findByName(String name);

    //get above certain age
    public List<Users> findByAgeGreaterThan(Integer age);

    //Or
    public List<Users> findByNameOrAgeGreaterThan(String name, Integer age);

    //And
    public List<Users> findByNameAndAgeGreaterThan(String name, Integer age);
}

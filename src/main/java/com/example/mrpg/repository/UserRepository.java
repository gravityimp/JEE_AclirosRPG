package com.example.mrpg.repository;

import com.example.mrpg.model.UserDao;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserDao, Integer>
{
    UserDao findByUsername(String username);
}
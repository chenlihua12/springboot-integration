package com.example.mmrepo.dao;

import com.example.mmentity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: xu gang feng
 * @create: 2019-11-05 16:17
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {
}

package com.fullstack.userCrud.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fullstack.userCrud.Model.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long>{

}

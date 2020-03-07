package com.gb.crudMerge.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gb.crudMerge.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{

}

package com.springSecurity.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springSecurity.model.MyUser;

public interface UserRepository extends JpaRepository<MyUser,Integer> {

	public MyUser findByMyusername(String myusername);
}

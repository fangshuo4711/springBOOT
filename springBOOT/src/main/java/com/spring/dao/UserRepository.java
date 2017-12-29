package com.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	/**
	 * ahaah的分数是多少水电费
	 */
}

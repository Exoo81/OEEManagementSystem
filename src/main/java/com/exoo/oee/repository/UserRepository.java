package com.exoo.oee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exoo.oee.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}

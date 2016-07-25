package com.exoo.oee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exoo.oee.entity.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

}

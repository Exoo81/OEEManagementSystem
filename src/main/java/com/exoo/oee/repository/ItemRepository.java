package com.exoo.oee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exoo.oee.entity.Item;

public interface ItemRepository extends JpaRepository<Item, String> {

}

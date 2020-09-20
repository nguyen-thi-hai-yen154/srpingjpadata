package com.jpa.demospringjpa.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.demospringjpa.model.MCategory;

public interface MCategoryRepository extends JpaRepository<MCategory,Long> {

}

package com.jpa.demospringjpa.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.demospringjpa.model.TUser;

public interface TUserRepository extends JpaRepository<TUser, Long> {

}

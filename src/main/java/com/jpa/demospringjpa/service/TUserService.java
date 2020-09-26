package com.jpa.demospringjpa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.demospringjpa.model.TUser;
import com.jpa.demospringjpa.respository.TUserRepository;

@Service
@Transactional
public class TUserService {

	@Autowired
	private TUserRepository repoTUser;

	public List<TUser> listAll() {
		return repoTUser.findAll();
	}

	public void save(TUser TUser) {
		repoTUser.save(TUser);
	}

	public TUser get(Long id) {
		return repoTUser.findById(id).get();
	}

	public void delete(Long id) {
		repoTUser.deleteById(id);
	}

	public List<TUser> searchUser(String name) {
		return repoTUser.searchUser(name);
	}
}

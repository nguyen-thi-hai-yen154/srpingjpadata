package com.jpa.demospringjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jpa.demospringjpa.model.MCategory;
import com.jpa.demospringjpa.model.Product;
import com.jpa.demospringjpa.respository.MCategoryRepository;

@Service
@Transactional
public class MCategoryService {
	@Autowired
	private MCategoryRepository repo;
	 public List<MCategory> listAll() {
	        return repo.findAll();
	    }

	    public void save(MCategory mCategory) {
	        repo.save(mCategory);
	    }

	    public MCategory get(long id) {
	        return repo.findById(id).get();
	    }

	    public void delete(long id) {
	        repo.deleteById(id);
	    }
}

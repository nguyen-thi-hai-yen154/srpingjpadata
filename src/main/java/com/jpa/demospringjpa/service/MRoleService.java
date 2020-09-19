package com.jpa.demospringjpa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.demospringjpa.model.MRole;
import com.jpa.demospringjpa.respository.MRoleRepository;



@Service
@Transactional
public class MRoleService {

	@Autowired
	MRoleRepository mRoleRepo;

	public List<MRole> listAll() {
        return mRoleRepo.findAll();
    }

    public void save(MRole mRole) {
    	mRoleRepo.save(mRole);
    }

    public MRole get(long id) {
        return mRoleRepo.findById(id).get();
    }

    public void delete(long id) {
    	mRoleRepo.deleteById(id);
    }
}

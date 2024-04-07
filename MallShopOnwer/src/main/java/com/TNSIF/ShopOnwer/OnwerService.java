package com.TNSIF.ShopOnwer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import jakarta.transaction.Transactional;

@Service
@Transactional
public class OnwerService {
	@Autowired
	private OnwerRepo repo;
	public List<Onwer> listAll(){
		return repo.findAll();
	}
	public void save(Onwer own) {
		repo.save(own);
	}
	public Onwer get(Integer id) {
		return repo.findById(id).get();
	}
	public void delete(Integer id) {
		repo.deleteById(id);
	}
	public void update(Onwer own)
	{
		repo.save(own);
	}
	
	
}

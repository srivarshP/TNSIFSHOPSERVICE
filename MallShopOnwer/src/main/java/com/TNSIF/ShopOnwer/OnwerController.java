package com.TNSIF.ShopOnwer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.persistence.NoResultException;

@Controller
public class OnwerController {
	@Autowired
	private OnwerService own;
	@GetMapping("/onwerservice")
	public List<Onwer> list()
	{
		return own.listAll();
	}
	@PostMapping("ownerservice")
	public void add(@RequestBody Onwer own1) {
		own.save(own1);
	}
	@GetMapping("/onwerservice/{id}")
		public ResponseEntity<Onwer>get(@PathVariable Integer id){
		try {
			Onwer o=own.get(id);
			return new ResponseEntity<Onwer>(o,HttpStatus.OK);
		}
		catch(NoResultException e) {
			return new ResponseEntity<Onwer>(HttpStatus.NOT_FOUND);
		}	
	}	
	@DeleteMapping("/onwerservice/{id}")
	public void delete(@PathVariable Integer id)
	{
		own.delete(id);
	}
	@PutMapping("/customerservice/{id}")
	public ResponseEntity<Onwer>update(@PathVariable Integer id, @RequestBody Onwer update_o){
		try {
			Onwer exist_o=own.get(id);
			exist_o.setCname(update_o.getCname());
			exist_o.setPname(update_o.getPname());
			exist_o.setMoney(update_o.getMoney());
			own.update(exist_o);
			return new ResponseEntity<Onwer>(exist_o,HttpStatus.OK);
		}
		catch(NoResultException e) {
			return new ResponseEntity<Onwer>(HttpStatus.NOT_FOUND);
		} 
	}
}

package com.main.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.main.entity.NewAccount;
import com.main.service.NewAccountServiceInterface;

@RestController
public class NewAccountController {

	@Autowired
	private NewAccountServiceInterface ser;
	
	@PostMapping("/create")
	public NewAccount createAccount(@RequestBody NewAccount account) {
		
		NewAccount acc = ser.createAccount(account);
		return acc;
	}
	
	@GetMapping("/getDetails")
	public List<NewAccount> getAccountDetails(){
		List<NewAccount> acc = ser.getNewAccountDetails();
		
		return acc;
	}
	
	@PutMapping("/update")
	public int updateAccount(@RequestParam Double balance, @RequestParam Integer id) {
		int ids = ser.updateNewAccount(balance, id);
		return ids;
		
	}
	
	@DeleteMapping("/delete")
	public int deleteNewAccount(@RequestParam String name) {
		
		int count = ser.deleteNewAccount(name);
		return count;
		
		
	}
}
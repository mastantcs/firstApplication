package com.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.NewAccount;
import com.main.repository.NewAccountRepositoryInterface;

@Service
public class NewAccountServiceInterfaceImpl implements NewAccountServiceInterface {

	@Autowired
	private NewAccountRepositoryInterface repo;
	
	@Override
	public NewAccount createAccount(NewAccount account) {
		
		NewAccount acc = repo.save(account);
		return acc;
	}

	@Override
	public List<NewAccount> getNewAccountDetails() {
		
		List<NewAccount> acc = repo.findAll();
		return acc;
	}

	@Override
	public int updateNewAccount(Double balance, Integer id) {
		int ids = repo.updateNewAccount(balance, id);
		return ids;
	}
	
	@Override
	public int deleteNewAccount(String name) {
		
		int count =repo.deleteNewAccount(name);
		return count;
	}

}

package com.main.service;

import java.util.List;

import com.main.entity.NewAccount;

public interface NewAccountServiceInterface {

	public NewAccount createAccount(NewAccount account);
	public List<NewAccount> getNewAccountDetails();
	public int updateNewAccount(Double balance, Integer id);
	public int deleteNewAccount(String name);
}

package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.main.entity.NewAccount;

import jakarta.transaction.Transactional;

@Repository
public interface NewAccountRepositoryInterface extends JpaRepository<NewAccount, Integer>{
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE NEW_ACCOUNT SET BALANCE=:balance WHERE ID=:id",nativeQuery = true)
	public int updateNewAccount(@Param("balance") Double balance, @Param("id") Integer id);
	
	@Transactional
	@Modifying
	@Query(value="DELETE FROM NEW_ACCOUNT WHERE A_HOLDER_NAME=:name",nativeQuery = true)
	public int deleteNewAccount(@Param("name") String name);

}

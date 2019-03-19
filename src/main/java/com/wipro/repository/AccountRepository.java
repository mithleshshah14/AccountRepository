package com.wipro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wipro.model.Account;
import com.wipro.model.Entity.AccountEntity;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, String>{

}

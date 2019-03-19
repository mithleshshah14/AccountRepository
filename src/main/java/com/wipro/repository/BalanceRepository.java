package com.wipro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.model.Entity.BalanceEntity;

@Repository
public interface BalanceRepository extends JpaRepository<BalanceEntity, Double>{
	public BalanceEntity findByAccountEntityId(String id);
}

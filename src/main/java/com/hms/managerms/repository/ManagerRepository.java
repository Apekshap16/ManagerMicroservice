package com.hms.managerms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hms.managerms.model.Manager;


@Repository
public interface ManagerRepository extends JpaRepository<Manager, String> {
	
	public Optional<Manager> findById(String id);

}

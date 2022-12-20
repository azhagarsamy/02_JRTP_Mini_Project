package com.azhagar.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import com.azhagar.entity.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

	List<Customer> findByPlanId();

	List<Customer> findByPlanStatusId();

	@Query("from Customer where planId=:planId and planStatusId=:planstatusId")
	List<Customer> findCustomerByPlan_StatusId(int planId, int planstatusId);
}

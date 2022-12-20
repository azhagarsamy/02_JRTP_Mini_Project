package com.azhagar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azhagar.entity.Customer;
import com.azhagar.repository.ICustomerRepository;


@Service
public class CustomerServiceImpl implements ICusmerService {

	@Autowired
	private ICustomerRepository repo;
	
	@Override
	public List<Customer> findCustomerByPlanId(int planId) {
		return repo.findByPlanId();
	}

	@Override
	public List<Customer> findCustomerByPlanStatusId(int planStatusId) {
		return repo.findByPlanStatusId();
	}

	@Override
	public List<Customer> findCustomerByPlan_StatusId(int planId, int planstatusId) {
		return repo.findCustomerByPlan_StatusId(planId, planstatusId);
	}

	@Override
	public void downloadExcel(List<Customer> customers) {
		// TODO Auto-generated method stub

	}

	@Override
	public void downloadPdf(List<Customer> customers) {
		// TODO Auto-generated method stub

	}

}

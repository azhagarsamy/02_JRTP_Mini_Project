package com.azhagar.service;

import java.util.List;

import com.azhagar.entity.Customer;

public interface ICusmerService {

	List<Customer> findCustomerByPlanId(int planId);

	List<Customer> findCustomerByPlanStatusId(int planStatusId);

	List<Customer> findCustomerByPlan_StatusId(int planId, int planstatusId);

	void downloadExcel(List<Customer> customers);

	void downloadPdf(List<Customer> customers);

}

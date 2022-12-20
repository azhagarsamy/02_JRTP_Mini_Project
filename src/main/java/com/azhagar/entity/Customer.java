package com.azhagar.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tbl_Customer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	@Id
	@GeneratedValue
	@Column(name="col_customerid")
	private Integer customerId;
	
	private String name;
	private String email;
	private String mobileNumber;
	private Character Gender;
	private Long SSN;
	private Integer planId;
	private Integer planStatusId;
}

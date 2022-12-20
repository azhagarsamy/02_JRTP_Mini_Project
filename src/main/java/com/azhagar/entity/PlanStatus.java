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
@Table(name="tbl_planstatus")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlanStatus {
	@Id
	@GeneratedValue
	@Column(name="col_planid")
	private  Integer planId;
	
	@Column(name="col_planname")
	private String planName;

}

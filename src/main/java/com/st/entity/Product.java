package com.st.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Product {
	
	@Id
	@NonNull
	//@GeneratedValue
	private Integer prodId;
	@NonNull
	@Column(length=15)
	private String prodName;
	@NonNull
	@Column(length = 15)
	private String comName;
	@NonNull
	private Double prodCost;
	
	public Product(@NonNull String prodName, @NonNull String comName, @NonNull Double prodCost) {
		this.prodName = prodName;
		this.comName = comName;
		this.prodCost = prodCost;
	} 
	
}

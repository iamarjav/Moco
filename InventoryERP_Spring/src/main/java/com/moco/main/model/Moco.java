package com.moco.main.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Moco {
	private Integer mocoId;
	private String mocoName;
	private String mocoDesc;
	private double mocoPrice;
	private int mocoQty;
}

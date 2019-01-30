package com.rsouza01.imageservice.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Image {
	
	@Getter @Setter
	private int id;
	
	@Getter @Setter
	private String title;
	
	@Getter @Setter
	private String url;
	
}
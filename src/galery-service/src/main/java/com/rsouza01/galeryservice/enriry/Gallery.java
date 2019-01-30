package com.rsouza01.galeryservice.enriry;


import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Gallery {

	@Getter @Setter
	private int id;
	
	@Getter @Setter
	private  List<Object> images;
}
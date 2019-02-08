package com.rsouza01.imageservice;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.rsouza01.imageservice.controllers.HomeController;


public class HomeControllerTest extends ImageServiceApplicationTests {

	private MockMvc mockMvc;
	
	@Autowired
	private HomeController homeController;
	
	@Before
	public void setUp() {
		
		this.mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();
	}
	
	@Test
	public void testGETImages() throws Exception {
		
		this.mockMvc.perform(MockMvcRequestBuilders.get("/images")).andExpect(MockMvcResultMatchers.status().isOk());
	}
}
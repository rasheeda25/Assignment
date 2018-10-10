package com.myfirstboot.eg.com.myfirstboot.eg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@Autowired	
	MyConfiguration cfg;
	
	@GetMapping("/test")
	public String met()
	{
		return "This is WebService Endpoint"+" "+cfg;
	}

}

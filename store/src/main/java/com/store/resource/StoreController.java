package com.store.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store")
public class StoreController {
	
	@RequestMapping(value="/test")
	public String test(){
		 return "test";
	}

}

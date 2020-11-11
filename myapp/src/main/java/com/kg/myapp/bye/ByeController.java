package com.kg.myapp.bye;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

	@Controller
	public class ByeController {
		
		@Autowired
		IByeService byeService;
		
		
		public void sayBye(String message) {
			System.out.println(byeService.sayBye(message));
		}

	}

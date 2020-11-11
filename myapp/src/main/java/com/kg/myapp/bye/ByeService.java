package com.kg.myapp.bye;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.springframework.stereotype.Service;

	@Service
	public class ByeService implements IByeService {

		@Override
		public String sayBye(String message) {
			return "Bye " +message;
		}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
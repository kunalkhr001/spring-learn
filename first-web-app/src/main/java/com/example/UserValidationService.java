package com.example;

import org.springframework.stereotype.Service;

@Service
public class UserValidationService {
	public boolean validate(String user)
	{
		if(user.equals("kk"))
			return true;
		return false;
	}
}

package com.dmantz.app;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringJdbcController {
	@Autowired
	private LoginDao loginDao;
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login() {
		//int k=loginDao.loginUser(userJson);
		System.out.println("welcome to controller");
		return "values inserted" ;
		
	}

}

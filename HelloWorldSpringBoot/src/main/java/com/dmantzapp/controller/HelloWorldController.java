package com.dmantzapp.controller;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@RequestMapping(value="/hello")
	public String hello() {
		return "hello welcome to spring boot";
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public  String login(@RequestBody JSONObject jobj) {
		
		//int k=loginDao.loginUser(userJson);
		//System.out.println("welcome to  login controller");
		try {
			String userName=(String)jobj.getString("userName");
			String password=(String)jobj.getString("password");
			System.out.println(userName);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "values inserted" ;
		
	}
}

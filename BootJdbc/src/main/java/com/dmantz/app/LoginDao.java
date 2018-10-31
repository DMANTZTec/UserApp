package com.dmantz.app;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class LoginDao {
	@Autowired
	private JdbcTemplate jt;
	
	
	

	public int loginUser(JSONObject userJson) {
		// TODO Auto-generated method stub
		String userName=null;
		String password=null;
		try {
			userName=(String)userJson.get("userName");
		 password=(String)userJson.get("password");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql="insert into userprofile values(?,?)";
		int k=jt.update(sql,userName,password);
		return k;
		}

}

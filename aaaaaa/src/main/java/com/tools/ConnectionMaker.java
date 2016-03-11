package com.tools;

import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class ConnectionMaker {

	JdbcTemplate jt;

	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	
	
	public void loadAll()
	{
		List l=jt.queryForList("select * from owner");
		Iterator it = l.iterator();
		while(it.hasNext())
		{
			Object o = it.next();
			System.out.println(o.toString());
		}
		
		
	}
	
	
	
	
}

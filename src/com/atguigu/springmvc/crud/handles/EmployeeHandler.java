package com.atguigu.springmvc.crud.handles;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atguigu.springmvc.crud.dao.EmployeeDao;

@Controller
public class EmployeeHandler {
	
	@Autowired
	private EmployeeDao employeedao;

	@RequestMapping("/emps")
	public String list(Map<String,Object> map) {
		map.put("employees", employeedao.getAll());
		return "list";
	}
}

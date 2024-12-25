package com.spring.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Employee {
	@Value("${employee.empName}")
	private String empName;
	@Value("${employee.empId}")
	private Integer empId;

	@Autowired
	private Address address;

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void printDetails() {
		System.out.println("empName:" + empName);
		System.out.println("empId:" + empId);
		String city = address.getCity();
		System.out.println("city:" + city);

		System.out.println("state:" + address.getState());
	}

}

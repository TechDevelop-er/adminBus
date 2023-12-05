package org.jsp.adminbusapp.service;

import org.jsp.adminbusapp.dao.AdminDao;
import org.jsp.adminbusapp.dto.Admin;
import org.jsp.adminbusapp.dto.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
	@Autowired
	private AdminDao adminDao;
	
	public ResponseEntity<ResponseStructure<Admin>> registerAdmin(Admin admin){
		ResponseStructure<Admin> structure=new ResponseStructure<>();
		structure.setData(adminDao.registerAdmin(admin));
		structure.setMessage("Admin Registered");
		structure.setStatusCode(HttpStatus.CREATED.value());
		return new ResponseEntity<ResponseStructure<Admin>>(structure, HttpStatus.CREATED);
	}
}
